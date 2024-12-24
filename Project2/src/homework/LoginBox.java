package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class LoginBox extends javax.swing.JFrame {

    // Connection and SQL variables
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public LoginBox() {
        initComponents(); // Initialize GUI components
    }

    private void initComponents() {
        // Initialize GUI components
        jLabel1 = new javax.swing.JLabel("Username");
        jLabel2 = new javax.swing.JLabel("Password");
        btnLogin = new javax.swing.JButton("Login");
        btnCancel = new javax.swing.JButton("Cancel");
        btnRegister = new javax.swing.JButton("Register");

        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();

        // Set window properties
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Button actions
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                handleLogin(); // Handle login when clicked
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0); // Close application on cancel
            }
        });

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnLogin)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCancel)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnRegister))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(55, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLogin)
                                        .addComponent(btnCancel)
                                        .addComponent(btnRegister))
                                .addContainerGap(50, Short.MAX_VALUE)));

        pack(); // Pack components into the window
    }

    // Handle login process
    private void handleLogin() {
        // Check if username or password is empty
        if (txtusername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtpassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Connect to the database
        conn = MyConnection.ConnectDB();

        if (conn != null) {
            // Prepare SQL query
            String sql = "SELECT * FROM tbregister WHERE username = ? AND password = ?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtusername.getText());
                pst.setString(2, new String(txtpassword.getPassword())); // Convert password to string
                rs = pst.executeQuery();

                if (rs.next()) {
                    this.setVisible(false); // Close login window

                } else {
                    JOptionPane.showMessageDialog(this, "Login failed. Try again.", "Access Denied",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Connection failed. Please try again.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method to run the application
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBox().setVisible(true); // Show login form
            }
        });
    }

    // Declare UI components
    private javax.swing.JButton btnLogin, btnCancel, btnRegister;
    private javax.swing.JLabel jLabel1, jLabel2;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPasswordField txtpassword;
}
