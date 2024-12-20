       
package classwork;

import java.awt.HeadlessException;
import java.awt.print.*;
import java.sql.*;
import java.text.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TeacherForm extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
DefaultTableModel dtm;
    Statement stmt;
    ResultSet rs;
    
     
    public TeacherForm() {
        initComponents();
        
        fillcombox();
        currentDate();
    }

    public void currentDate()
    {
      Calendar cal=new GregorianCalendar();
      
      int month=cal.get(Calendar.MONTH);
      int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      date_tx.setText(year+"/"+(month+1)+"/"+day);
      
    }
    public void updateTable()
    {
        try
        {
            conn=Myconnection.ConnectDB();
            String sql="select * from tbteacher";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //viewTable.setModel(Dbutils.setM)
            
        }
        catch(Exception e)
        {
            
        }
        
    }
     public void fillcombox()
    {
        try
        {
               conn=Myconnection.ConnectDB();
            String sql="select * from tbteacher";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
                String name=rs.getString("tid");
                mycombobox.addItem(name);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
        
    public void showData()
    {   
        
          dtm=(DefaultTableModel)viewTable.getModel();
        
          conn=Myconnection.ConnectDB();
       
        
        try{
             stmt=conn.createStatement();
            String sql="select * from tbteacher";
             dtm.setRowCount(0);
            
           ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                dtm.addRow(new Object[]{rs.getString("tid"),rs.getString("tfname"),rs.getString("tlname"),rs.getString("taddress")});
           
                
            }
                conn.close();
        }

        catch(Exception e){
            System.out.println("not"+e);
        }
        
    }
    
    public void myres()
{
    tid.setText("");
    tfname.setText("");
    tlname.setText("");
    tAddress.setText("");
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mycombobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        tlname = new javax.swing.JTextField();
        jDateChooser1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btndisplay = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        date_tx = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country ", "Nepal", "India", "China" }));
        mycombobox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                mycomboboxComponentRemoved(evt);
            }
        });
        mycombobox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                mycomboboxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        mycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mycomboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by ID/Name/Address");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel2.setText("TID");

        jLabel3.setText("FirstName");

        jLabel4.setText("LastName");

        jLabel5.setText("DOB");

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TeacherID", "Firstname", "Lastname", "Address"
            }
        ));
        jScrollPane1.setViewportView(viewTable);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btndisplay.setText("Display");

        jLabel6.setText("Address");

        jLabel7.setText("TeacherForm");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        menuHelp.setText("Help");
        menuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuHelp);

        date_tx.setText("Date");
        jMenuBar1.add(date_tx);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(28, 28, 28)
                        .addComponent(btnSearch)
                        .addGap(28, 28, 28)
                        .addComponent(btnPrint)
                        .addGap(29, 29, 29)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndisplay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(mycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tid, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(tfname)
                                    .addComponent(tlname)
                                    .addComponent(tAddress)
                                    .addComponent(jDateChooser1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel7)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(mycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(btnPrint)
                    .addComponent(btnReset)
                    .addComponent(btndisplay))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mycomboboxComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_mycomboboxComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_mycomboboxComponentRemoved

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        conn=Myconnection.ConnectDB();
         try{
         Statement stmt= conn.createStatement();
          String qry= "insert into tbteacher(tid,tfname,tlname,taddress)values('"+tid.getText()+"','"+tfname.getText()+"','"+tlname.getText()+"','"+tAddress.getText()+"')";
            
          stmt.executeUpdate(qry);
            
            
            JOptionPane.showMessageDialog(this,"Successfully inserted","Teacher",JOptionPane.INFORMATION_MESSAGE);
       myres();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            conn=Myconnection.ConnectDB();

            String sql= "update tbteacher set tfname='"+tfname.getText()+"',tlname='"+tlname.getText()+ "',taddress='"+tAddress.getText()+"' where tid='"+tid.getText()+ "'";

            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            myres();
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                conn=Myconnection.ConnectDB();
                String sql= "delete from tbteacher where tid= '" + tid.getText() + "'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
          myres();

            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         conn=Myconnection.ConnectDB();
        String sql= "select * from tbteacher where tid= '" + tid.getText() + "'";
        try
        {
            pst=conn.prepareStatement(sql);
            rs= pst.executeQuery();
            if (rs.next()){
                tfname.setText(rs.getString("tfname"));
                tfname.setEditable(false);

                tlname.setText(rs.getString("tlname"));
              tlname.setEditable(false);
              
              tAddress.setText(rs.getString("taddress"));
              tAddress.setEditable(false);

               
            }
            else{

                JOptionPane.showMessageDialog(null, "Please enter valid Employee Id!","Access denied",JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    
    private void mycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mycomboboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mycomboboxActionPerformed

    private void mycomboboxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_mycomboboxPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp=(String)mycombobox.getSelectedItem();
            String sq="select * from tbteacher where tid=?";
           
        try
        {
            pst=conn.prepareStatement(sq);
            pst.setString(1, tmp);
            
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                String teacherid=rs.getString("tid");
                tid.setText(teacherid);
                String teacherfname=rs.getString("tfname");
                tfname.setText(teacherfname);
                String teacherlname=rs.getString("tlname");
                tlname.setText(teacherlname);
                String teacheraddress=rs.getString("taddress");
                tAddress.setText(teacheraddress);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_mycomboboxPopupMenuWillBecomeInvisible

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        myres();
    }//GEN-LAST:event_btnResetActionPerformed

    private void menuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpActionPerformed
        // TODO add your handling code here:
         try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"B:\\javaphp book\\SL-275-SE6.pdf");
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_menuHelpActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        try
        {
            String sq="select * from tbteacher where tfname=?";
            pst=conn.prepareStatement(sq);
            pst.setString(1, txtsearch.getText());
            
            
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                String teacherid=rs.getString("tid");
                tid.setText(teacherid);
                String teacherfname=rs.getString("tfname");
                tfname.setText(teacherfname);
                String teacherlname=rs.getString("tlname");
                tlname.setText(teacherlname);
                String teacheraddress=rs.getString("taddress");
                tAddress.setText(teacheraddress);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
         try
        {
            String sq="select * from tbteacher where tid=?";
            pst=conn.prepareStatement(sq);
            pst.setString(1, txtsearch.getText());
            
            
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                String teacherid=rs.getString("tid");
                tid.setText(teacherid);
                String teacherfname=rs.getString("tfname");
                tfname.setText(teacherfname);
                String teacherlname=rs.getString("tlname");
                tlname.setText(teacherlname);
                String teacheraddress=rs.getString("taddress");
                tAddress.setText(teacheraddress);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
         try
        {
            String sq="select * from tbteacher where tlname=?";
            pst=conn.prepareStatement(sq);
            pst.setString(1, txtsearch.getText());
            
            
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                String teacherid=rs.getString("tid");
                tid.setText(teacherid);
                String teacherfname=rs.getString("tfname");
                tfname.setText(teacherfname);
                String teacherlname=rs.getString("tlname");
                tlname.setText(teacherlname);
                String teacheraddress=rs.getString("taddress");
                tAddress.setText(teacheraddress);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
         try
        {
            String sq="select * from tbteacher where taddress=?";
            pst=conn.prepareStatement(sq);
            pst.setString(1, txtsearch.getText());
            
            
            
            rs=pst.executeQuery();
            if(rs.next())
            {
                String teacherid=rs.getString("tid");
                tid.setText(teacherid);
                String teacherfname=rs.getString("tfname");
                tfname.setText(teacherfname);
                String teacherlname=rs.getString("tlname");
                tlname.setText(teacherlname);
                String teacheraddress=rs.getString("taddress");
                tAddress.setText(teacheraddress);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
           viewTable.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    
     
   
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
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btndisplay;
    private javax.swing.JMenu date_tx;
    private javax.swing.JTextField jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JComboBox<String> mycombobox;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tlname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables

    
}
