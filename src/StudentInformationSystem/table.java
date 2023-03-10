package StudentInformationSystem;

public class table {
    private final int lrn;
    private String last;
    private String first;
    private String middle;
    
    public table (int lrn,String last,String first,String middle){
        this.lrn = lrn;
        this.last = last;
        this.first = first;
        this.middle = middle;
    }
    
    public int getLrn(){
        return lrn;
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

}
