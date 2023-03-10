package StudentInformationSystem;

public class administrator {
    
    private final int id;
    private String name;
    private String user;
    private String pass;
    private String position;
    public administrator(int id,String name,String user,String pass,String position){
        this.id = id;
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.position = position;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUser(){
        return user;
    }
    public String getPass(){
        return pass;
    }
    public String getPosition(){
        return position;
    }
            
}
