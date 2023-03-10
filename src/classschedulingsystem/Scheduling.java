package classschedulingsystem;

public class Scheduling {
    
    private final int id;
    private String strand;
    private String teacherid;
    private String day;
    private String time;
    private String subject;
    private String teacher;
    
    public Scheduling(int ID, String strand, String teacherid, String day, String time, String subject, String teacher)
    {
        id = ID;
        this.strand = strand;
        this.teacherid = teacherid;
        this.day = day;
        this.time = time;
        this.subject = subject;
        this.teacher = teacher;
    }
    
    public int getId()
    {
        return id;
    }
    public String getStrand()
    {
        return strand;
    }
    public String getTeacherId()
    {
        return teacherid;
    }
    public String getDay()
    {
        return day;
    }
    public String getTime()
    {
        return time;
    }
    public String getSubject()
    {
        return subject;
    }
    public String getTeacher()
    {
        return teacher;
    }
}
