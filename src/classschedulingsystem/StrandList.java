/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedulingsystem;

/**
 *
 * @author Dell_PC
 */
public class StrandList {
    
    private final int no;
    private String strand;

    
    public StrandList(int no,String strand)
    {
        this.no = no;
        this.strand = strand;

    }
    
    public int getNo()
    {
        return no;
    }
    public String getStrand()
    {
        return strand;
    }

    
}
