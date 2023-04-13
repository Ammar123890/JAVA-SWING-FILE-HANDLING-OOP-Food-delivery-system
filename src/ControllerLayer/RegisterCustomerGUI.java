/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;

import BusinessLayer.Customer;
import BusinessLayer.MAIN;
import BusinessLayer.restaurant;
import DataLayer.CustomerData;
import javax.swing.JOptionPane;

/**
 *
 * @author Zain
 */
public class RegisterCustomerGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterCustomerGUI
     */
    public RegisterCustomerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        RegisterCustomerButton = new javax.swing.JButton();
        PhoneNoInput = new javax.swing.JTextField();
        FullNameInput2 = new javax.swing.JTextField();
        EmailIDInput = new javax.swing.JTextField();
        AddressInput2 = new javax.swing.JTextField();
        PasswordInput2 = new javax.swing.JTextField();
        back3 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(null);

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
        jPanel3.add(RegisterCustomerButton);
        RegisterCustomerButton.setBounds(350, 460, 310, 23);

        PhoneNoInput.setBorder(null);
        PhoneNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoInputActionPerformed(evt);
            }
        });
        jPanel3.add(PhoneNoInput);
        PhoneNoInput.setBounds(410, 330, 240, 20);

        FullNameInput2.setBorder(null);
        FullNameInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameInput2ActionPerformed(evt);
            }
        });
        jPanel3.add(FullNameInput2);
        FullNameInput2.setBounds(400, 260, 310, 20);

        EmailIDInput.setBorder(null);
        EmailIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailIDInputActionPerformed(evt);
            }
        });
        jPanel3.add(EmailIDInput);
        EmailIDInput.setBounds(400, 290, 240, 20);

        AddressInput2.setBorder(null);
        AddressInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressInput2ActionPerformed(evt);
            }
        });
        jPanel3.add(AddressInput2);
        AddressInput2.setBounds(420, 420, 240, 16);

        PasswordInput2.setBorder(null);
        PasswordInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordInput2ActionPerformed(evt);
            }
        });
        jPanel3.add(PasswordInput2);
        PasswordInput2.setBounds(410, 370, 240, 20);

        back3.setBackground(new java.awt.Color(0, 255, 255));
        back3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back3.setText("BACK");
        back3.setBorderPainted(false);
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        jPanel3.add(back3);
        back3.setBounds(870, 510, 120, 40);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterfaceLayer/CustomerRegister.png"))); // NOI18N
        jPanel3.add(BackGround);
        BackGround.setBounds(0, 0, 1020, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameInput2ActionPerformed

    }//GEN-LAST:event_FullNameInput2ActionPerformed

    private void EmailIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIDInputActionPerformed

    private void PhoneNoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoInputActionPerformed

    private void PasswordInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordInput2ActionPerformed

    private void AddressInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressInput2ActionPerformed
    
                   ///////////////////////////////////////////////////
                   ////////////Connecting to BusinessLayer////////////
                   ///////////////////////////////////////////////////
    private boolean flag=true;
    private Customer   cust_obj=new Customer();
    private void RegisterCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerButtonActionPerformed
     if(FullNameInput2.getText().isEmpty() || EmailIDInput.getText().isEmpty() || PhoneNoInput.getText().isEmpty()
               || PasswordInput2.getText().isEmpty() || AddressInput2.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"PLEASE ENTER ALL FILEDS");
           flag=false;
       }

             if(flag&& !cust_obj.ActiveCustomers())
             
             {
                 if(cust_obj.checkRegisteration(EmailIDInput.getText()))
                 {
                     if(cust_obj.verification(EmailIDInput.getText()))
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
        String name=FullNameInput2.getText().trim();
        String email=EmailIDInput.getText().trim();
        String phone=PhoneNoInput.getText().trim();
        String  pass=PasswordInput2.getText().trim();
        String address=AddressInput2.getText().trim();
        Customer customers=new Customer( address,name,pass, phone,email);
        Customer.getData().add(customers); 
        Customer.write();
        JOptionPane.showMessageDialog(null,"Requested successfully");
       }
    }//GEN-LAST:event_RegisterCustomerButtonActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        new LogInGUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(RegisterCustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCustomerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressInput2;
    private javax.swing.JLabel BackGround;
    private javax.swing.JTextField EmailIDInput;
    private javax.swing.JTextField FullNameInput2;
    private javax.swing.JTextField PasswordInput2;
    private javax.swing.JTextField PhoneNoInput;
    private javax.swing.JButton RegisterCustomerButton;
    private javax.swing.JButton back3;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}