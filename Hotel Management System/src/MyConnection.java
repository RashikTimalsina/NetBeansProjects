
import java.sql.*;

public class MyConnection {
     public static Connection ConnectDB(){
         try{
      Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","");

         return con;
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
             return null;
         }
     }
     }