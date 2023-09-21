/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;


import BusinessLayer.Customer;
import BusinessLayer.MAIN;
import BusinessLayer.Orders;
import BusinessLayer.restaurant;
import DataLayer.CustomerData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Zain
 */

public class CustomerHomepageGUI extends javax.swing.JFrame {
 static String check1;

       //////////////////////////////////////////////////
       /////////Connecting to Business Layer/////////////
       //////////////////////////////////////////////////

    private restaurant rest_obj=new restaurant();
    private Customer   cust_obj=new Customer();
//    private ArrayList<restaurant> rest=rest_obj.getData();
    public CustomerHomepageGUI() {
        initComponents();

          RestaurantDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(rest_obj.restaurantsNames()));
          LogInGUI obj= new LogInGUI();
          customerNameWelcomeLabel.setText(obj.check);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MenuDropDown = new javax.swing.JComboBox<>();
        RestaurantDropDown = new javax.swing.JComboBox<>();
        customerNameWelcomeLabel = new javax.swing.JLabel();
        SelectedRestaurant = new javax.swing.JLabel();
        QuantitySpinner = new javax.swing.JSpinner();
        clearCartButton = new javax.swing.JButton();
        UpdateCardButton = new javax.swing.JButton();
        AddToCartButton = new javax.swing.JButton();
        checkoutButton1 = new javax.swing.JButton();
        trackORderButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        BackGround3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item Priice", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(540, 210, 360, 210);

        MenuDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        MenuDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDropDownActionPerformed(evt);
            }
        });
        jPanel2.add(MenuDropDown);
        MenuDropDown.setBounds(230, 300, 240, 22);

        RestaurantDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RestaurantDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantDropDownActionPerformed(evt);
            }
        });
        jPanel2.add(RestaurantDropDown);
        RestaurantDropDown.setBounds(230, 210, 240, 22);

        customerNameWelcomeLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jPanel2.add(customerNameWelcomeLabel);
        customerNameWelcomeLabel.setBounds(270, 30, 260, 30);
        jPanel2.add(SelectedRestaurant);
        SelectedRestaurant.setBounds(690, 180, 0, 0);
        jPanel2.add(QuantitySpinner);
        QuantitySpinner.setBounds(220, 390, 240, 22);

        clearCartButton.setBackground(new java.awt.Color(0, 255, 255));
        clearCartButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        clearCartButton.setText("CLEAR CART");
        clearCartButton.setBorderPainted(false);
        clearCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCartButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearCartButton);
        clearCartButton.setBounds(550, 510, 150, 40);

        UpdateCardButton.setBackground(new java.awt.Color(0, 255, 255));
        UpdateCardButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        UpdateCardButton.setText("UPDATE SELECTED ITEM");
        UpdateCardButton.setToolTipText("Please select the item from the cart you want to update");
        UpdateCardButton.setBorderPainted(false);
        UpdateCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCardButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateCardButton);
        UpdateCardButton.setBounds(530, 460, 180, 30);

        AddToCartButton.setBackground(new java.awt.Color(0, 255, 255));
        AddToCartButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        AddToCartButton.setText("ADD TO CART");
        AddToCartButton.setBorderPainted(false);
        AddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AddToCartButton);
        AddToCartButton.setBounds(230, 460, 170, 30);

        checkoutButton1.setBackground(new java.awt.Color(0, 255, 255));
        checkoutButton1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        checkoutButton1.setText("PLACE ORDER");
        checkoutButton1.setBorderPainted(false);
        checkoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(checkoutButton1);
        checkoutButton1.setBounds(740, 460, 150, 30);

        trackORderButton.setBackground(new java.awt.Color(0, 255, 255));
        trackORderButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        trackORderButton.setText("TRACK ORDER");
        trackORderButton.setBorderPainted(false);
        trackORderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackORderButtonActionPerformed(evt);
            }
        });
        jPanel2.add(trackORderButton);
        trackORderButton.setBounds(740, 520, 150, 30);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(160, 30, 110, 30);

        back1.setBackground(new java.awt.Color(0, 255, 255));
        back1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back1.setText("SIGN OUT");
        back1.setBorderPainted(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel2.add(back1);
        back1.setBounds(10, 510, 120, 40);

        BackGround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/HomePage_2.png"))); // NOI18N
        BackGround3.setToolTipText("");
        jPanel2.add(BackGround3);
        BackGround3.setBounds(0, 0, 1020, 569);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RestaurantDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantDropDownActionPerformed
           int index=RestaurantDropDown.getSelectedIndex();
                  MenuDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(rest_obj.restaurantItem(rest_obj.getData().get(index).getRestaurant_name())));
//               
//            }
//        }
           
        
    }//GEN-LAST:event_RestaurantDropDownActionPerformed

    private void MenuDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuDropDownActionPerformed

    private void UpdateCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCardButtonActionPerformed

        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
       if(jTable1.getRowCount()>0){ 
       int selectedRowIndex =jTable1.getSelectedRow();
       if(selectedRowIndex>=0){
       String Quantity=JOptionPane.showInputDialog(null,"ENTER QUANTITY");
       if(Quantity.equals("0"))
           tblModel.removeRow(jTable1.getSelectedRow());
       else
       tblModel.setValueAt(Quantity,selectedRowIndex,2);}}
      
        
    }//GEN-LAST:event_UpdateCardButtonActionPerformed
 
   
    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
        // TODO add your handling code here:
        
        int i=Integer.parseInt(QuantitySpinner.getValue().toString());
        if(i<1)
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID QUANTITY");
        }
        else
        { 
           DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
           if(tblModel.getRowCount()==0){
           String restaurant=RestaurantDropDown.getSelectedItem().toString();
           String item=MenuDropDown.getSelectedItem().toString();
           String quantity=QuantitySpinner.getValue().toString();
           SelectedRestaurant.setText(RestaurantDropDown.getSelectedItem().toString());
           String cart[]={restaurant,item,quantity};
           tblModel.addRow(cart);
           check1=restaurant;


           }
          
           else{
               
           //    int i=0;
               if((RestaurantDropDown.getSelectedItem().toString()).equals(SelectedRestaurant.getText()))
               {

           String restaurant=RestaurantDropDown.getSelectedItem().toString();
           String item=MenuDropDown.getSelectedItem().toString();
           String quantity=QuantitySpinner.getValue().toString();
           SelectedRestaurant.setText(RestaurantDropDown.getSelectedItem().toString());
           String cart[]={restaurant,item,quantity};
           tblModel.addRow(cart);
           check1=restaurant;

               }
               else
               {
                   JOptionPane.showMessageDialog(null,"YOU CAN'T ENTER ITEMS IN CART FROM 2 RESTAURANT AT A SAME TIME ");
                   
               }
               
           }
          

        }
    }//GEN-LAST:event_AddToCartButtonActionPerformed

    private void clearCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCartButtonActionPerformed
    DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
    int i=tblModel.getRowCount();
    for(int j=i-1;j>=0;j--)
    {
        tblModel.removeRow(j);
     
    }

    }//GEN-LAST:event_clearCartButtonActionPerformed
    
    private void checkoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButton1ActionPerformed
          
          int total=0;
          DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
       if(jTable1.getRowCount()<1)
       {
            JOptionPane.showMessageDialog(null,"PLEASE SELECT THE ITEMS ");
       }
       else
       {
    ///////////////////////////////////////////////////
    ////////////Connecting to BusinessLayer////////////
    ///////////////////////////////////////////////////
           if(cust_obj.OrderNoMoreThenOnce(customerNameWelcomeLabel.getText()))
                   
           {
                   
                   for(int i=0;i<jTable1.getRowCount();i++)
                   { 
                    
                           String price=(String) jTable1.getValueAt(i,1);
                           String[] getprice = price.split("RS ");
                           String pricee=getprice[1];
                           String item=(String)  jTable1.getValueAt(i,1);
                           String[] getitem = item.split(" of");
                           String Item=getitem[0]; 
                           String quantity=(String) jTable1.getValueAt(i,2);
                           String Restaurant=(String) jTable1.getValueAt(i,0);
                           Orders obj=Orders.newOrder(Restaurant,quantity,Item,pricee);
                           cust_obj.placeOrder(customerNameWelcomeLabel.getText(), obj);                            
                           total=total+(Integer.parseInt(quantity)*(Integer.parseInt(pricee)));
                           
                          
                   }
                   JOptionPane.showMessageDialog(null,"ORDER PLACED OF RS  "+total);
                   Customer.write();
                    
               }
                     else
               {
                   JOptionPane.showMessageDialog(null,"YOU CANT ORDER MORE THEN 1 TIME A SAME TIME");   
   
               }
//               }
             
            
              
//           }
              
       }
       
    }//GEN-LAST:event_checkoutButton1ActionPerformed

    private void trackORderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackORderButtonActionPerformed
       
        if(!cust_obj.orderStatus(customerNameWelcomeLabel.getText()))
                {
                    JOptionPane.showMessageDialog(null,"Kindly place your order first");
                    
                }
                   else
                   {
                       new TrackOrderGUI().setVisible(true);
                       this.dispose();
                   }

    }//GEN-LAST:event_trackORderButtonActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
             new LogInGUI().setVisible(true);   
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerHomepageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHomepageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHomepageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHomepageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHomepageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JLabel BackGround3;
    private javax.swing.JComboBox<String> MenuDropDown;
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JComboBox<String> RestaurantDropDown;
    private javax.swing.JLabel SelectedRestaurant;
    private javax.swing.JButton UpdateCardButton;
    private javax.swing.JButton back1;
    private javax.swing.JButton checkoutButton1;
    private javax.swing.JButton clearCartButton;
    private javax.swing.JLabel customerNameWelcomeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton trackORderButton;
    // End of variables declaration//GEN-END:variables
}
