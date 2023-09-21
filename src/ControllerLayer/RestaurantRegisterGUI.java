/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;

import BusinessLayer.restaurant;
import DataLayer.RestuarantData;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zain
 */
public class RestaurantRegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantRegister
     */
    public RestaurantRegisterGUI() {
        initComponents();
        
        
    }
    private restaurant rest_obj=new restaurant();
//    private ArrayList<restaurant> rest=rest_obj.getData();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmailIDInput = new javax.swing.JTextField();
        FullNameInput = new javax.swing.JTextField();
        PhoneNoInput = new javax.swing.JTextField();
        PasswordInput = new javax.swing.JTextField();
        AddressInput = new javax.swing.JTextField();
        OwnerNameInput = new javax.swing.JTextField();
        RegisterCustomerButton = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        BackGround5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        EmailIDInput.setBorder(null);
        EmailIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailIDInputActionPerformed(evt);
            }
        });
        jPanel1.add(EmailIDInput);
        EmailIDInput.setBounds(440, 290, 240, 20);

        FullNameInput.setBorder(null);
        FullNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(FullNameInput);
        FullNameInput.setBounds(440, 260, 240, 20);

        PhoneNoInput.setBorder(null);
        PhoneNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoInputActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneNoInput);
        PhoneNoInput.setBounds(440, 320, 240, 20);

        PasswordInput.setBorder(null);
        PasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordInputActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordInput);
        PasswordInput.setBounds(440, 350, 240, 20);

        AddressInput.setBorder(null);
        AddressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressInputActionPerformed(evt);
            }
        });
        jPanel1.add(AddressInput);
        AddressInput.setBounds(440, 386, 240, 16);

        OwnerNameInput.setBorder(null);
        OwnerNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(OwnerNameInput);
        OwnerNameInput.setBounds(440, 416, 240, 16);

        RegisterCustomerButton.setBackground(new java.awt.Color(23, 36, 42));
        RegisterCustomerButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        RegisterCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCustomerButton.setText("CREATE ACCOUNT");
        RegisterCustomerButton.setBorderPainted(false);
        RegisterCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterCustomerButton);
        RegisterCustomerButton.setBounds(350, 460, 310, 23);

        back3.setBackground(new java.awt.Color(0, 255, 255));
        back3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back3.setText("BACK");
        back3.setBorderPainted(false);
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        jPanel1.add(back3);
        back3.setBounds(870, 510, 120, 40);

        BackGround5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RestaurantRegister.png"))); // NOI18N
        jPanel1.add(BackGround5);
        BackGround5.setBounds(0, 0, 1020, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIDInputActionPerformed

    private void FullNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameInputActionPerformed

    }//GEN-LAST:event_FullNameInputActionPerformed

    private void OwnerNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwnerNameInputActionPerformed
     boolean flag=true;
    private void RegisterCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerButtonActionPerformed
     if(FullNameInput.getText().isEmpty() || EmailIDInput.getText().isEmpty() || PhoneNoInput.getText().isEmpty()
            || PasswordInput.getText().isEmpty() || AddressInput.getText().isEmpty()||OwnerNameInput.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER ALL FILEDS");
            flag=false;
        }
     
             if(flag&& !rest_obj.ActiveCustomers())
             
             {
                 if(rest_obj.checkRegisteration(EmailIDInput.getText()))
                 {
                     if(rest_obj.verification(EmailIDInput.getText()))
                     {
                         flag=false;
                         JOptionPane.showMessageDialog(null,"EMAIL ALREADY REGISTER");
                       
                     }
                     else
                     {
                         flag=false;
                         JOptionPane.showMessageDialog(null,"Request in process");
                         
                     }
                 }

             }
     
        if(flag){
            String name=FullNameInput.getText().trim();
            String email=EmailIDInput.getText().trim();
            String phone=PhoneNoInput.getText().trim();
            String  pass=PasswordInput.getText().trim();
            String address=AddressInput.getText().trim();
            String owner=OwnerNameInput.getText().trim();
//            Customer customers=new Customer( name, email, phone,pass,address);
            restaurant obj=new restaurant(address,name,owner,pass,phone,email);
            rest_obj.getData().add(obj);
           restaurant.write_R();
     
            
            JOptionPane.showMessageDialog(null,"RESTAURANT REGISTERATION REQUESTED SUCCESSFULLY ");
        }       
    }//GEN-LAST:event_RegisterCustomerButtonActionPerformed

    private void PhoneNoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoInputActionPerformed

    private void PasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordInputActionPerformed

    private void AddressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressInputActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        new RestaurantLogInGUI().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_back3ActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurantRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantRegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressInput;
    private javax.swing.JLabel BackGround5;
    private javax.swing.JTextField EmailIDInput;
    private javax.swing.JTextField FullNameInput;
    private javax.swing.JTextField OwnerNameInput;
    private javax.swing.JTextField PasswordInput;
    private javax.swing.JTextField PhoneNoInput;
    private javax.swing.JButton RegisterCustomerButton;
    private javax.swing.JButton back3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
