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
public class UpdateMenuItemsGUI extends javax.swing.JFrame {
    private restaurant rest_obj=new restaurant();
    private ArrayList<restaurant> rest=rest_obj.getData();

    /**
     * Creates new form UpdateMenuItemsGUI
     */
  RestaurantLogInGUI obj=new RestaurantLogInGUI ();
    public UpdateMenuItemsGUI() {
        initComponents();
        
        Rest_Name.setText(obj.check);
          for(restaurant r:rest)
        {
            if(r.getEmail().equals(obj.check))
            {
           
                String[] itemArray=new String[r.Item.size()];
                for(int i=0;i<r.Item.size();i++)
                {
                    itemArray[i]= r.Item.get(i).getName()+" of RS "+r.Item.get(i).getPrize();
          
                }
                 jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>( itemArray));
               
            }
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

        jPanel1 = new javax.swing.JPanel();
        Rest_Name = new javax.swing.JLabel();
        PrizeInput = new javax.swing.JTextField();
        UpdateMenuButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        UpdateMenuButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        Rest_Name.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jPanel1.add(Rest_Name);
        Rest_Name.setBounds(160, 30, 400, 30);

        PrizeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrizeInputActionPerformed(evt);
            }
        });
        jPanel1.add(PrizeInput);
        PrizeInput.setBounds(410, 360, 250, 22);

        UpdateMenuButton.setBackground(new java.awt.Color(0, 255, 255));
        UpdateMenuButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        UpdateMenuButton.setText("DELETE ITEM");
        UpdateMenuButton.setBorderPainted(false);
        UpdateMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateMenuButton);
        UpdateMenuButton.setBounds(320, 430, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(410, 260, 250, 22);

        UpdateMenuButton1.setBackground(new java.awt.Color(0, 255, 255));
        UpdateMenuButton1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        UpdateMenuButton1.setText("UPDATE MENU");
        UpdateMenuButton1.setBorderPainted(false);
        UpdateMenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMenuButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateMenuButton1);
        UpdateMenuButton1.setBounds(520, 430, 150, 30);

        back.setBackground(new java.awt.Color(0, 255, 255));
        back.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back.setText("BACK");
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(880, 520, 120, 40);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/UpdateMenuItems.png"))); // NOI18N
        jPanel1.add(BackGround);
        BackGround.setBounds(0, 0, 1020, 580);

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

    private void PrizeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrizeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrizeInputActionPerformed

    private void UpdateMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMenuButtonActionPerformed
        // TODO add your handling code here:
         int index=jComboBox1.getSelectedIndex();
         rest_obj.deleteItem(obj.check, index);
         JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY");

    }//GEN-LAST:event_UpdateMenuButtonActionPerformed
    boolean flag=true;
    private void UpdateMenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMenuButton1ActionPerformed
        
        int index=jComboBox1.getSelectedIndex();
        if(flag)
        {
            if(PrizeInput.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null,"PLEASE ENTER ALL FIELDS"); 
               flag=false;
            }
        }
        if(flag){
            rest_obj.updateItem(obj.check, index,PrizeInput.getText());
            JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
        }
    }//GEN-LAST:event_UpdateMenuButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
           
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new RestaurantHomepaageGUI().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMenuItemsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuItemsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuItemsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuItemsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMenuItemsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JTextField PrizeInput;
    private javax.swing.JLabel Rest_Name;
    private javax.swing.JButton UpdateMenuButton;
    private javax.swing.JButton UpdateMenuButton1;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
