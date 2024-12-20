
package cafe.ms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Selling extends javax.swing.JFrame {
   
    public Selling() {
        initComponents();
        ShowProducts();
        Pricetxt2.setEditable(false);
        Sellertxt2.setEditable(false);
        Nametxt2.setEditable(false);
    }
    
     ResultSet rs=null, rs1=null;
     Connection con =null;
     Statement stmt=null, stmt1=null;
   
      private void ShowProducts()
    {
    try{
      
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
        stmt=con.createStatement();
        rs=stmt.executeQuery("select * from tbproduct");
        ItemList.setModel(DbUtils.resultSetToTableModel(rs));
    
       
       }catch(Exception e)  {
    
     }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TotalLb2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nametxt2 = new javax.swing.JTextField();
        Quantitytxt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemList = new javax.swing.JTable();
        Pricetxt2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Sellertxt2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        Printbtn = new javax.swing.JButton();
        TotalLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TotalLb2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sell Products");

        Nametxt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nametxt2.setForeground(new java.awt.Color(255, 0, 51));
        Nametxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nametxt2ActionPerformed(evt);
            }
        });

        Quantitytxt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quantitytxt2.setForeground(new java.awt.Color(255, 0, 51));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        ItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        ItemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemList);

        Pricetxt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pricetxt2.setForeground(new java.awt.Color(255, 0, 51));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");

        Sellertxt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sellertxt2.setForeground(new java.awt.Color(255, 0, 51));
        Sellertxt2.setText("User 1");
        Sellertxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sellertxt2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seller");

        Addbtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 0, 51));
        Addbtn.setText("Add to Bill");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(BillTable);

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Bill");

        Printbtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Printbtn.setForeground(new java.awt.Color(255, 0, 51));
        Printbtn.setText("Print");
        Printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbtnActionPerformed(evt);
            }
        });

        TotalLbl.setBackground(new java.awt.Color(255, 0, 51));
        TotalLbl.setFont(TotalLbl.getFont().deriveFont(TotalLbl.getFont().getStyle() | java.awt.Font.BOLD, TotalLbl.getFont().getSize()+5));
        TotalLbl.setForeground(new java.awt.Color(255, 255, 255));
        TotalLbl.setText("Total");

        javax.swing.GroupLayout TotalLb2Layout = new javax.swing.GroupLayout(TotalLb2);
        TotalLb2.setLayout(TotalLb2Layout);
        TotalLb2Layout.setHorizontalGroup(
            TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalLb2Layout.createSequentialGroup()
                .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(Addbtn))
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel6)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel10))
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TotalLb2Layout.createSequentialGroup()
                                        .addComponent(Pricetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Quantitytxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TotalLb2Layout.createSequentialGroup()
                                        .addComponent(Nametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Sellertxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel2))
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel11)
                        .addGap(313, 313, 313)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TotalLb2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TotalLbl)
                        .addGap(74, 74, 74)
                        .addComponent(Printbtn)
                        .addGap(27, 27, 27)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        TotalLb2Layout.setVerticalGroup(
            TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalLb2Layout.createSequentialGroup()
                .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TotalLb2Layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(9, 9, 9)))
                .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sellertxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pricetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantitytxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Addbtn)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TotalLb2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(TotalLb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalLbl))
                            .addGroup(TotalLb2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Printbtn))))))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Items");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Selling");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Logout");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("View Bills");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalLb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalLb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sellertxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sellertxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sellertxt2ActionPerformed

    private void Nametxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nametxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametxt2ActionPerformed
 
    int Bid;
    private void CountBill(){

    try{
            
         stmt1=con.createStatement();
         rs1=stmt1.executeQuery("select Max(Bid)from tbbill");
         rs1.next();
         Bid=rs1.getInt(1)+1;
            
    }catch (Exception e){
                        
            
                }

}

    private void InsertBill()
       {
        
        try{
            CountBill();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
            PreparedStatement pst=con.prepareStatement("insert into tbbill values(?,?,?,?)");
            pst.setInt(1, Bid);
            pst.setString(2, Sellertxt2.getText());
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now=LocalDateTime.now();
            pst.setString(3, now.toString().substring(1 ,10));
            pst.setInt(4, GrdTot);
            int row=pst.executeUpdate();
            //JOptionPane.showMessageDialog(this,"Bill Added !!!");
            con.close();
            ShowProducts();
            
            } catch (SQLException ex){
        
            JOptionPane.showMessageDialog(this,ex);
        
        
        
            }
        
       }                                      


    int Key=0;  
    private void ItemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemListMouseClicked
        DefaultTableModel model= (DefaultTableModel) ItemList.getModel();
       int MyIndex=ItemList.getSelectedRow();
       Key= Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
       Nametxt2.setText(model.getValueAt(MyIndex, 1).toString());
    //  Categorycmb.setText(model.getValueAt(MyIndex, 2).toString());
        Pricetxt2.setText(model.getValueAt(MyIndex, 3).toString());
    
    }//GEN-LAST:event_ItemListMouseClicked

    int GrdTot=0;
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
       //Add to Bill code
       if(Nametxt2.getText().isEmpty() || Quantitytxt2.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Missing Information !!!");
       }else{
           
       }
       int Total=Integer.valueOf(Pricetxt2.getText()) * Integer.valueOf(Quantitytxt2.getText());
        GrdTot=GrdTot+Total;
        TotalLbl.setText("Rs "+GrdTot);
       DefaultTableModel model=(DefaultTableModel) BillTable.getModel();
       String nextRowId=Integer.toString(model.getRowCount());
       model.addRow(new Object[]  {
         
           Integer.valueOf(nextRowId)+1,
           
            Nametxt2.getText(),       
            Pricetxt2.getText(),
            Quantitytxt2.getText(),  
            Total 
          });
    }//GEN-LAST:event_AddbtnActionPerformed

    private void PrintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbtnActionPerformed
        
        try{
            InsertBill();
            BillTable.print();
        
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_PrintbtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable BillTable;
    private javax.swing.JTable ItemList;
    private javax.swing.JTextField Nametxt2;
    private javax.swing.JTextField Pricetxt2;
    private javax.swing.JButton Printbtn;
    private javax.swing.JTextField Quantitytxt2;
    private javax.swing.JTextField Sellertxt2;
    private javax.swing.JPanel TotalLb2;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
