package classschedulingsystem;

public class ClassSchedulingSystem {

    private final int id;
    private String firstname;
    private String lastname;
    private String middleinitial;
    private String email;
    private String contact;
    private String sex;
    private String birth;
    private String rank;
    
    public ClassSchedulingSystem(int ID, String firstname, String lastname, String middleinitial, String email, String contact, String sex, String birth,String rank)
    {
        id=ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middleinitial = middleinitial;
        this.email = email;
        this.contact = contact;
        this.sex = sex;
        this.birth = birth;
        this.rank = rank;
    }
    
    public int getId()
    {
        return id;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public String getMiddleinitial()
    {
        return middleinitial;
    }
    public String getEmail()
    {
        return email;
    }
    public String getContact()
    {
        return contact;
    }
    public String getSex()
    {
        return sex;
    }
    public String getBirth()
    {
        return birth;
    }
    public String getRank()
    {
        return rank;
    }
}
