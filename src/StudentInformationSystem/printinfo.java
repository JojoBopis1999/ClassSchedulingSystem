package StudentInformationSystem;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class printinfo extends javax.swing.JFrame {
    
    String lrn1;
    String sem1;
    String year11;
    String year21;
    String last;
    String first;
    String middle;
    String age1;
    String sex1;
    String birth1;
    String ip1;
    String street1;
    String brgy1;
    String city1;
    String province1;
    String country1;
    String mother1;
    String father1;
    String guardian1;
    String cell1;
    String email1;
    String jhs1;
    String comp1;
    String jhsadd1;
    String strand1;

    public printinfo() {
        initComponents();
        lrn1 = String.valueOf(StudentInformation.lrn1);
        sem1 = String.valueOf(StudentInformation.sem1);
        year11 = String.valueOf(StudentInformation.year11);
        year21 = String.valueOf(StudentInformation.year21);
        last = String.valueOf(StudentInformation.last);
        first = String.valueOf(StudentInformation.first);
        middle = String.valueOf(StudentInformation.middle);
        age1 = String.valueOf(StudentInformation.age1);
        sex1 = String.valueOf(StudentInformation.sex1);
        birth1 = String.valueOf(StudentInformation.birth1);
        ip1 = String.valueOf(StudentInformation.ip1);
        street1 = String.valueOf(StudentInformation.street1);
        brgy1 = String.valueOf(StudentInformation.brgy1);
        city1 = String.valueOf(StudentInformation.city1);
        province1 = String.valueOf(StudentInformation.province1);
        country1 = String.valueOf(StudentInformation.country1);
        mother1 = String.valueOf(StudentInformation.mother1);
        father1 = String.valueOf(StudentInformation.father1);
        guardian1 = String.valueOf(StudentInformation.guardian1);
        cell1 = String.valueOf(StudentInformation.cell1);
        email1 = String.valueOf(StudentInformation.email1);
        jhs1 = String.valueOf(StudentInformation.jhs1);
        comp1 = String.valueOf(StudentInformation.comp1);
        jhsadd1 = String.valueOf(StudentInformation.jhsadd1);
        strand1 = String.valueOf(StudentInformation.strand1);
        jPanel2.setBackground(new Color(225,225,225,150));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ss = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Student Information");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        ss.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(ss);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 980, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Display-icon.png"))); // NOI18N
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Print-icon.png"))); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Arrow-Left-icon.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(919, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Background.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ss.setText("                           Department of Education"
           +"\n"+"                      Senior High School Enrollment Form"
           +"\n"+"                      "+sem1+" S.Y "+year11+"-"+year21
           +"\n"+""
           +"\n"+"School Name: Pasay City West High School"
           +"\n"+"Address: Pasadeña St., F.B. Harrison Pasay City"
           +"\n"+"School ID: 340643"
           +"\n"+""
           +"\n"+"TO THE STUDENT AND PARENT/GUARDIAN:Print legibly all information required. Submit accomplished form to the Senior High School (SHS) Focal Person."
           +"\n"+"I.STUDENT INFORMATION"
           +"\n"+""
           +"\n"+"1.LEARNER REFERENCE NUMBER (LRN):"+lrn1
           +"\n"+""
           +"\n"+"2.NAME OF STUDENT:Type fulll name in the following sequence: LAST, FIRST, MIDDLE."
           +"\n"+"LAST NAME:    "+last
           +"\n"+"FIRST NAME:   "+first
           +"\n"+"MIDDLE NAME:  "+middle
           +"\n"+""
           +"\n"+"3.AGE:"+age1+"            4.SEX:"+sex1+"              5.DATE OF BIRTH:"+birth1
           +"\n"+""
           +"\n"+"6.Belonging to any Indigenous People (IP) Community/Indigenous Cultural Community?:"+ip1
           +"\n"+""
           +"\n"+"7.PERMANENT HOME ADDRESS"
           +"\n"+"HOUSE NUMBER & STREET:    "+street1
           +"\n"+"SUBDIVISION/BARANGAY:     "+brgy1
           +"\n"+"CITY/MUNICIPALITY:        "+city1
           +"\n"+"PROVINCE:                 "+province1
           +"\n"+"COUNTRY:                  "+country1
           +"\n"+"8.PARENT/S or GUARDIAN'S NAME"
           +"\n"+"Mother's Name:    "+mother1
           +"\n"+"Father's Name:    "+father1
           +"\n"+"Guardian's Name:  "+guardian1
           +"\n"+""
           +"\n"+"9.CONTACT INFORMATION"
           +"\n"+"Cellphone Number: "+cell1
           +"\n"+"E-mail Address:   "+email1
           +"\n"+""
           +"\n"+"JUNIOR HIGH SCHOOL (JHS).Indicate where student completed fourth year high school/Grade 10. Fill in only boxes APPLICABLE"
           +"\n"+"I.JHS NAME(Do not abbreviate): "+jhs1
           +"\n"+"Month/Year of Completion: "+comp1
           +"\n"+"Address (City Municipality, Province and Country): "+jhsadd1
           +"\n"+"PROGRAM (Track-Strand or Specialization/s): "+strand1
           +"\n"+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ss.print();
        } catch (PrinterException ex) {
            Logger.getLogger(printinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new StudentInformation().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(printinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane ss;
    // End of variables declaration//GEN-END:variables
}
