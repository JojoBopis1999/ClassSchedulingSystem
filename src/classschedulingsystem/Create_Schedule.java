package classschedulingsystem;

import static classschedulingsystem.ConnectionToDatabase.getConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Create_Schedule extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;

    private void cteacher(){
    try{
    Connection con = JavaDatabaseConnection.getConnection();
    
    st =con.createStatement();
    String s = "select LASTNAME, FIRSTNAME from TEACHER";
    rs = st.executeQuery(s);
    while(rs.next()){
            cteacher.addItem(rs.getString(2)+" "+rs.getString(1));    
    }
    
   
    while(rs.next()){
        ctime.addItem(rs.getString(1));
    }
    
    }
    catch(SQLException e){      
        e.printStackTrace();
    }
    

    }
      
    private void csubject(){
    try{
    Connection con = JavaDatabaseConnection.getConnection();
    st =con.createStatement();
    String s = "select SUBJECTCODE from ADDNEWSUBJECT";
    rs = st.executeQuery(s);
    while(rs.next()){
        csubject.addItem(rs.getString(1));
    }
    
    }
    catch(SQLException e){
       e.printStackTrace();
    }
    
    
    }
    
    private void cstrand(){
    try{
    Connection con = JavaDatabaseConnection.getConnection();
    st =con.createStatement();
    String s = "select STRAND from ADDNEWSTRAND";
    rs = st.executeQuery(s);
    while(rs.next()){
        cstrand.addItem(rs.getString(1));
    }
   
    
    }
    catch(SQLException e){ 
        e.printStackTrace();
    }
    
    
    }
  
    public Create_Schedule(){
        initComponents();
              cteacher();
              csubject();
              cstrand();              
    } 
    
    public void executequery(String query, String message) {
        Connection con = getConnection();
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) 
            {
                JOptionPane.showMessageDialog(null,"Data " + message + "Successfully");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"Data not " + message);
            }
            } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showsched = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        j400 = new javax.swing.JLabel();
        jtues = new javax.swing.JLabel();
        jwed = new javax.swing.JLabel();
        jthurs = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        j78 = new javax.swing.JLabel();
        j89 = new javax.swing.JLabel();
        j910 = new javax.swing.JLabel();
        j1130 = new javax.swing.JLabel();
        j1230 = new javax.swing.JLabel();
        j1030 = new javax.swing.JLabel();
        j100 = new javax.swing.JLabel();
        j200 = new javax.swing.JLabel();
        j300 = new javax.swing.JLabel();
        jmon = new javax.swing.JLabel();
        j1031 = new javax.swing.JLabel();
        j1032 = new javax.swing.JLabel();
        jfri1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mon8 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        fri1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        mon3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        mon4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        mon5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        mon6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        mon7 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        tues2 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        tues3 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        tues4 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        tues5 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        tues6 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        tues7 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        tues8 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        wed2 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        wed3 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        wed4 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        wed5 = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        wed6 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        wed7 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        wed8 = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        thur2 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        thur3 = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        thur4 = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        thur5 = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        thur6 = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        thur7 = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        thur8 = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        fri2 = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        fri3 = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        fri4 = new javax.swing.JTextArea();
        jScrollPane37 = new javax.swing.JScrollPane();
        fri5 = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        fri6 = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        fri7 = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        fri8 = new javax.swing.JTextArea();
        jScrollPane41 = new javax.swing.JScrollPane();
        mon2 = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        mon1 = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        tues1 = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        wed1 = new javax.swing.JTextArea();
        jScrollPane45 = new javax.swing.JScrollPane();
        thur1 = new javax.swing.JTextArea();
        cteacher = new javax.swing.JComboBox<>();
        cstrand = new javax.swing.JComboBox<>();
        ctime = new javax.swing.JComboBox<>();
        csubject = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cday = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cgettime = new javax.swing.JButton();
        cgetShedule = new javax.swing.JButton();
        lists = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Schedule");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showsched.setBackground(new java.awt.Color(15, 148, 178));
        showsched.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        showsched.setForeground(new java.awt.Color(255, 255, 255));
        showsched.setText("Show Schedule");
        showsched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showschedActionPerformed(evt);
            }
        });
        getContentPane().add(showsched, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 140, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        j400.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j400.setText("3:00-4:00 PM");
        j400.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j400);
        j400.setBounds(0, 570, 180, 60);

        jtues.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jtues.setText("    TUESDAY");
        jtues.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jtues);
        jtues.setBounds(340, 0, 160, 70);

        jwed.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jwed.setText("  WEDNESDAY");
        jwed.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jwed);
        jwed.setBounds(500, 0, 160, 70);

        jthurs.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jthurs.setText("   THURSDAY");
        jthurs.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jthurs);
        jthurs.setBounds(660, 0, 160, 70);

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setText("        TIME");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 180, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel12.setText("FRIDAY");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(800, 0, 160, 70);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel13.setText("Time/Days");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 70, 160, 70);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setText("MONDAY");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel14);
        jLabel14.setBounds(160, 0, 160, 70);

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel15.setText("TUESDAY");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel15);
        jLabel15.setBounds(320, 0, 160, 70);

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel16.setText("WEDNESDAY");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel16);
        jLabel16.setBounds(480, 0, 160, 70);

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel17.setText("THURSDAY");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel17);
        jLabel17.setBounds(640, 0, 160, 70);

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel18.setText("Time/Days");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel18);
        jLabel18.setBounds(0, 0, 160, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        j78.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j78.setText("7:00-8:00 AM");
        j78.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j78);
        j78.setBounds(0, 70, 180, 60);

        j89.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j89.setText("8:00-9:00 AM");
        j89.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j89);
        j89.setBounds(0, 130, 180, 60);

        j910.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j910.setText("9:00-10:00 AM");
        j910.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j910);
        j910.setBounds(0, 190, 180, 60);

        j1130.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j1130.setText("10:30-11:30 AM");
        j1130.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j1130);
        j1130.setBounds(0, 290, 180, 60);

        j1230.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j1230.setText("11:30-12:30 PM");
        j1230.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j1230);
        j1230.setBounds(0, 350, 180, 60);

        j1030.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j1030.setText("LUNCH BREAK");
        j1030.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j1030);
        j1030.setBounds(180, 410, 800, 40);

        j100.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j100.setText("12:30-1:00 PM");
        j100.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j100);
        j100.setBounds(0, 410, 180, 40);

        j200.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j200.setText("1:00-2:00 PM");
        j200.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j200);
        j200.setBounds(0, 450, 180, 60);

        j300.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j300.setText("2:00-3:00 PM");
        j300.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j300);
        j300.setBounds(0, 510, 180, 60);

        jmon.setBackground(new java.awt.Color(255, 255, 255));
        jmon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jmon.setText("     MONDAY");
        jmon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jmon);
        jmon.setBounds(180, 0, 160, 70);

        j1031.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j1031.setText("10:00-10:30 AM");
        j1031.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j1031);
        j1031.setBounds(0, 250, 180, 40);

        j1032.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j1032.setText("LUNCH BREAK");
        j1032.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(j1032);
        j1032.setBounds(180, 250, 800, 40);

        jfri1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jfri1.setText("      FRIDAY");
        jfri1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jfri1);
        jfri1.setBounds(820, 0, 160, 70);

        mon8.setEditable(false);
        mon8.setColumns(10);
        mon8.setRows(3);
        jScrollPane2.setViewportView(mon8);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(180, 570, 160, 60);

        fri1.setEditable(false);
        fri1.setColumns(10);
        fri1.setRows(3);
        jScrollPane3.setViewportView(fri1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(820, 70, 160, 60);

        mon3.setEditable(false);
        mon3.setColumns(10);
        mon3.setRows(3);
        jScrollPane4.setViewportView(mon3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(180, 190, 160, 60);

        mon4.setEditable(false);
        mon4.setColumns(10);
        mon4.setRows(3);
        jScrollPane5.setViewportView(mon4);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(180, 290, 160, 60);

        mon5.setEditable(false);
        mon5.setColumns(10);
        mon5.setRows(3);
        jScrollPane6.setViewportView(mon5);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(180, 350, 160, 60);

        mon6.setEditable(false);
        mon6.setColumns(10);
        mon6.setRows(3);
        jScrollPane7.setViewportView(mon6);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(180, 450, 160, 60);

        mon7.setEditable(false);
        mon7.setColumns(10);
        mon7.setRows(3);
        jScrollPane8.setViewportView(mon7);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(180, 510, 160, 60);

        tues2.setEditable(false);
        tues2.setColumns(10);
        tues2.setRows(3);
        jScrollPane10.setViewportView(tues2);

        jPanel1.add(jScrollPane10);
        jScrollPane10.setBounds(340, 130, 160, 60);

        tues3.setEditable(false);
        tues3.setColumns(10);
        tues3.setRows(3);
        jScrollPane11.setViewportView(tues3);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(340, 190, 160, 60);

        tues4.setEditable(false);
        tues4.setColumns(10);
        tues4.setRows(3);
        jScrollPane12.setViewportView(tues4);

        jPanel1.add(jScrollPane12);
        jScrollPane12.setBounds(340, 290, 160, 60);

        tues5.setEditable(false);
        tues5.setColumns(10);
        tues5.setRows(3);
        jScrollPane13.setViewportView(tues5);

        jPanel1.add(jScrollPane13);
        jScrollPane13.setBounds(340, 350, 160, 60);

        tues6.setEditable(false);
        tues6.setColumns(10);
        tues6.setRows(3);
        jScrollPane14.setViewportView(tues6);

        jPanel1.add(jScrollPane14);
        jScrollPane14.setBounds(340, 450, 160, 60);

        tues7.setEditable(false);
        tues7.setColumns(10);
        tues7.setRows(3);
        jScrollPane15.setViewportView(tues7);

        jPanel1.add(jScrollPane15);
        jScrollPane15.setBounds(340, 510, 160, 60);

        tues8.setEditable(false);
        tues8.setColumns(10);
        tues8.setRows(3);
        jScrollPane16.setViewportView(tues8);

        jPanel1.add(jScrollPane16);
        jScrollPane16.setBounds(340, 570, 160, 60);

        wed2.setEditable(false);
        wed2.setColumns(10);
        wed2.setRows(3);
        jScrollPane18.setViewportView(wed2);

        jPanel1.add(jScrollPane18);
        jScrollPane18.setBounds(500, 130, 160, 60);

        wed3.setEditable(false);
        wed3.setColumns(10);
        wed3.setRows(3);
        jScrollPane19.setViewportView(wed3);

        jPanel1.add(jScrollPane19);
        jScrollPane19.setBounds(500, 190, 160, 60);

        wed4.setEditable(false);
        wed4.setColumns(10);
        wed4.setRows(3);
        jScrollPane20.setViewportView(wed4);

        jPanel1.add(jScrollPane20);
        jScrollPane20.setBounds(500, 290, 160, 60);

        wed5.setEditable(false);
        wed5.setColumns(10);
        wed5.setRows(3);
        jScrollPane21.setViewportView(wed5);

        jPanel1.add(jScrollPane21);
        jScrollPane21.setBounds(500, 350, 160, 60);

        wed6.setEditable(false);
        wed6.setColumns(10);
        wed6.setRows(3);
        jScrollPane22.setViewportView(wed6);

        jPanel1.add(jScrollPane22);
        jScrollPane22.setBounds(500, 450, 160, 60);

        wed7.setEditable(false);
        wed7.setColumns(10);
        wed7.setRows(3);
        jScrollPane23.setViewportView(wed7);

        jPanel1.add(jScrollPane23);
        jScrollPane23.setBounds(500, 510, 160, 60);

        wed8.setEditable(false);
        wed8.setColumns(10);
        wed8.setRows(3);
        jScrollPane24.setViewportView(wed8);

        jPanel1.add(jScrollPane24);
        jScrollPane24.setBounds(500, 570, 160, 60);

        thur2.setEditable(false);
        thur2.setColumns(10);
        thur2.setRows(3);
        jScrollPane26.setViewportView(thur2);

        jPanel1.add(jScrollPane26);
        jScrollPane26.setBounds(660, 130, 160, 60);

        thur3.setEditable(false);
        thur3.setColumns(10);
        thur3.setRows(3);
        jScrollPane27.setViewportView(thur3);

        jPanel1.add(jScrollPane27);
        jScrollPane27.setBounds(660, 190, 160, 60);

        thur4.setEditable(false);
        thur4.setColumns(10);
        thur4.setRows(3);
        jScrollPane28.setViewportView(thur4);

        jPanel1.add(jScrollPane28);
        jScrollPane28.setBounds(660, 290, 160, 60);

        thur5.setEditable(false);
        thur5.setColumns(10);
        thur5.setRows(3);
        jScrollPane29.setViewportView(thur5);

        jPanel1.add(jScrollPane29);
        jScrollPane29.setBounds(660, 350, 160, 60);

        thur6.setEditable(false);
        thur6.setColumns(10);
        thur6.setRows(3);
        jScrollPane30.setViewportView(thur6);

        jPanel1.add(jScrollPane30);
        jScrollPane30.setBounds(660, 450, 160, 60);

        thur7.setEditable(false);
        thur7.setColumns(10);
        thur7.setRows(3);
        jScrollPane31.setViewportView(thur7);

        jPanel1.add(jScrollPane31);
        jScrollPane31.setBounds(660, 510, 160, 60);

        thur8.setEditable(false);
        thur8.setColumns(10);
        thur8.setRows(3);
        jScrollPane32.setViewportView(thur8);

        jPanel1.add(jScrollPane32);
        jScrollPane32.setBounds(660, 570, 160, 60);

        fri2.setEditable(false);
        fri2.setColumns(10);
        fri2.setRows(3);
        jScrollPane34.setViewportView(fri2);

        jPanel1.add(jScrollPane34);
        jScrollPane34.setBounds(820, 130, 160, 60);

        fri3.setEditable(false);
        fri3.setColumns(10);
        fri3.setRows(3);
        jScrollPane35.setViewportView(fri3);

        jPanel1.add(jScrollPane35);
        jScrollPane35.setBounds(820, 190, 160, 60);

        fri4.setEditable(false);
        fri4.setColumns(10);
        fri4.setRows(3);
        jScrollPane36.setViewportView(fri4);

        jPanel1.add(jScrollPane36);
        jScrollPane36.setBounds(820, 290, 160, 60);

        fri5.setEditable(false);
        fri5.setColumns(10);
        fri5.setRows(3);
        jScrollPane37.setViewportView(fri5);

        jPanel1.add(jScrollPane37);
        jScrollPane37.setBounds(820, 350, 160, 60);

        fri6.setEditable(false);
        fri6.setColumns(10);
        fri6.setRows(3);
        jScrollPane38.setViewportView(fri6);

        jPanel1.add(jScrollPane38);
        jScrollPane38.setBounds(820, 450, 160, 60);

        fri7.setEditable(false);
        fri7.setColumns(10);
        fri7.setRows(3);
        jScrollPane39.setViewportView(fri7);

        jPanel1.add(jScrollPane39);
        jScrollPane39.setBounds(820, 510, 160, 60);

        fri8.setEditable(false);
        fri8.setColumns(10);
        fri8.setRows(3);
        jScrollPane40.setViewportView(fri8);

        jPanel1.add(jScrollPane40);
        jScrollPane40.setBounds(820, 570, 160, 60);

        mon2.setEditable(false);
        mon2.setColumns(10);
        mon2.setRows(3);
        jScrollPane41.setViewportView(mon2);

        jPanel1.add(jScrollPane41);
        jScrollPane41.setBounds(180, 130, 160, 60);

        mon1.setEditable(false);
        mon1.setColumns(10);
        mon1.setRows(3);
        jScrollPane42.setViewportView(mon1);

        jPanel1.add(jScrollPane42);
        jScrollPane42.setBounds(180, 70, 160, 60);

        tues1.setEditable(false);
        tues1.setColumns(10);
        tues1.setRows(3);
        jScrollPane43.setViewportView(tues1);

        jPanel1.add(jScrollPane43);
        jScrollPane43.setBounds(340, 70, 160, 60);

        wed1.setEditable(false);
        wed1.setColumns(10);
        wed1.setRows(3);
        jScrollPane44.setViewportView(wed1);

        jPanel1.add(jScrollPane44);
        jScrollPane44.setBounds(500, 70, 160, 60);

        thur1.setEditable(false);
        thur1.setColumns(10);
        thur1.setRows(3);
        jScrollPane45.setViewportView(thur1);

        jPanel1.add(jScrollPane45);
        jScrollPane45.setBounds(660, 70, 160, 60);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 981, 632));

        cteacher.setBackground(new java.awt.Color(15, 148, 178));
        cteacher.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cteacher.setForeground(new java.awt.Color(255, 255, 255));
        cteacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEACHER" }));
        getContentPane().add(cteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 240, 48));

        cstrand.setBackground(new java.awt.Color(15, 148, 178));
        cstrand.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cstrand.setForeground(new java.awt.Color(255, 255, 255));
        cstrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STRAND" }));
        getContentPane().add(cstrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 170, 48));

        ctime.setBackground(new java.awt.Color(15, 148, 178));
        ctime.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ctime.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ctime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 200, 48));

        csubject.setBackground(new java.awt.Color(15, 148, 178));
        csubject.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        csubject.setForeground(new java.awt.Color(255, 255, 255));
        csubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUBJECT" }));
        csubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csubjectActionPerformed(evt);
            }
        });
        getContentPane().add(csubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 250, 48));

        jButton1.setBackground(new java.awt.Color(15, 148, 178));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/credit-card (1).png"))); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 130, 39));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 480, -1, 39));

        cday.setBackground(new java.awt.Color(15, 148, 178));
        cday.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cday.setForeground(new java.awt.Color(255, 255, 255));
        cday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" }));
        getContentPane().add(cday, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 200, 48));

        jButton5.setBackground(new java.awt.Color(15, 148, 178));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/printer.png"))); // NOI18N
        jButton5.setText("PRINT OUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, 159, 39));

        jButton6.setBackground(new java.awt.Color(15, 148, 178));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/home-back-icon.png"))); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 130, 39));

        cgettime.setBackground(new java.awt.Color(15, 148, 178));
        cgettime.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        cgettime.setForeground(new java.awt.Color(255, 255, 255));
        cgettime.setText("Get Available");
        cgettime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgettimeActionPerformed(evt);
            }
        });
        getContentPane().add(cgettime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, -1, 30));

        cgetShedule.setBackground(new java.awt.Color(15, 148, 178));
        cgetShedule.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        cgetShedule.setForeground(new java.awt.Color(255, 255, 255));
        cgetShedule.setText("Get Schedule");
        cgetShedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgetSheduleActionPerformed(evt);
            }
        });
        getContentPane().add(cgetShedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 110, 30));

        lists.setBackground(new java.awt.Color(15, 148, 178));
        lists.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lists.setForeground(new java.awt.Color(255, 255, 255));
        lists.setText("Lists of Subjects");
        lists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listsActionPerformed(evt);
            }
        });
        getContentPane().add(lists, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 160, 30));

        clear.setBackground(new java.awt.Color(15, 148, 178));
        clear.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR TABLE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKGROUNDS_AND_ICONS/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Main_Admin().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cteacher.getSelectedItem().equals("TEACHER")||cday.getSelectedItem().equals("DAY")){
            JOptionPane.showMessageDialog(null,"Please select Teacher or Day");
        }
        else if(ctime.getSelectedItem().equals("")||ctime.getSelectedItem().equals("TIMESLOT")){
            JOptionPane.showMessageDialog(null,"Please select a time");
        }
        else if(cday.getSelectedItem().equals("DAY")&&cteacher.getSelectedItem().equals("TEACHER")){
            JOptionPane.showMessageDialog(null,"Please select Teacher and Day");
        }
        else if(csubject.getSelectedItem().equals("SUBJECT")||cstrand.getSelectedItem().equals("STRAND")){
            JOptionPane.showMessageDialog(null,"Please select a Strand and/or Subject");
        }
        else{
        try{     
        Connection con= JavaDatabaseConnection.getConnection();
        st = con.createStatement();
        String SelectQuery = "SELECT * FROM schedule WHERE STRAND = '" +cstrand.getSelectedItem() + "' AND TIME = '" + ctime.getSelectedItem() + "' AND DAY = '" + cday.getSelectedItem() + "'";
        rs = st.executeQuery(SelectQuery);
       
        if(rs.next()){                   
              JOptionPane.showMessageDialog(null, "Already scheduled this Strand to other Teachers, please choose another timeslot available in this strand","Insert Error",JOptionPane.ERROR_MESSAGE);       
        }
        else{
            try{                    
                        //Connection connection = JavaDatabaseConnection.getConnection();
                        //Statement stmt;             
                        int teacher_id = cteacher.getSelectedIndex();                      
                        //Connection con = JavaDatabaseConnection.getConnection();
                        //stmt = connection.createStatement();
                        String query = "Insert into schedule (strand, subject, teacher_id, day, time, teacher) values('"+cstrand.getSelectedItem()+"','"+csubject.getSelectedItem()+"',"+teacher_id+",'"+cday.getSelectedItem()+"','"+ctime.getSelectedItem()+"','"+cteacher.getSelectedItem()+"')";          
                        st.execute(query);
            
                        JOptionPane.showMessageDialog(null,"DATA INSERTED SUCCESSFULLY");
                        
                        if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("7:00-8:00 AM"))
                        {
                            mon1.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("8:00-9:00 AM"))
                        {
                            mon2.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("9:00-10:00 AM"))
                        {
                            mon3.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("10:30-11:30 AM"))
                        {
                            mon4.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("11:30-12:30 PM"))
                        {
                            mon5.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("1:00-2:00 PM"))
                        {
                            mon6.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("2:00-3:00 PM"))
                        {
                            mon7.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("MONDAY")&&ctime.getSelectedItem().equals("3:00-4:00 PM"))
                        {
                            mon8.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("7:00-8:00 AM"))
                        {
                            tues1.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("8:00-9:00 AM"))
                        {
                            tues2.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("9:00-10:00 AM"))
                        {
                            tues3.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("10:30-11:30 AM"))
                        {
                            tues4.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("11:30-12:30 PM"))
                        {
                            tues5.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("1:00-2:00 PM"))
                        {
                            tues6.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("2:00-3:00 PM"))
                        {
                            tues7.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("TUESDAY")&&ctime.getSelectedItem().equals("3:00-4:00 PM"))
                        {
                            tues8.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("7:00-8:00 AM"))
                        {
                            wed1.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("8:00-9:00 AM"))
                        {
                            wed2.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("9:00-10:00 AM"))
                        {
                            wed3.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("10:30-11:30 AM"))
                        {
                            wed4.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("11:30-12:30 PM"))
                        {
                            wed5.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("1:00-2:00 PM"))
                        {
                            wed6.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("2:00-3:00 PM"))
                        {
                            wed7.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("WEDNESDAY")&&ctime.getSelectedItem().equals("3:00-4:00 PM"))
                        {
                            wed8.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("7:00-8:00 AM"))
                        {
                            thur1.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("8:00-9:00 AM"))
                        {
                            thur2.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("9:00-10:00 AM"))
                        {
                            thur3.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("10:30-11:30 AM"))
                        {
                            thur4.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("11:30-12:30 PM"))
                        {
                            thur5.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("1:00-2:00 PM"))
                        {
                            thur6.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("2:00-3:00 PM"))
                        {
                            thur7.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("THURSDAY")&&ctime.getSelectedItem().equals("3:00-4:00 PM"))
                        {
                            thur8.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("7:00-8:00 AM"))
                        {
                            fri1.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("8:00-9:00 AM"))
                        {
                            fri2.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("9:00-10:00 AM"))
                        {
                            fri3.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("10:30-11:30 AM"))
                        {
                            fri4.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("11:30-12:30 PM"))
                        {
                            fri5.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("1:00-2:00 PM"))
                        {
                            fri6.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("2:00-3:00 PM"))
                        {
                            fri7.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        else if(cday.getSelectedItem().equals("FRIDAY")&&ctime.getSelectedItem().equals("3:00-4:00 PM"))
                        {
                            fri8.setText(cteacher.getSelectedItem().toString()+"\n"+csubject.getSelectedItem().toString()+"\n"+cstrand.getSelectedItem().toString());
                        }
                        ctime.removeAllItems();
        
                        query = "select day, time from schedule where teacher_id="+cteacher.getSelectedIndex() ;
                        String condition = " ";
                        boolean hasSchedule = false;
                        rs = st.executeQuery(query);
                        while(rs.next()){
                            if(cday.getSelectedItem().equals(rs.getString(1))){
                                condition += "'" + rs.getString(2) + "'";
                                hasSchedule = true;
                            }
                        }

                        if (hasSchedule){
                            condition = condition.replaceAll("''", "','");
                        }
                        else{
                            condition = "' '";
                        }

                        String s = "select time from availableTime where time not in ("+condition+")";
                        rs = st.executeQuery(s);
                        while(rs.next()){
                            ctime.addItem(rs.getString(1));
                        }

                        }
                catch(HeadlessException | SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                        
                }
            
        }
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        } 
        }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Print_Out_Schedule().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cgettimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgettimeActionPerformed
        ctime.removeAllItems();
        if(cday.getSelectedItem().equals("DAY")||cteacher.getSelectedItem().equals("TEACHER")){
            JOptionPane.showMessageDialog(null, "Please Choose first a Day/Teacher");
        }

        else{
        try{
            String query = "select day, time from schedule where teacher_id="+cteacher.getSelectedIndex() ;
            String condition = " ";
            boolean hasSchedule = false;
            rs = st.executeQuery(query);
            while(rs.next()){
                if (cday.getSelectedItem().equals(rs.getString(1))){
                    condition += "'" + rs.getString(2) + "'";
                    hasSchedule = true;
                }
            }

            if (hasSchedule){

                condition = condition.replaceAll("''", "','");

            }else{

                condition = "' '";

            }

            String s = "select time from availableTime where time not in ("+condition+")";
            rs = st.executeQuery(s);
            while(rs.next()){
                ctime.addItem(rs.getString(1));
            }

        } catch(SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }
        
        }
    }//GEN-LAST:event_cgettimeActionPerformed

    private void cgetSheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgetSheduleActionPerformed
        mon1.setText(null);
        mon2.setText(null);
        mon3.setText(null);
        mon4.setText(null);
        mon5.setText(null);
        mon6.setText(null);
        mon7.setText(null);
        mon8.setText(null);
        
        tues1.setText(null);
        tues2.setText(null);
        tues3.setText(null);
        tues4.setText(null);
        tues5.setText(null);
        tues6.setText(null);
        tues7.setText(null);
        tues8.setText(null);
        
        wed1.setText(null);
        wed2.setText(null);
        wed3.setText(null);
        wed4.setText(null);
        wed5.setText(null);
        wed6.setText(null);
        wed7.setText(null);
        wed8.setText(null);
        
        thur1.setText(null);
        thur2.setText(null);
        thur3.setText(null);
        thur4.setText(null);
        thur5.setText(null);
        thur6.setText(null);
        thur7.setText(null);
        thur8.setText(null);

        fri1.setText(null);
        fri2.setText(null);
        fri3.setText(null);
        fri4.setText(null);
        fri5.setText(null);
        fri6.setText(null);
        fri7.setText(null);
        fri8.setText(null);

        if(cteacher.getSelectedItem().equals("TEACHER")){
            JOptionPane.showMessageDialog(null,"Please Select a Teacher.");
        }
        else{
        try{
            String query = "select day, time, subject,strand from schedule where teacher_id="+cteacher.getSelectedIndex() ;
            rs = st.executeQuery(query);
            String display = "";
            while(rs.next()){
                if (rs.getString(1).equals("MONDAY")){
                      if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3) ; 
                        mon1.setText(display);
                        }
                       if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        mon8.setText(display);    
                        }
                        
                } if (rs.getString(1).equals("TUESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        tues8.setText(display);    
                        }
                } if (rs.getString(1).equals("WEDNESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        wed8.setText(display);    
                        }
                }if (rs.getString(1).equals("THURSDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        thur8.setText(display);    
                        }
                }if (rs.getString(1).equals("FRIDAY")){
                        if(rs.getString(2).equals("7:00-8:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = cteacher.getSelectedItem() + "\n" + rs.getString(4) + "\n" + rs.getString(3); 
                        fri8.setText(display);    
                        }
                }
            }
            
        } catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
        }
        
        }
    }//GEN-LAST:event_cgetSheduleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new Delete_Schedule().setVisible(true);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showschedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showschedActionPerformed
        mon1.setText(null);
        mon2.setText(null);
        mon3.setText(null);
        mon4.setText(null);
        mon5.setText(null);
        mon6.setText(null);
        mon7.setText(null);
        mon8.setText(null);
        
        tues1.setText(null);
        tues2.setText(null);
        tues3.setText(null);
        tues4.setText(null);
        tues5.setText(null);
        tues6.setText(null);
        tues7.setText(null);
        tues8.setText(null);
        
        wed1.setText(null);
        wed2.setText(null);
        wed3.setText(null);
        wed4.setText(null);
        wed5.setText(null);
        wed6.setText(null);
        wed7.setText(null);
        wed8.setText(null);
        
        thur1.setText(null);
        thur2.setText(null);
        thur3.setText(null);
        thur4.setText(null);
        thur5.setText(null);
        thur6.setText(null);
        thur7.setText(null);
        thur8.setText(null);

        fri1.setText(null);
        fri2.setText(null);
        fri3.setText(null);
        fri4.setText(null);
        fri5.setText(null);
        fri6.setText(null);
        fri7.setText(null);
        fri8.setText(null);
        
        if(cstrand.getSelectedItem().equals("STRAND")){
            JOptionPane.showMessageDialog(null,"Please Select a Strand.");
        }
        else{
        try{
            String query = "select day, time, subject, teacher from schedule where strand = '"+cstrand.getSelectedItem()+"'";
            rs = st.executeQuery(query);
            String display = "";
            while(rs.next()){
                if (rs.getString(1).equals("MONDAY")){
                        if(rs.getString(2).equals("7:00-8:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display =rs.getString(3) + "\n" + rs.getString(4); 
                        mon4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        mon8.setText(display);    
                        }                       
                } if (rs.getString(1).equals("TUESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display =rs.getString(3) + "\n" + rs.getString(4); 
                        tues2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        tues8.setText(display);    
                        }
                }if (rs.getString(1).equals("WEDNESDAY")){
                       if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        wed8.setText(display);    
                        }
                }if (rs.getString(1).equals("THURSDAY")){
                        if (rs.getString(2).equals("7:00-8:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        thur8.setText(display);    
                        }
                }if (rs.getString(1).equals("FRIDAY")){
                        if(rs.getString(2).equals("7:00-8:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri1.setText(display);
                        }
                        if (rs.getString(2).equals("8:00-9:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri2.setText(display);    
                        }
                        if (rs.getString(2).equals("9:00-10:00 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri3.setText(display);    
                        }
                        if (rs.getString(2).equals("10:30-11:30 AM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri4.setText(display);    
                        }
                        if (rs.getString(2).equals("11:30-12:30 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri5.setText(display);    
                        }
                        if (rs.getString(2).equals("1:00-2:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri6.setText(display);    
                        }
                        if (rs.getString(2).equals("2:00-3:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri7.setText(display);    
                        }
                        if (rs.getString(2).equals("3:00-4:00 PM")){
                        display = rs.getString(3) + "\n" + rs.getString(4); 
                        fri8.setText(display);    
                        }
                }
            }
            
        } catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
        }
        
        
        }
    }//GEN-LAST:event_showschedActionPerformed

    private void listsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listsActionPerformed
        new LIST_OF_SCHEDULES().setVisible(true);
    }//GEN-LAST:event_listsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       mon1.setText(null);
       mon2.setText(null);
       mon3.setText(null);
       mon4.setText(null);
       mon5.setText(null);
       mon6.setText(null);
       mon7.setText(null);
       mon8.setText(null);
       tues1.setText(null);
       tues2.setText(null);
       tues3.setText(null);
       tues4.setText(null);
       tues5.setText(null);
       tues6.setText(null);
       tues7.setText(null);
       tues8.setText(null);
       wed1.setText(null);
       wed2.setText(null);
       wed3.setText(null);
       wed4.setText(null);
       wed5.setText(null);
       wed6.setText(null);
       wed7.setText(null);
       wed8.setText(null);
       thur1.setText(null);
       thur2.setText(null);
       thur3.setText(null);
       thur4.setText(null);
       thur5.setText(null);
       thur6.setText(null);
       thur7.setText(null);
       thur8.setText(null);
       fri1.setText(null);
       fri2.setText(null);
       fri3.setText(null);
       fri4.setText(null);
       fri5.setText(null);
       fri6.setText(null);
       fri7.setText(null);
       fri8.setText(null);
       cteacher.setSelectedItem("TEACHER");
       cday.setSelectedItem("DAY");
       ctime.setSelectedItem("TIMESLOT");
       cstrand.setSelectedItem("STRAND");
       csubject.setSelectedItem("SUBJECT");      
    }//GEN-LAST:event_clearActionPerformed

    private void csubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csubjectActionPerformed
     
    }//GEN-LAST:event_csubjectActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cday;
    private javax.swing.JButton cgetShedule;
    private javax.swing.JButton cgettime;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> cstrand;
    private javax.swing.JComboBox<String> csubject;
    private javax.swing.JComboBox<String> cteacher;
    private javax.swing.JComboBox<String> ctime;
    private javax.swing.JTextArea fri1;
    private javax.swing.JTextArea fri2;
    private javax.swing.JTextArea fri3;
    private javax.swing.JTextArea fri4;
    private javax.swing.JTextArea fri5;
    private javax.swing.JTextArea fri6;
    private javax.swing.JTextArea fri7;
    private javax.swing.JTextArea fri8;
    private javax.swing.JLabel j100;
    private javax.swing.JLabel j1030;
    private javax.swing.JLabel j1031;
    private javax.swing.JLabel j1032;
    private javax.swing.JLabel j1130;
    private javax.swing.JLabel j1230;
    private javax.swing.JLabel j200;
    private javax.swing.JLabel j300;
    private javax.swing.JLabel j400;
    private javax.swing.JLabel j78;
    private javax.swing.JLabel j89;
    private javax.swing.JLabel j910;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel jfri1;
    private javax.swing.JLabel jmon;
    private javax.swing.JLabel jthurs;
    private javax.swing.JLabel jtues;
    private javax.swing.JLabel jwed;
    private javax.swing.JButton lists;
    private javax.swing.JTextArea mon1;
    private javax.swing.JTextArea mon2;
    private javax.swing.JTextArea mon3;
    private javax.swing.JTextArea mon4;
    private javax.swing.JTextArea mon5;
    private javax.swing.JTextArea mon6;
    private javax.swing.JTextArea mon7;
    private javax.swing.JTextArea mon8;
    private javax.swing.JButton showsched;
    private javax.swing.JTextArea thur1;
    private javax.swing.JTextArea thur2;
    private javax.swing.JTextArea thur3;
    private javax.swing.JTextArea thur4;
    private javax.swing.JTextArea thur5;
    private javax.swing.JTextArea thur6;
    private javax.swing.JTextArea thur7;
    private javax.swing.JTextArea thur8;
    private javax.swing.JTextArea tues1;
    private javax.swing.JTextArea tues2;
    private javax.swing.JTextArea tues3;
    private javax.swing.JTextArea tues4;
    private javax.swing.JTextArea tues5;
    private javax.swing.JTextArea tues6;
    private javax.swing.JTextArea tues7;
    private javax.swing.JTextArea tues8;
    private javax.swing.JTextArea wed1;
    private javax.swing.JTextArea wed2;
    private javax.swing.JTextArea wed3;
    private javax.swing.JTextArea wed4;
    private javax.swing.JTextArea wed5;
    private javax.swing.JTextArea wed6;
    private javax.swing.JTextArea wed7;
    private javax.swing.JTextArea wed8;
    // End of variables declaration//GEN-END:variables
}
