package classschedulingsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Add_New_Subject extends javax.swing.JFrame {
    
    Statement st; 
    ResultSet rs;
    
    public Add_New_Subject() {
        initComponents();
        ListahanngSUBJECT();
        ListahanngSUBJECTALL();
    }
    
    final void ListahanngSUBJECT(){
        try{

           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "SELECT * FROM ADDNEWSUBJECT";
           rs = st.executeQuery(Query);
           
           DefaultListModel listahan = new DefaultListModel();
           
           while(rs.next())
           {
               listahan.addElement(rs.getString(1));
           }
           jList1.setModel(listahan);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    final void ListahanngSUBJECTALL(){
        try{

           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "SELECT SUBJECTCODE, SUBJECT FROM ADDNEWSUBJECT";
           rs = st.executeQuery(Query);
           
           DefaultListModel listahan = new DefaultListModel();
           while(rs.next())
           {
               listahan.addElement(rs.getString(1)+"-"+rs.getString(2));
           }
           jList2.setModel(listahan);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        finsert = new javax.swing.JButton();
        fupdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fsub = new javax.swing.JTextField();
        flame = new javax.swing.JLabel();
        fsubcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Subject");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Subject");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 50));

        finsert.setBackground(new java.awt.Color(15, 148, 178));
        finsert.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        finsert.setForeground(new java.awt.Color(255, 255, 255));
        finsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/credit-card (1).png"))); // NOI18N
        finsert.setText("INSERT");
        finsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finsertActionPerformed(evt);
            }
        });
        getContentPane().add(finsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 130, -1));

        fupdate.setBackground(new java.awt.Color(15, 148, 178));
        fupdate.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fupdate.setForeground(new java.awt.Color(255, 255, 255));
        fupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/refresh.png"))); // NOI18N
        fupdate.setText("UPDATE");
        fupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fupdateActionPerformed(evt);
            }
        });
        getContentPane().add(fupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        jButton3.setBackground(new java.awt.Color(15, 148, 178));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/delete.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 130, -1));

        jButton4.setBackground(new java.awt.Color(15, 148, 178));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/home-back-icon.png"))); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, 120, -1));

        jButton5.setBackground(new java.awt.Color(15, 148, 178));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/clear.png"))); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 130, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("SUBJECT:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 124, -1, -1));

        fsub.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jPanel1.add(fsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 121, 612, -1));

        flame.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        flame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flame.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(flame, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 18, 338, 39));

        fsubcode.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jPanel1.add(fsubcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 73, 204, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("SUBJECT CODE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 73, -1, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 170));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lists of Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jList1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 260, 390));

        jList2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subjects Legends", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14)), new javax.swing.border.MatteBorder(null))); // NOI18N
        jList2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jList2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 660, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Main_Admin().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void finsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finsertActionPerformed
        if(fsub.getText().equals("")&&fsub.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Please Type Subject Code & Complete Subject Name");
        }  

        else
        {
           try{
      
        Connection con= JavaDatabaseConnection.getConnection();
        st = con.createStatement();
        String SelectQuery = "SELECT * FROM ADDNEWSUBJECT WHERE SUBJECTCODE ='"+ fsub.getText()+"'";
        rs = st.executeQuery(SelectQuery);
        if(rs.next()){
            //SUBJECTS matched...    
               JOptionPane.showMessageDialog(null, "Already Inserted this Subject","Insert Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //SUBJECTS do not match...
        try{
           

           
            
           String Query = "INSERT INTO ADDNEWSUBJECT (SUBJECTCODE, SUBJECT) VALUES ('"+fsubcode.getText()+"','"+fsub.getText()+"')";
           flame.setText("DATA INSERTED SUCCESSFULLY");
           st.execute(Query);
           ListahanngSUBJECT();
           ListahanngSUBJECTALL();
           fsubcode.setText(null);
           fsub.setText(null);
           }
           
           catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        }
    }//GEN-LAST:event_finsertActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            
            
           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "DELETE  FROM ADDNEWSUBJECT WHERE SUBJECTCODE = ('"+jList1.getSelectedValue()+"')";
           st.execute(Query);
           flame.setText("DATA DELETED SUCCESSFULLY");           
           ListahanngSUBJECT();
           ListahanngSUBJECTALL();
           fsubcode.setText(null);
           fsub.setText(null);
           }
           catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fupdateActionPerformed
       try{               
           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "UPDATE ADDNEWSUBJECT SET SUBJECTCODE = '"+fsubcode.getText()+"', SUBJECT = '"+fsub.getText()+"' WHERE SUBJECTCODE = '"+jList1.getSelectedValue()+"'";          
           st.execute(Query);
           flame.setText("DATA UPDATED SUCCESSFULLY");
           fsubcode.setText(null);
           fsub.setText(null);
           ListahanngSUBJECT();
           ListahanngSUBJECTALL();
           }
       catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_fupdateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           fsubcode.setText(null);
           fsub.setText(null);
           flame.setText(null);    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        try{ 
           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "SELECT SUBJECTCODE, SUBJECT FROM ADDNEWSUBJECT WHERE SUBJECTCODE = '"+jList1.getSelectedValue()+"'";
           rs = st.executeQuery(Query);
                     
           while(rs.next())
           {
               
               fsubcode.setText(rs.getString(1));
               fsub.setText(rs.getString(2));

           }
           
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jList1ValueChanged
    
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
            java.util.logging.Logger.getLogger(Add_New_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finsert;
    private javax.swing.JLabel flame;
    private javax.swing.JTextField fsub;
    private javax.swing.JTextField fsubcode;
    private javax.swing.JButton fupdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
