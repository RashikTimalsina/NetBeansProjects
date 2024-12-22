
package cafe.ms;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Items extends javax.swing.JFrame {

    
    public Items() {
        initComponents();
        ShowProducts();
    }

     ResultSet rs=null, rs1=null;
     Connection con =null;
     Statement stmt=null, stmt1=null;
   
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        Pricetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Categorycmb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Filtercmb = new javax.swing.JComboBox<>();
        Addbtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        Refreshbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Items Management");

        Nametxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nametxt.setForeground(new java.awt.Color(255, 0, 51));

        Pricetxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pricetxt.setForeground(new java.awt.Color(255, 0, 51));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");

        Categorycmb.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        Categorycmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Snake", "Ice Cream", "Bread ", "Biscuits", " " }));
        Categorycmb.setName(""); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Filter");

        Filtercmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Snake", "Ice Cream", "Bread", "Biscuits", " " }));
        Filtercmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltercmbItemStateChanged(evt);
            }
        });
        Filtercmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltercmbActionPerformed(evt);
            }
        });

        Addbtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 0, 51));
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Editbtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Editbtn.setForeground(new java.awt.Color(255, 0, 51));
        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 0, 51));
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Items List");

        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductList);

        Refreshbtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Refreshbtn.setForeground(new java.awt.Color(255, 0, 51));
        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41)
                                .addComponent(Filtercmb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(Refreshbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Categorycmb, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(179, 179, 179)
                                            .addComponent(jLabel7)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(208, 208, 208)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Addbtn)
                                                .addComponent(jLabel9))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(Deletebtn)
                                        .addGap(185, 185, 185)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Editbtn))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deletebtn)
                            .addComponent(Addbtn)
                            .addComponent(Editbtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Categorycmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtercmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Refreshbtn))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("View Bills");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))))
                        .addGap(55, 55, 55)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addGap(284, 284, 284)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltercmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltercmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltercmbActionPerformed
int Pid;
private void CountProd()
{

    try{
            
         stmt1=con.createStatement();
         rs1=stmt1.executeQuery("select Max(Pid)from tbproduct");
         rs1.next();
         Pid=rs1.getInt(1)+1;
            
    }catch (Exception e){
                        
            
                }



}
    private void ShowProducts()
    {
    try{
      
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
        stmt=con.createStatement();
        rs=stmt.executeQuery("select * from tbproduct");
       ProductList.setModel(DbUtils.resultSetToTableModel(rs));
    
       
       }catch(Exception e)  {
    
     }
    
    }
    
    
     private void FilterProducts()
    {
    try{
      
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
        stmt=con.createStatement();
        rs=stmt.executeQuery("select * from tbproduct where Categorycmb='"+Filtercmb.getSelectedItem().toString()+"'");
        ProductList.setModel(DbUtils.resultSetToTableModel(rs));
      
       }catch(Exception e)  {
           JOptionPane.showMessageDialog(this,e);
    
     }
    
    }
     
    
     
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        if(Nametxt.getText().isEmpty()|| Pricetxt.getText().isEmpty()||Categorycmb.getSelectedIndex() ==-1)
        {
            
           JOptionPane.showMessageDialog(this,"Missing Information!!!");
            
          
        }else {
        try{
            CountProd();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
            PreparedStatement pst=con.prepareStatement("insert into tbproduct values(?,?,?,?)");
            pst.setInt(1, Pid);
            pst.setString(2, Nametxt.getText());
            pst.setString(3, Categorycmb.getSelectedItem().toString());
            pst.setInt(4, Integer.parseInt(Pricetxt.getText()));
            int row=pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Item Added !!!");
            con.close();
            ShowProducts();
            
            } catch (SQLException ex){
        
            JOptionPane.showMessageDialog(this,ex);
        
        
        }
        
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    
  int Key=0;
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
       DefaultTableModel model= (DefaultTableModel) ProductList.getModel();
       int MyIndex=ProductList.getSelectedRow();
       Key= Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       Nametxt.setText(model.getValueAt(MyIndex, 1).toString());
    //  Categorycmb.setText(model.getValueAt(MyIndex, 2).toString());
        Pricetxt.setText(model.getValueAt(MyIndex, 3).toString());
    
    }//GEN-LAST:event_ProductListMouseClicked

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
       if(Nametxt.getText().isEmpty()|| Pricetxt.getText().isEmpty()||Categorycmb.getSelectedIndex() ==-1)
        {
            
           JOptionPane.showMessageDialog(this,"Missing Information!!!");
            
          
        }else {
        try{
            CountProd();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
            PreparedStatement pst=con.prepareStatement("update tbproduct set Nametxt=?,Categorycmb=?,Pricetxt=? where Pid=?");
            pst.setInt(4, Key);
            pst.setString(1, Nametxt.getText());
            pst.setString(2, Categorycmb.getSelectedItem().toString());
            pst.setInt(3, Integer.valueOf(Pricetxt.getText()));
            int row=pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Item Updated !!!");
            con.close();
            ShowProducts();
            
            } catch (SQLException ex){
        
            JOptionPane.showMessageDialog(this,ex);
        
            }
        }
    }//GEN-LAST:event_EditbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
         if(Nametxt.getText().isEmpty()|| Pricetxt.getText().isEmpty()||Categorycmb.getSelectedIndex() ==-1)
        {
            
           JOptionPane.showMessageDialog(this,"Missing Information!!!");
            
        }else {
        try{
            CountProd();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcafe","root","");
            PreparedStatement pst=con.prepareStatement("delete from tbproduct where Pid=?");
            pst.setInt(1, Key);
            int row=pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Item Deleted !!!");
            con.close();
            ShowProducts();
            
            } catch (SQLException ex){
        
            JOptionPane.showMessageDialog(this,ex);
        
        
           }
        
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void FiltercmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltercmbItemStateChanged
       FilterProducts();
    }//GEN-LAST:event_FiltercmbItemStateChanged

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        ShowProducts();
    }//GEN-LAST:event_RefreshbtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    
    
    
   public static void main(String args[]) {
         
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JComboBox<String> Categorycmb;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JComboBox<String> Filtercmb;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JTable ProductList;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
