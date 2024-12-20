 
package classwork;

import java.sql.*;
 
public class Myconnection {
    
    public static Connection ConnectDB(){
         try{
      Class.forName("com.mysql.jdbc.Driver");  
      //jdbc is a driver
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccidb","root","");

         return con;
         }
         catch(Exception e)
         {  
             System.out.println(e.getMessage());
             return null;
         }
     }
    
}
