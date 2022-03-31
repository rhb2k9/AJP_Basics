
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raj
 */
public class User {
    
    public String register(UserModel m){
        Connection con;
        dbConnect db = new dbConnect();
        PreparedStatement ps;
        String str,sql;
        int i=0;
        try{
            con = db.getConnect();
            sql = "insert into users values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, m.username);
            ps.setString(2, m.pswd);
            ps.executeUpdate();
            str="User registered successfully";
            
            
        }catch(Exception e){
            str =" Error in registration...";
        }
        return str;
    }
    
    public int validation(UserModel m){
        ResultSet rs;
        Statement st;
        Connection con;
        dbConnect d= new dbConnect();
        String str;
        int i=0;
        try{
            con = d.getConnect();
            st = con.createStatement();
            str = "select * from users where username ='"+ m.username +"' And  Password = '"+ m.pswd;
            rs = st.executeQuery(str);
            while(rs.next())
                i=1;
        }catch(Exception e){
            
        }
        return i;
    }
}
