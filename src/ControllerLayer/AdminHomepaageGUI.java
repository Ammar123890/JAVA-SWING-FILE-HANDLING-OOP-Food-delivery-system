/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;

import BusinessLayer.Customer;
import BusinessLayer.MAIN;
import BusinessLayer.admin;
import BusinessLayer.restaurant;
import DataLayer.CustomerData;
import DataLayer.RestuarantData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zain
 */
public class AdminHomepaageGUI extends javax.swing.JFrame {
    
    ///////////////////////////////////////////////////
    ////////////Connecting to BusinessLayer////////////
    ///////////////////////////////////////////////////
   
    private restaurant rest_obj=new restaurant(); 
    private admin admin_obj=new admin();
    private ArrayList<restaurant> rest=rest_obj.getData();
    
 
    
    public AdminHomepaageGUI() {
        initComponents();
        String temp="x";
        DefaultTableModel tblMode2=(DefaultTableModel)jTable2.getModel();
       
    ///////////////////////////////////////////////////
    //////////Setting table from the info that/////////
    //////////we fetched from business layer///////////
    ///////////////////////////////////////////////////
        
                for(restaurant r:rest)
                {
                    if(!rest.isEmpty())
                    if(r.isStatus()==false)
                    {
                        String name[]={r.getEmail(),r.getRestaurant_name(),r.getAddress(),r.getPhoneNumber()};
                           if(!temp.equals(r.getEmail()))
                               {
                                      tblMode2.addRow(name);
                                      temp=r.getEmail();
                    
                                }
                    }
                }
                
        String temp2="x";        
        DefaultTableModel tblMode1=(DefaultTableModel)jTable1.getModel();
                 for(Customer r:Customer.getData())
                {
                    if(r.isStatus()==false)
                    {
                        String name[]={r.getEmail(),r.getUsername(),r.getAddress(),r.getPhoneNumber()};
                           if(!temp.equals(r.getEmail()))
                               {
                                      tblMode1.addRow(name);
                                      temp=r.getEmail();
                    
                                }
                    }
                }      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back1 = new javax.swing.JButton();
        Accept_Restaurant = new javax.swing.JButton();
        Accept_Custoner = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        back1.setBackground(new java.awt.Color(0, 255, 255));
        back1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back1.setText("SIGN OUT");
        back1.setBorderPainted(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1);
        back1.setBounds(10, 510, 120, 40);

        Accept_Restaurant.setBackground(new java.awt.Color(0, 255, 255));
        Accept_Restaurant.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        Accept_Restaurant.setText("ACCEPT");
        Accept_Restaurant.setBorderPainted(false);
        Accept_Restaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept_RestaurantActionPerformed(evt);
            }
        });
        jPanel1.add(Accept_Restaurant);
        Accept_Restaurant.setBounds(170, 460, 160, 30);

        Accept_Custoner.setBackground(new java.awt.Color(0, 255, 255));
        Accept_Custoner.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        Accept_Custoner.setText("ACCEPT");
        Accept_Custoner.setBorderPainted(false);
        Accept_Custoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept_CustonerActionPerformed(evt);
            }
        });
        jPanel1.add(Accept_Custoner);
        Accept_Custoner.setBounds(663, 460, 160, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "User Name", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 190, 420, 230);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Restaurant Name", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 190, 420, 230);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/AdminHomepaage.png"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-6, 0, 1020, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new AdminLogInGUI().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_back1ActionPerformed

    int selected2;
    private void Accept_CustonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accept_CustonerActionPerformed
        
     
              DefaultTableModel tblMode1=(DefaultTableModel)jTable1.getModel();
       
       if(jTable1.getRowCount()>0)
       {
          selected2=jTable1.getSelectedRow();  

       
        String temp=tblMode1.getValueAt(selected,0).toString();
        if(admin_obj.acceptCustomer(temp))
        {
            tblMode1.removeRow(selected);
            JOptionPane.showMessageDialog(null,"Accepted successfully");
        }
       }else
       {
           JOptionPane.showMessageDialog(null,"PLEASE SELECT THE REQUEST ");
       }
    }//GEN-LAST:event_Accept_CustonerActionPerformed
    private int  selected;
    private void Accept_RestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accept_RestaurantActionPerformed
        
       DefaultTableModel tblMode2=(DefaultTableModel)jTable2.getModel();
       
       if(jTable2.getRowCount()>0)
       {
       selected=jTable2.getSelectedRow();  
        String temp=tblMode2.getValueAt(selected,0).toString();
        if(admin_obj.acceptRestaurant(temp))
        {
            tblMode2.removeRow(selected);
            JOptionPane.showMessageDialog(null,"Accepted successfully");
            
        }
       
    }//GEN-LAST:event_Accept_RestaurantActionPerformed
    }  
    
    
    
    
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
            java.util.logging.Logger.getLogger(AdminHomepaageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomepaageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomepaageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomepaageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomepaageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept_Custoner;
    private javax.swing.JButton Accept_Restaurant;
    private javax.swing.JLabel Background;
    private javax.swing.JButton back1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
