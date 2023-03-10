package classschedulingsystem;

import StudentInformationSystem.JavaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Delete_Schedule extends javax.swing.JFrame {
    
    Statement st= null;
    ResultSet rs= null;
    PreparedStatement pst=null;
    Connection conn = null;
    
    public Delete_Schedule() {
        initComponents();
        conn = JavaDB.getConnection();
        showScheduling();
    }
    
    public ArrayList<Scheduling> getScheduling() {
        ArrayList<Scheduling> Schedule = new ArrayList<>();
        Connection connection = JavaDatabaseConnection.getConnection();
        String query = "SELECT * FROM schedule";
        try 
        {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Scheduling user;
            while (rs.next()) {
                user = new Scheduling(rs.getInt("ID"),rs.getString("STRAND"), rs.getString("TEACHER_ID"), rs.getString("DAY"), rs.getString("TIME"), rs.getString("SUBJECT"), rs.getString("TEACHER"));
                Schedule.add(user);
            }

        } 
        catch (SQLException e) 
        {
            
        }
        return Schedule;
    }
    
    public void showScheduling() {
        ArrayList<Scheduling> list = getScheduling();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < list.size(); i++) 
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getStrand();
            row[2] = list.get(i).getTeacherId();
            row[3] = list.get(i).getDay();
            row[4] = list.get(i).getTime();
            row[5] = list.get(i).getSubject();
            row[6] = list.get(i).getTeacher();

            model.addRow(row);
        }
    }   
    
    public void executequery(String query, String message) {
        Connection con = JavaDatabaseConnection.getConnection();
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) 
            {
                JOptionPane.showMessageDialog(null, "Data " + message + "Successfully");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                showScheduling();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Data not " + message);
            }
        } 
        catch (SQLException e) 
        {
             e.printStackTrace();
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fid = new javax.swing.JTextField();
        fsubject = new javax.swing.JTextField();
        fteacher = new javax.swing.JTextField();
        fstrand = new javax.swing.JTextField();
        fteacherid = new javax.swing.JTextField();
        fday = new javax.swing.JTextField();
        ftime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Schedule");
        setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "STRAND", "TEACHER_ID", "DAY", "TIME", "SUBJECT", "TEACHER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 539, -1));

        fid.setEditable(false);
        fid.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fid.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 83, 179, -1));

        fsubject.setEditable(false);
        fsubject.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fsubject.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 292, 179, -1));

        fteacher.setEditable(false);
        fteacher.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fteacher.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 335, 179, -1));

        fstrand.setEditable(false);
        fstrand.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fstrand.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fstrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 126, 179, -1));

        fteacherid.setEditable(false);
        fteacherid.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fteacherid.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fteacherid, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 163, 179, -1));

        fday.setEditable(false);
        fday.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fday.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fday, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 206, 179, -1));

        ftime.setEditable(false);
        ftime.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ftime.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(ftime, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 249, 179, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 83, -1, 25));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STRAND:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 127, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DAY:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 207, 35, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TEACHER_ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 164, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SUBJECT:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 293, 64, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TEACHER:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 336, -1, -1));

        jButton1.setBackground(new java.awt.Color(15, 148, 178));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Trash-icon.png"))); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 130, 33));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCHEDULE LISTS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 50));

        jButton2.setBackground(new java.awt.Color(15, 148, 178));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/home-back-icon.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 111, 33));

        jButton3.setBackground(new java.awt.Color(15, 148, 178));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Delete-icon.png"))); // NOI18N
        jButton3.setText("DELETE ALL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 170, 33));

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField1.setText("Search Teachers Name Here...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 240, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String query = "DELETE FROM `schedule` WHERE ID = '" + fid.getText() + "'";
           executequery(query, " Deleted ");
           fid.setText(null);
           fstrand.setText(null);
           fteacherid.setText(null);
           fday.setText(null);
           ftime.setText(null);
           fsubject.setText(null);
           fteacher.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();

        TableModel model = jTable1.getModel();
        fid.setText(model.getValueAt(i,0).toString());
        fstrand.setText(model.getValueAt(i, 1).toString());
        fteacherid.setText(model.getValueAt(i, 2).toString());
        fday.setText(model.getValueAt(i, 3).toString());
        ftime.setText(model.getValueAt(i, 4).toString());
        fsubject.setText(model.getValueAt(i, 5).toString());
        fteacher.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String query = "DELETE FROM `schedule` WHERE TEACHER = '" + fteacher.getText() + "'";
           executequery(query, " Deleted ");
           fid.setText(null);
           fstrand.setText(null);
           fteacherid.setText(null);
           fday.setText(null);
           ftime.setText(null);
           fsubject.setText(null);
           fteacher.setText(null);
           this.setVisible(false);
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try{
            String resulta = jTextField1.getText();
            if(resulta.matches("^[0-9]+$")){
                String query = "SELECT * FROM schedule WHERE ID = " + resulta;
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else{
                String query = "SELECT * FROM schedule WHERE TEACHER LIKE '%" + resulta + "%'";
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                if(pst!=null){
                    rs.close();
                    pst.close();
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(Delete_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fday;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fstrand;
    private javax.swing.JTextField fsubject;
    private javax.swing.JTextField fteacher;
    private javax.swing.JTextField fteacherid;
    private javax.swing.JTextField ftime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
