package classschedulingsystem;

import java.sql.*;
import javax.swing.*;

public class JavaDatabaseConnection {
   
    public static Connection getConnection(){
        Connection conn;
        try{

           String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/studentinfo";
            conn = DriverManager.getConnection(url,username,password);
            
            System.out.println("Connected");
            return conn;
                       
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }        
    }
}