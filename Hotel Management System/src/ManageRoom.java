import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rashik Timalsina
 */
public class ManageRoom extends javax.swing.JFrame {

    Connection conn=null;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null; 
    
  
    public ManageRoom() {
        initComponents();
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         ShowRecordInTable();
    }
    
    public void ShowRecordInTable()
    {
        int c=0;
        try {
            pst=conn.prepareStatement("select * from room");
            rs=pst.executeQuery();
            ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
            c=rsmd.getColumnCount();
            DefaultTableModel DModel=(DefaultTableModel) jTable1.getModel();
            DModel.setRowCount(0);
            
            while(rs.next()){
                Vector column=new Vector(); 
                for(int i=1;i<=c;i++){
                    column.add(rs.getString("Roomnumber"));
                     column.add(rs.getString("Roomtype"));
                      column.add(rs.getString("Bed"));
                       column.add(rs.getString("Price"));
                        column.add(rs.getString("Status"));
                }
                
                DModel.addRow(column);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
        
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtroomnumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbroomtype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbbedtype = new javax.swing.JComboBox<>();
        txtprice = new javax.swing.JTextField();
        btnaddroomdetails = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 0, -1, 58));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RoomNumber", "RoomType", "BedType", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 179, 1024, 253));

        txtroomnumber.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 506, 147, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Number");
        jLabel2.setPreferredSize(null);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, -1));

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room Type");
        jLabel3.setPreferredSize(null);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 126, -1));

        cmbroomtype.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cmbroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC", " ", " " }));
        getContentPane().add(cmbroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 506, 127, 28));

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bed Type");
        jLabel4.setPreferredSize(null);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 580, 129, -1));

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jLabel5.setPreferredSize(null);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 580, -1, -1));

        cmbbedtype.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cmbbedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        getContentPane().add(cmbbedtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 625, 139, -1));

        txtprice.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 614, 130, -1));

        btnaddroomdetails.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btnaddroomdetails.setText("Add Room Details");
        btnaddroomdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddroomdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddroomdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1900901.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1100, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnaddroomdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddroomdetailsActionPerformed
          if(txtroomnumber.getText().equals("")){
              JOptionPane.showMessageDialog(this,"All field is required");
              txtroomnumber.requestFocus(); 
          } 
          else if(txtprice.getText().equals("")){
              JOptionPane.showMessageDialog(this,"All field is required");
              txtprice.requestFocus();
        }
          else{
              try {
                  pst=conn.prepareStatement("select * from room where Roomnumber=?");   //database access
                  pst.setString(1,txtroomnumber.getText());
                  rs=pst.executeQuery();
                  
                  if(rs.next()){
                      JOptionPane.showMessageDialog(this,"Room Number Already Exists");
                  
                  }
                  else{
                    pst=conn.prepareStatement("insert into room(Roomnumber,Roomtype,Bed,Price,Status) values(?,?,?,?,?)");
                    pst.setString(1,txtroomnumber.getText());
                    pst.setString(2,cmbroomtype.getItemAt(cmbroomtype.getSelectedIndex()));
                    pst.setString(3,cmbbedtype.getItemAt(cmbbedtype.getSelectedIndex()));
                    pst.setString(4,txtprice.getText());
                    pst.setString(5,"NOT-BOOKED");
                    pst.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this,"Room Added");
                    ShowRecordInTable();
                    txtroomnumber.setText("");
                    txtprice.setText("");
                    
                  
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
         
          }
    }//GEN-LAST:event_btnaddroomdetailsActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddroomdetails;
    private javax.swing.JComboBox<String> cmbbedtype;
    private javax.swing.JComboBox<String> cmbroomtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables
}