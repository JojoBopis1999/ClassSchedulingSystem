package classschedulingsystem;

import StudentInformationSystem.JavaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class AddTeacher extends javax.swing.JFrame{

    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    Connection con;
    
public AddTeacher() {
        initComponents();
        con = JavaDB.getConnection();
        showTeacher();
     
    }

public ArrayList<ClassSchedulingSystem> getClassSchedulingSystem() {
        ArrayList<ClassSchedulingSystem> usersList = new ArrayList<>();
        Connection connection = JavaDatabaseConnection.getConnection();
        String query = "SELECT * FROM teacher";
        try 
        {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            ClassSchedulingSystem user;
            while (rs.next()) {
                user = new ClassSchedulingSystem(rs.getInt("ID"),rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("MIDDLEINITIAL"), rs.getString("EMAIL"), rs.getString("CONTACTNUMBER"), rs.getString("SEX"), rs.getString("BIRTHDAY"),rs.getString("RANKING"));
                usersList.add(user);
            }

        } 
        catch (SQLException e) 
        {
            
        }
        return usersList;
    }
    
public void showTeacher() {
        ArrayList<ClassSchedulingSystem> list = getClassSchedulingSystem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[9];

        for (int i = 0; i < list.size(); i++) 
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFirstname();
            row[2] = list.get(i).getLastname();
            row[3] = list.get(i).getMiddleinitial();
            row[4] = list.get(i).getEmail();
            row[5] = list.get(i).getContact();
            row[6] = list.get(i).getSex();
            row[7] = list.get(i).getBirth();
            row[8] = list.get(i).getRank();
         
            model.addRow(row);
        }
    }
    
public void executeQuery(String query, String message) {
        Connection con = JavaDatabaseConnection.getConnection();
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) 
            {
                JOptionPane.showMessageDialog(null, "Data " + message + "Successfully");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                showTeacher();
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

        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fid = new javax.swing.JTextField();
        ffirst = new javax.swing.JTextField();
        flast = new javax.swing.JTextField();
        fmiddle = new javax.swing.JTextField();
        femail = new javax.swing.JTextField();
        fcontact = new javax.swing.JTextField();
        fsex = new javax.swing.JComboBox<>();
        frank = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        fbirth = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teachers Lists");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextField1.setText("Search Teacher Lastname Here....");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 360, 40));

        jButton3.setBackground(new java.awt.Color(15, 148, 178));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/home-back-icon.png"))); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add new Teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18)), javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)))); // NOI18N

        fid.setEditable(false);
        fid.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ffirst.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        flast.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        fmiddle.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        femail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        fcontact.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        fsex.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        frank.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        frank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher 1", "Teacher 2", "Teacher 3", "Teacher 4", "Teacher 5", "Teacher 6", "Teacher 7", "Master Teacher 1", "Master Teacher 2", "Master Teacher 3", "Master Teacher 4" }));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel9.setText("FIRST NAME:");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("LAST NAME:");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("MIDDLE INITIAL:");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setText("EMAIL ADDRESS:");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("CONTACT NUMBER:");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("SEX:");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("BIRTHDAY:");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("POSITION:");

        jButton2.setBackground(new java.awt.Color(15, 148, 178));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/credit-card (1).png"))); // NOI18N
        jButton2.setText("INSERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(15, 148, 178));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/refresh.png"))); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(15, 148, 178));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/erase-128.png"))); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(15, 148, 178));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/delete.png"))); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        fbirth.setDateFormatString("yyyy-MM-dd");
        fbirth.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ffirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmiddle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fcontact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fsex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frank, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 620));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FIRSTNAME", "LASTNAME", "MIDDLEINITIAL", "EMAIL ADDRESS", "CONTACT NO.", "SEX", "BIRTHDAY", "POSITION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 640, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String date = ((JTextField)fbirth.getDateEditor().getUiComponent()).getText();
        
        if(ffirst.getText().equals("") || flast.getText().equals("") || femail.getText().equals("") ||
            fcontact.getText().equals("") || fsex.getSelectedItem().equals("") || date.equals("") || frank.getSelectedItem().equals("") ){
            JOptionPane.showMessageDialog(rootPane, "Please Complete out all the form");
        }
        else{
            try{
                con= JavaDatabaseConnection.getConnection();
                st = con.createStatement();
                String SelectQuery = "SELECT * FROM TEACHER WHERE LASTNAME ='"+ flast.getText()+"' AND FIRSTNAME = '" + ffirst.getText()+"' AND MIDDLEINITIAL ='" + fmiddle.getText()+"'" ;
                rs = st.executeQuery(SelectQuery);

                if(rs.next()){
                    //Teachers record matched...
                    JOptionPane.showMessageDialog(null, "This Teacher has already inserted","Insert Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    //Teachers record do not match...
                    String query = "INSERT INTO TEACHER(FIRSTNAME, LASTNAME, MIDDLEINITIAL, EMAIL, CONTACTNUMBER, SEX, BIRTHDAY, RANKING) VALUES "
                            + "('"+ffirst.getText()+"', '"+flast.getText()+"', '"+fmiddle.getText()+"' , '"+femail.getText()+"' , '"+fcontact.getText()
                            +"' , '"+fsex.getSelectedItem()+"' , '"+date+"' , '"+frank.getSelectedItem()+"')";
                    executeQuery(query, " INSERTED ");
                    ffirst.setText(null);
                    flast.setText(null);
                    fmiddle.setText(null);
                    femail.setText(null);
                    fcontact.setText(null);
                    fsex.setSelectedItem("MALE");
                    fbirth.setDate(null);
                    frank.setSelectedItem("Teacher 1");
                    fid.setText(null);
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String date = ((JTextField)fbirth.getDateEditor().getUiComponent()).getText();
        String query = "UPDATE TEACHER SET FIRSTNAME = '"+ffirst.getText()+"',LASTNAME = '"+flast.getText()+"',MIDDLEINITIAL = '"+fmiddle.getText()+"',EMAIL = '"+femail.getText()+ "',CONTACTNUMBER = '"+fcontact.getText()+"', SEX = '"+fsex.getSelectedItem()+"', BIRTHDAY = '"+date+"', RANKING ='"+frank.getSelectedItem()+"' WHERE ID = '"+fid.getText()+"'";
        executeQuery(query, " UPDATED ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ffirst.setText(null);
        flast.setText(null);
        fmiddle.setText(null);
        femail.setText(null);
        fcontact.setText(null);
        fsex.setSelectedItem("MALE");
        fbirth.setDate(null);
        frank.setSelectedItem("Teacher 1");
        fid.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String query = "DELETE FROM TEACHER WHERE ID = '"+fid.getText()+"'";
        executeQuery(query, " DELETED ");
        ffirst.setText(null);
        flast.setText(null);
        fmiddle.setText(null);
        femail.setText(null);
        fcontact.setText(null);
        fsex.setSelectedItem("MALE");
        fbirth.setDate(null);
        frank.setSelectedItem("Teacher 1");
        fid.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Main_Admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int i = jTable1.getSelectedRow();
       
        TableModel model = jTable1.getModel();
        fid.setText(model.getValueAt(i,0).toString());
        ffirst.setText(model.getValueAt(i,1).toString());
        flast.setText(model.getValueAt(i, 2).toString());
        fmiddle.setText(model.getValueAt(i, 3).toString());
        femail.setText(model.getValueAt(i, 4).toString());
        fcontact.setText(model.getValueAt(i, 5).toString());
        fsex.setSelectedItem(model.getValueAt(i, 6).toString());
        java.util.Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 7));
            fbirth.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(AddTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }        
        frank.setSelectedItem(model.getValueAt(i, 8).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      try{
            String resulta = jTextField1.getText();
            if(resulta.matches("^[0-9]+$")){
                String query = "SELECT * FROM teacher WHERE ID = " + resulta;
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else{
                String query = "SELECT * FROM teacher WHERE LASTNAME LIKE '%" + resulta + "%'";
                pst = con.prepareStatement(query);
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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fbirth;
    private javax.swing.JTextField fcontact;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField ffirst;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField flast;
    private javax.swing.JTextField fmiddle;
    private javax.swing.JComboBox<String> frank;
    private javax.swing.JComboBox<String> fsex;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
