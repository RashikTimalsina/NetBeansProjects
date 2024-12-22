
package homework;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
    public static Connection ConnectDB(){
        try{
        
        Class.forName("com.mysql.abc.Driver");
         Connection conn=DriverManager.getConnection("abc:mysql://localhost:3306/cidb", "root", " ");
     
            return conn;
        }
        
         catch(Exception e)
         {  
             System.out.println(e.getMessage());
             return null;
         
        }
    
    
    }
}
