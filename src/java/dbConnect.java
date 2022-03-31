
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raj
 */
        
public class dbConnect {
     private static Connection con = null;
     
    public Connection getConnect(){       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MStore","root","Bhise@1011");            
        }catch(Exception x){
            
        }
        return con;
    }
    
}
