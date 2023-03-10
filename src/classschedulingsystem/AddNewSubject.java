/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedulingsystem;

/**
 *
 * @author AKKLE
 */
public class AddNewSubject {
    private final int no;
    private String subject;
    
    public AddNewSubject(int no,String subject)
    {            
       this.no = no;
       this.subject = subject;
    }
    
    public int getNo()
    {
        return no;
    }
    
    public String getSubject()
    {
        return subject;
    }
}
