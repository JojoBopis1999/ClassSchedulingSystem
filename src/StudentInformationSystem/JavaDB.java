package StudentInformationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JavaDB {
    public static Connection getConnection()
    {
        Connection conn;
        try{           
           String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/studentinfo";
            
            conn = DriverManager.getConnection(url,username,password);
            
            return conn;
           
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
