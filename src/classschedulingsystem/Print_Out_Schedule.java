package classschedulingsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Print_Out_Schedule extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    
    private void cstrand()
    {
    try{
    Connection con = JavaDatabaseConnection.getConnection();
    st =con.createStatement();
    String s = "select STRAND from ADDNEWSTRAND";
    rs = st.executeQuery(s);
    while(rs.next()){
        fstrand.addItem(rs.getString(1));
    }
   
    
    }
    catch(SQLException e){
       
    }   
    }
    
    private void cteacher()
    {
    try{
    Connection con = JavaDatabaseConnection.getConnection();
    
    st =con.createStatement();
    String s = "select FIRSTNAME, LASTNAME from TEACHER";
    rs = st.executeQuery(s);
    
    while(rs.next()){
        fteacher.addItem(rs.getString(1) + " " + rs.getString(2));
    }
    
   
   
    }
    catch(SQLException e){       
    }
    }
    public Print_Out_Schedule() {
        initComponents();
        cstrand();
        cteacher();
    }
        
    String teacher_mon78 = "";
    String strand_mon78 = "";
    String subject_mon78 = "";
    
    String teacher_tues78 = "";
    String strand_tues78 = "";
    String subject_tues78 = "";
    
    String teacher_wed78 = "";
    String strand_wed78 = "";
    String subject_wed78 = "";
    
    String teacher_thurs78 = "";
    String strand_thurs78 = "";
    String subject_thurs78 = "";
    
    String teacher_fri78 = "";
    String strand_fri78 = "";
    String subject_fri78 = "";
    
    String teacher_mon89 = "";
    String strand_mon89 = "";
    String subject_mon89 = "";
    
    String teacher_tues89 = "";
    String strand_tues89 = "";
    String subject_tues89 = "";
    
    String teacher_wed89 = "";
    String strand_wed89 = "";
    String subject_wed89 = "";
    
    String teacher_thurs89 = "";
    String strand_thurs89 = "";
    String subject_thurs89 = "";
    
    String teacher_fri89 = "";
    String strand_fri89 = "";
    String subject_fri89 = "";
    
    String teacher_mon910 = "";
    String strand_mon910 = "";
    String subject_mon910 = "";
    
    String teacher_tues910 = "";
    String strand_tues910 = "";
    String subject_tues910 = "";
    
    String teacher_wed910 = "";
    String strand_wed910 = "";
    String subject_wed910 = "";
    
    String teacher_thurs910 = "";
    String strand_thurs910 = "";
    String subject_thurs910 = "";
    
    String teacher_fri910 = "";
    String strand_fri910 = "";
    String subject_fri910 = "";
    
    String teacher_mon1130 = "";
    String strand_mon1130 = "";
    String subject_mon1130 = "";
    
    String teacher_tues1130 = "";
    String strand_tues1130 = "";
    String subject_tues1130 = "";
    
    String teacher_wed1130 = "";
    String strand_wed1130 = "";
    String subject_wed1130 = "";
    
    String teacher_thurs1130 = "";
    String strand_thurs1130 = "";
    String subject_thurs1130 = "";
    
    String teacher_fri1130 = "";
    String strand_fri1130 = "";
    String subject_fri1130 = "";
    
    String teacher_mon1230 = "";
    String strand_mon1230 = "";
    String subject_mon1230 = "";
    
    String teacher_tues1230 = "";
    String strand_tues1230 = "";
    String subject_tues1230 = "";
    
    String teacher_wed1230 = "";
    String strand_wed1230 = "";
    String subject_wed1230 = "";
    
    String teacher_thurs1230 = "";
    String strand_thurs1230 = "";
    String subject_thurs1230 = "";
    
    String teacher_fri1230 = "";
    String strand_fri1230 = "";
    String subject_fri1230 = "";
    
    String teacher_mon200 = "";
    String strand_mon200 = "";
    String subject_mon200 = "";
    
    String teacher_tues200 = "";
    String strand_tues200 = "";
    String subject_tues200 = "";
    
    String teacher_wed200 = "";
    String strand_wed200 = "";
    String subject_wed200 = "";
    
    String teacher_thurs200 = "";
    String strand_thurs200 = "";
    String subject_thurs200 = "";
    
    String teacher_fri200 = "";
    String strand_fri200 = "";
    String subject_fri200 = "";
    
    String teacher_mon300 = "";
    String strand_mon300 = "";
    String subject_mon300 = "";
    
    String teacher_tues300 = "";
    String strand_tues300 = "";
    String subject_tues300 = "";
    
    String teacher_wed300 = "";
    String strand_wed300 = "";
    String subject_wed300 = "";
    
    String teacher_thurs300 = "";
    String strand_thurs300 = "";
    String subject_thurs300 = "";
    
    String teacher_fri300 = "";
    String strand_fri300 = "";
    String subject_fri300 = "";

    String teacher_mon400 = "";
    String strand_mon400 = "";
    String subject_mon400 = "";
    
    String teacher_tues400 = "";
    String strand_tues400 = "";
    String subject_tues400 = "";
    
    String teacher_wed400 = "";
    String strand_wed400 = "";
    String subject_wed400 = "";
    
    String teacher_thurs400 = "";
    String strand_thurs400 = "";
    String subject_thurs400 = "";
    
    String teacher_fri400 = "";
    String strand_fri400 = "";
    String subject_fri400 = "";
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        prent = new javax.swing.JTextArea();
        q1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fstrand = new javax.swing.JComboBox<>();
        fteacher = new javax.swing.JComboBox<>();
        q2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prent.setColumns(20);
        prent.setFont(new java.awt.Font("Monospaced", 1, 8)); // NOI18N
        prent.setRows(5);
        jScrollPane1.setViewportView(prent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 420));

        q1.setBackground(new java.awt.Color(15, 148, 178));
        q1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/management.png"))); // NOI18N
        q1.setText("SHOW");
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, 44));

        jButton2.setBackground(new java.awt.Color(15, 148, 178));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/back.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, -1, -1));

        jButton3.setBackground(new java.awt.Color(15, 148, 178));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/printer.png"))); // NOI18N
        jButton3.setText("PRINT NOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        fstrand.setBackground(new java.awt.Color(15, 148, 178));
        fstrand.setForeground(new java.awt.Color(255, 255, 255));
        fstrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STRAND" }));
        getContentPane().add(fstrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 229, 44));

        fteacher.setBackground(new java.awt.Color(15, 148, 178));
        fteacher.setForeground(new java.awt.Color(255, 255, 255));
        fteacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEACHER" }));
        getContentPane().add(fteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 229, 40));

        q2.setBackground(new java.awt.Color(15, 148, 178));
        q2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/management.png"))); // NOI18N
        q2.setText("SHOW");
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        if(fstrand.getSelectedItem().equals("STRAND")){
            JOptionPane.showMessageDialog(null,"Please Select a Strand.");
            
        }
        else{
        try{
            
            String query = "select day, time, subject, teacher from schedule where strand = '"+fstrand.getSelectedItem()+"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                if (rs.getString(1).equals("MONDAY")){
                      if (rs.getString(2).equals("7:00-8:00 AM")){
                        
                          teacher_mon78 = rs.getString(4);
                          subject_mon78 = rs.getString(3);
                        
                        }
                       if (rs.getString(2).equals("8:00-9:00 AM")){
                        teacher_mon89 = rs.getString(4);
                          subject_mon89 = rs.getString(3);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        teacher_mon910 = rs.getString(4);
                          subject_mon910 = rs.getString(3);   
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        teacher_mon1130 = rs.getString(4);
                          subject_mon1130 = rs.getString(3);  
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        teacher_mon1230 = rs.getString(4);
                          subject_mon1230 = rs.getString(3);  
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        teacher_mon200 = rs.getString(4);
                          subject_mon200 = rs.getString(3);   
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        teacher_mon300 = rs.getString(4);
                          subject_mon300 = rs.getString(3);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        teacher_mon400 = rs.getString(4);
                          subject_mon400 = rs.getString(3);    
                        }
                        
                } if (rs.getString(1).equals("TUESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        teacher_tues78 = rs.getString(4);
                        subject_tues78 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        teacher_tues89 = rs.getString(4);
                        subject_tues89 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        teacher_tues910 = rs.getString(4);
                        subject_tues910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        teacher_tues1130 = rs.getString(4);
                        subject_tues1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        teacher_tues1230 = rs.getString(4);
                        subject_tues1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        teacher_tues200 = rs.getString(4);
                        subject_tues200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        teacher_tues300 = rs.getString(4);
                        subject_tues300 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        teacher_tues400 = rs.getString(4);
                        subject_tues400 = rs.getString(3); 
                        }
                } if (rs.getString(1).equals("WEDNESDAY")){
                        if (rs.getString(2).equals("7:00-8:00 AM")){
                        teacher_wed78 = rs.getString(4);
                        subject_wed78 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        teacher_wed89 = rs.getString(4);
                        subject_wed89 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        teacher_wed910 = rs.getString(4);
                        subject_wed910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        teacher_wed1130 = rs.getString(4);
                        subject_wed1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        teacher_wed1230 = rs.getString(4);
                        subject_wed1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        teacher_wed200 = rs.getString(4);
                        subject_wed200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        teacher_wed300 = rs.getString(4);
                        subject_wed300 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        teacher_wed400 = rs.getString(4);
                        subject_wed400 = rs.getString(3); 
                        }
                }if (rs.getString(1).equals("THURSDAY")){
                        if (rs.getString(2).equals("7:00-8:00 AM")){
                        teacher_thurs78 = rs.getString(4);
                        subject_thurs78 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        teacher_thurs89 = rs.getString(4);
                        subject_thurs89 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        teacher_thurs910 = rs.getString(4);
                        subject_thurs910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        teacher_thurs1130 = rs.getString(4);
                        subject_thurs1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        teacher_thurs1230 = rs.getString(4);
                        subject_thurs1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        teacher_thurs200 = rs.getString(4);
                        subject_thurs200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        teacher_thurs300 = rs.getString(4);
                        subject_thurs300 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        teacher_thurs400 = rs.getString(4);
                        subject_thurs400 = rs.getString(3); 
                        }
                }if (rs.getString(1).equals("FRIDAY")){
                        if(rs.getString(2).equals("7:00-8:00 AM")){
                        teacher_fri78 = rs.getString(4);
                        subject_fri78 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        teacher_fri89 = rs.getString(4);
                        subject_fri89 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        teacher_fri910 = rs.getString(4);
                        subject_fri910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        teacher_fri1130 = rs.getString(4);
                        subject_fri1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        teacher_fri1230 = rs.getString(4);
                        subject_fri1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        teacher_fri200 = rs.getString(4);
                        subject_fri200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        teacher_fri300 = rs.getString(4);
                        subject_fri300 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        teacher_fri400 = rs.getString(4);
                        subject_fri400 = rs.getString(3); 
                        }
                }
            }
            
        } catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
        }        
        }
        
            try{
                    Connection con = JavaDatabaseConnection.getConnection();
                    st =con.createStatement();
                    String s = "select SEMESTER, SCHOOLYEAR from YEARANDSEMESTER";
                    rs = st.executeQuery(s);
                    while(rs.next()){
                    String sem = rs.getString(1);
                    String year = rs.getString(2);
        prent.append(     "                                                         Republic of the Philippines"
                    +"\n"+"                                                           DEPARTMENT OF EDUCATION"
                    +"\n"+"                                                           National Capital Region"
                    +"\n"+"                                                         PASAY CITY WEST HIGH SCHOOL"
                    +"\n"+"                                                    F.B. Harrison, Pasay City, Metro Manila"
                    +"\n"+"                                                              SENIOR HIGH SCHOOL"
                    +"\n"+"                                                                  "+fstrand.getSelectedItem()
                    +"\n"+"                                                             SCHOOL YEAR:" + year
                    +"\n"+"                                                                 " + sem
                    +"\n"+""
                         +"TIME           |MONDAY                   Tuesday                   WEDNESDAY                    THURSDAY                   FRIDAY"                                                   
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                    
                    +"\n"+"               |"+teacher_mon78+"                   "+teacher_tues78+"                   "+teacher_wed78+"                   "+teacher_thurs78+"                   "+teacher_fri78
                    +"\n"+"07:00-08:00 AM |"
                    +"\n"+"               |"+subject_mon78+"                   "+subject_tues78+"                   "+subject_wed78+"                   "+subject_thurs78+"                   "+subject_fri78                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                    
                    +"\n"+"               |"+teacher_mon89+"                   "+teacher_tues89+"                   "+teacher_wed89+"                   "+teacher_thurs89+"                   "+teacher_fri89
                    +"\n"+"08:00-09:00 AM |"
                    +"\n"+"               |"+subject_mon89+"                   "+subject_tues89+"                   "+subject_wed89+"                   "+subject_thurs89+"                   "+subject_fri89                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                
                    +"\n"+"               |"+teacher_mon910+"                   "+teacher_tues910+"                   "+teacher_wed910+"                   "+teacher_thurs910+"                   "+teacher_fri910
                    +"\n"+"09:00-10:00 AM |"
                    +"\n"+"               |"+subject_mon910+"                   "+subject_tues910+"                   "+subject_wed910+"                   "+subject_thurs910+"                   "+subject_fri910                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                
                    +"\n"+"10:00-10:30 AM |"+"                                                 LUNCH BREAK                                                 "                   
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                   
                    +"\n"+"               |"+teacher_mon1130+"                   "+teacher_tues1130+"                   "+teacher_wed1130+"                   "+teacher_thurs1130+"                   "+teacher_fri1130                    
                    +"\n"+"10:30-11:30 AM |"            
                    +"\n"+"               |"+subject_mon1130+"                   "+subject_tues1130+"                   "+subject_wed1130+"                   "+subject_thurs1130+"                   "+subject_fri1130                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                    
                    +"\n"+"               |"+teacher_mon1230+"                   "+teacher_tues1230+"                   "+teacher_wed1230+"                   "+teacher_thurs1230+"                   "+teacher_fri1230                    
                    +"\n"+"11:30-12:30 PM |"                    
                    +"\n"+"               |"+subject_mon1230+"                   "+subject_tues1230+"                   "+subject_wed1230+"                   "+subject_thurs1230+"                   "+subject_fri1230                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"                   
                    +"\n"+"12:30-01:00 PM |"+"                                                 LUNCH BREAK                                                 "                    
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"
                    +"\n"+"               |"+teacher_mon200+"                   "+teacher_tues200+"                   "+teacher_wed200+"                   "+teacher_thurs200+"                   "+teacher_fri200
                    +"\n"+"01:00-02:00 PM |"
                    +"\n"+"               |"+subject_mon200+"                   "+subject_tues200+"                   "+subject_wed200+"                   "+subject_thurs200+"                   "+subject_fri200
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"
                    +"\n"+"               |"+teacher_mon300+"                   "+teacher_tues300+"                   "+teacher_wed300+"                   "+teacher_thurs300+"                   "+teacher_fri300
                    +"\n"+"02:00-03:00 PM |"
                    +"\n"+"               |"+subject_mon300+"                   "+subject_tues300+"                   "+subject_wed300+"                   "+subject_thurs300+"                   "+subject_fri300
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"
                    +"\n"+"               |"+teacher_mon400+"                   "+teacher_tues400+"                   "+teacher_wed400+"                   "+teacher_thurs400+"                   "+teacher_fri400
                    +"\n"+"03:00-04:00 PM |"
                    +"\n"+"               |"+subject_mon400+"                   "+subject_tues400+"                   "+subject_wed400+"                   "+subject_thurs400+"                   "+subject_fri400
                    +"\n----------------------------------------------------------------------------------------------------------------------------------------------------"
                    +"\n"
                    +"\n"
                    +"\n"
                    +"\n");
        
    }
   
    
    }
    catch(SQLException e){
    }       
    }//GEN-LAST:event_q1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Create_Schedule().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            
            if(prent.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please make sure the schedule is already showed");
            }
            else
            {           
            prent.print();
            q1.setEnabled(true);
            q2.setEnabled(true);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
         if(fteacher.getSelectedItem().equals("TEACHER")){
            JOptionPane.showMessageDialog(null,"Please Select a Teacher.");
   
        }
        else{
        try{
            
            String query = "select day, time, strand from schedule where teacher = '"+fteacher.getSelectedItem()+"'";
            rs = st.executeQuery(query);
            
            while(rs.next()){
                if (rs.getString(1).equals("MONDAY")){
                        if (rs.getString(2).equals("7:00-8:00 AM")){
                        strand_mon78 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        strand_mon89 = rs.getString(3);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        strand_mon910 = rs.getString(3);  
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        strand_mon1130 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        strand_mon1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        strand_mon200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        strand_mon300 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        strand_mon400 = rs.getString(3); 
                        }
                        
                } if (rs.getString(1).equals("TUESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        strand_tues78 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        strand_tues89 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        strand_tues910 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        strand_tues1130 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        strand_tues1230 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        strand_tues200 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        strand_tues300 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        strand_tues400 = rs.getString(3); 
                        }
                } if (rs.getString(1).equals("WEDNESDAY")){
                        if (rs.getString(2).equals("7:00-8:00 AM")){
                        strand_wed78 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        strand_wed89 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        strand_wed910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        strand_wed1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        strand_wed1230 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        strand_wed200 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        strand_wed300 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        strand_wed400 = rs.getString(3);
                        }
                }if (rs.getString(1).equals("THURSDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        strand_thurs78 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        strand_thurs89 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        strand_thurs910 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        strand_thurs1130 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        strand_thurs1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        strand_thurs200 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        strand_thurs300 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        strand_thurs400 = rs.getString(3);
                        }
                }if (rs.getString(1).equals("FRIDAY")){
                        if(rs.getString(2).equals("7:00-8:00 AM")){
                        strand_fri78 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        strand_fri89 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        strand_fri910 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        strand_fri1130 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        strand_fri1230 = rs.getString(3); 
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        strand_fri200 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        strand_fri300 = rs.getString(3);
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        strand_fri400 = rs.getString(3); 
                        }
                }
            }
            
        } catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
        }       
        }
         
         
         
         try{
                    Connection con = JavaDatabaseConnection.getConnection();
                    st =con.createStatement();
                    String s = "select SEMESTER, SCHOOLYEAR from YEARANDSEMESTER";
                    rs = st.executeQuery(s);
                    while(rs.next()){
                    String sem = rs.getString(1);
                    String year = rs.getString(2);
         prent.append("School Year:"+year
                +"\n"+sem
                +"\n"+"Teacher:"+fteacher.getSelectedItem()+"       "
                +"\n"+"Time/Day      |    Monday    Tuesday    Wednesday    Thursday    Friday    "
                +"\n"+"07:00-08:00 AM|   "+strand_mon78+"  "+strand_tues78+"  "+strand_wed78+"  "+strand_thurs78+"  "+strand_fri78
                +"\n"+"08:00-09:00 AM|   "+strand_mon89+"  "+strand_tues89+"  "+strand_wed89+"  "+strand_thurs89+"  "+strand_fri89
                +"\n"+"09:00-10:00 AM|   "+strand_mon910+"  "+strand_tues910+"  "+strand_wed910+"  "+strand_thurs910+"  "+strand_fri910
                +"\n"+"10:00-10:30 AM|                        Lunch Break"
                +"\n"+"10:30-11:30 AM|   "+strand_mon1130+"  "+strand_tues1130+"  "+strand_wed1130+"  "+strand_thurs1130+"  "+strand_fri1130
                +"\n"+"11:30-12:30 PM|   "+strand_mon1230+"  "+strand_tues1230+"  "+strand_wed1230+"  "+strand_thurs1230+"  "+strand_fri1230
                +"\n"+"12:30-01:00 PM|                        Lunch Break"
                +"\n"+"01:00-02:00 PM|   "+strand_mon200+"  "+strand_tues200+"  "+strand_wed200+"  "+strand_thurs200+"  "+strand_fri200
                +"\n"+"02:00-03:00 PM|   "+strand_mon300+"  "+strand_tues300+"  "+strand_wed300+"  "+strand_thurs300+"  "+strand_fri300
                +"\n"+"03:00-04:00 PM|   "+strand_mon400+"  "+strand_tues400+"  "+strand_wed400+"  "+strand_thurs400+"  "+strand_fri400
                +"\n"
                +"\n"
                +"\n");
         
       
    }
   
    
    }
    catch(SQLException e){
         
    }
    }//GEN-LAST:event_q2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Print_Out_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_Out_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_Out_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_Out_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print_Out_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fstrand;
    private javax.swing.JComboBox<String> fteacher;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea prent;
    private javax.swing.JButton q1;
    private javax.swing.JButton q2;
    // End of variables declaration//GEN-END:variables
}
