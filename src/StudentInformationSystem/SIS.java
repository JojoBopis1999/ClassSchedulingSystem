package StudentInformationSystem;

public class SIS {
    
    private final int lrn;
    private byte[] image;
    private String last;
    private String first;
    private String middle;
    private String age;
    private String sex;
    private String birth;
    private String ip;
    private String street;
    private String brgy;
    private String city;
    private String province;
    private String country;
    private String mother;
    private String father;
    private String guardian;
    private String cell;
    private String email;
    private String jhs;
    private String completion;
    private String jhsaddress;
    private String strand;
    
    public SIS(int lrn,
            byte[] image,
               String last,
               String first,
               String middle,
               String age,
               String sex,
               String birth,
               String ip,
               String street,
               String brgy,
               String city,
               String province,
               String country,
               String mother,
               String father,
               String guardian,
               String cell,
               String email,
               String jhs,
               String completion,
               String jhsaddress,
               String strand){
          
        this.lrn = lrn;
        this.image = image;
        this.last = last;
        this.first = first;
        this.middle = middle;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
        this.ip = ip;
        this.street = street;
        this.brgy = brgy;
        this.city = city;
        this.province = province;
        this.country = country;
        this.mother = mother;
        this.father = father;
        this.guardian = guardian;
        this.cell = cell;
        this.email = email;
        this.jhs = jhs;
        this.completion = completion;
        this.jhsaddress = jhsaddress;
        this.strand = strand;
    }
    
    public int getLrn(){
        return lrn;
    }
    public byte[] getImage(){
        return image;
    }
    public String getLast(){
        return last;
    }
    public String getFirst(){
        return first;
    }
    public String getMiddle(){
        return middle;
    }
    public String getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public String getBirth(){
        return birth;
    }
    public String getIp(){
        return ip;
    }
    public String getStreet(){
        return street;
    }
    public String getBrgy(){
        return brgy;
    }
    public String getCity(){
        return city;
    }
    public String getProvince(){
        return province;
    }
    public String getCountry(){
        return country;
    }
    public String getMother(){
        return mother;
    }
    public String getFather(){
        return father;
    }
    public String getGuardian(){
        return guardian;
    }
    public String getCell(){
        return cell;
    }
    public String getEmail(){
        return email;
    }
    public String getJhs(){
        return jhs;
    }
    public String getCompletion(){
        return completion;
    }
    public String getJhsaddress(){
        return jhsaddress;
    }
    public String getStrand(){
        return strand;
    }

}
