package classwork;

import java.sql.*;

public class Myconnection {

    public static Connection ConnectDB() {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver (use the correct version)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection parameters
            String url = "jdbc:mysql://localhost:3306/ccidb?useSSL=false&serverTimezone=UTC"; // Added SSL and timezone configurations
                                                                                              
            String user = "root"; // Ideally, this should be stored securely
            String password = ""; // Same for the password

            // Establish the connection
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            // Catch any exceptions and print the error message
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
        return con;
    }
}
