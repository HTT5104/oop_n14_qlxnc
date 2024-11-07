package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import view.staff.View_Staff;
import controller.Controller;
import controller.Md5;
import view.manager.View_Manager;
/**
 *
 * @author admin
 */
public class View_Login extends javax.swing.JFrame {
    public javax.swing.JButton getLoginButton(){
        return login_Button;
    }
    /**
     * Creates new form DangNhap
     */
    public View_Login() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        login_Frame_Label = new javax.swing.JLabel();
        role_Combobox = new javax.swing.JComboBox<>();
        role_Label = new javax.swing.JLabel();
        id_Label = new javax.swing.JLabel();
        password_Label = new javax.swing.JLabel();
        id_Field = new javax.swing.JTextField();
        login_Button = new javax.swing.JButton();
        password_Field = new javax.swing.JPasswordField();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        login_Frame_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_Frame_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_Frame_Label.setText("Log in");

        role_Combobox.setEditable(true);
        role_Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staff" }));
        role_Combobox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                role_ComboboxPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        role_Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_ComboboxActionPerformed(evt);
            }
        });

        role_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        role_Label.setText("Role:");

        id_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_Label.setText("Id:");

        password_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_Label.setText("Password");

        id_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_FieldActionPerformed(evt);
            }
        });

        login_Button.setBackground(new java.awt.Color(51, 102, 255));
        login_Button.setForeground(new java.awt.Color(255, 255, 255));
        login_Button.setText("Log in");
        login_Button.setOpaque(true);
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(login_Button)
                .addGap(155, 264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_Frame_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(role_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(role_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password_Label)
                                .addComponent(id_Label))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(password_Field)))))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(login_Frame_Label)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role_Label)
                    .addComponent(role_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_Label)
                    .addComponent(id_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_Label)
                    .addComponent(password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(login_Button)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_FieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_id_FieldActionPerformed

    private void role_ComboboxPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_role_ComboboxPopupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_role_ComboboxPopupMenuCanceled

    private void role_ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_ComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role_ComboboxActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
        // TODO add your handling code here:
        switch (Controller.checkLogin(id_Field.getText(), (String)role_Combobox.getSelectedItem(), String.valueOf(password_Field.getPassword()))) {
            case 1:
                View_Manager.run();
                Controller.setTemp_Id(id_Field.getText());
                dispose();
                break;
            case 2:
                View_Staff.run();
                Controller.setTemp_Id(id_Field.getText());
                dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong ID or password", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_login_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_Field;
    private javax.swing.JLabel id_Label;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton login_Button;
    private javax.swing.JLabel login_Frame_Label;
    private javax.swing.JPasswordField password_Field;
    private javax.swing.JLabel password_Label;
    private javax.swing.JComboBox<String> role_Combobox;
    private javax.swing.JLabel role_Label;
    // End of variables declaration//GEN-END:variables
}
