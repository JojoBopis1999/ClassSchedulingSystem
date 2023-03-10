package classschedulingsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Strand_List extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    
public Strand_List() {
        initComponents();
        ListahanngSTRAND();
    }
    
final void ListahanngSTRAND(){
        try{

           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "SELECT * FROM ADDNEWSTRAND";
           
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fnotice = new javax.swing.JLabel();
        fstrand = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        finsert = new javax.swing.JButton();
        fupdate = new javax.swing.JButton();
        fdelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fclear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Strand");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW STRAND");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 45));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("STRAND:");

        fnotice.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fnotice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fstrand.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jList1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "Lists of Strands", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14)))); // NOI18N
        jList1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fstrand, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fnotice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fstrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

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
        getContentPane().add(finsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 130, 37));

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
        getContentPane().add(fupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, 37));

        fdelete.setBackground(new java.awt.Color(15, 148, 178));
        fdelete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fdelete.setForeground(new java.awt.Color(255, 255, 255));
        fdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/delete.png"))); // NOI18N
        fdelete.setText("DELETE");
        fdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(fdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 130, 37));

        jButton4.setBackground(new java.awt.Color(15, 148, 178));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/back.png"))); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 110, 37));

        fclear.setBackground(new java.awt.Color(15, 148, 178));
        fclear.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fclear.setForeground(new java.awt.Color(255, 255, 255));
        fclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/clear.png"))); // NOI18N
        fclear.setText("CLEAR");
        fclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fclearActionPerformed(evt);
            }
        });
        getContentPane().add(fclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 130, 37));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finsertActionPerformed
        if(fstrand.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Please Input New Strand");
        }
        else{
        try{
      
        Connection con= JavaDatabaseConnection.getConnection();
        st = con.createStatement();
        String SelectQuery = "SELECT * FROM ADDNEWSTRAND WHERE STRAND ='"+ fstrand.getText()+"'";
        rs = st.executeQuery(SelectQuery);
    
        if(rs.next()){
            //if the strand has a matched on the database...    
               JOptionPane.showMessageDialog(null, "Already Inserted","Insert Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //if the strand doesnt have a matched on the database... 
        try{
           String Query = "INSERT INTO ADDNEWSTRAND (STRAND) VALUES ('"+fstrand.getText()+"')";
           fnotice.setText("DATA INSERTED SUCCESSFULLY");
           st.execute(Query);
           ListahanngSTRAND();
           fstrand.setText(null);
           
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

    private void fupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fupdateActionPerformed
    try{
           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "UPDATE ADDNEWSTRAND SET STRAND = '"+fstrand.getText()+"' WHERE STRAND = '"+jList1.getSelectedValue()+"'";
           fnotice.setText("DATA UPDATED SUCCESSFULLY");
           st.execute(Query);
           ListahanngSTRAND();
           fstrand.setText(null);
           }
           catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_fupdateActionPerformed

    private void fdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdeleteActionPerformed
    try{
           Connection con = JavaDatabaseConnection.getConnection();
            st = con.createStatement();
           String Query = "DELETE  FROM ADDNEWSTRAND WHERE STRAND = ('"+jList1.getSelectedValue()+"')";
           fnotice.setText("DATA DELETED SUCCESSFULLY");
           st.execute(Query);
           ListahanngSTRAND();
           fstrand.setText(null);
           }
           catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_fdeleteActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
    try{ 
           Connection con = JavaDatabaseConnection.getConnection();
           st = con.createStatement();
           String Query = "SELECT STRAND FROM ADDNEWSTRAND WHERE STRAND = '"+jList1.getSelectedValue()+"'";
            rs = st.executeQuery(Query);
                     
           while(rs.next())
           {  
               fstrand.setText(rs.getString(1));
               
           }  
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_jList1ValueChanged

    private void fclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fclearActionPerformed
     fstrand.setText(null);
     fnotice.setText(null);
    }//GEN-LAST:event_fclearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    new Main_Admin().setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Strand_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Strand_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Strand_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Strand_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Strand_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fclear;
    private javax.swing.JButton fdelete;
    private javax.swing.JButton finsert;
    private javax.swing.JLabel fnotice;
    private javax.swing.JTextField fstrand;
    private javax.swing.JButton fupdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
