package view.staff;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author admin
 */

import view.View_Login;
import view.staff.View_Staff_Add_Record;
import controller.Controller;
import entity.Expired_Person;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import model.Model;
import view.Expired_Frame;

public class View_Staff extends javax.swing.JFrame {

    /**
     * Creates new form NhanVien
     */
    public View_Staff() {
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

        record_Button = new javax.swing.JButton();
        wanted_List_Button = new javax.swing.JButton();
        change_Pass_Button = new javax.swing.JButton();
        log_Out_Button = new javax.swing.JButton();
        id_Label = new javax.swing.JLabel();
        temp_Id_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        temp_Name_Field = new javax.swing.JLabel();
        expired_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homepage");

        record_Button.setText("Entry or Exit");
        record_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                record_ButtonActionPerformed(evt);
            }
        });

        wanted_List_Button.setText("Wanted people list");
        wanted_List_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wanted_List_ButtonActionPerformed(evt);
            }
        });

        change_Pass_Button.setText("Change password");
        change_Pass_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_Pass_ButtonActionPerformed(evt);
            }
        });

        log_Out_Button.setText("Log out");
        log_Out_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_Out_ButtonActionPerformed(evt);
            }
        });

        id_Label.setText("ID:");

        temp_Id_Label.setText(Controller.getTemp_Id());

        name_Label.setText("Name:");

        temp_Name_Field.setText(Controller.getName());

        expired_Button.setText("Expired people list");
        expired_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expired_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(log_Out_Button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wanted_List_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(record_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(id_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(temp_Id_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(temp_Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(expired_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(change_Pass_Button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(log_Out_Button)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_Label)
                    .addComponent(temp_Id_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Label)
                    .addComponent(temp_Name_Field))
                .addGap(35, 35, 35)
                .addComponent(record_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wanted_List_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expired_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(change_Pass_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void record_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_record_ButtonActionPerformed
        // TODO add your handling code here:
        View_Staff_Add_Record.run();
        dispose();
    }//GEN-LAST:event_record_ButtonActionPerformed

    private void wanted_List_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wanted_List_ButtonActionPerformed
        // TODO add your handling code here:
        View_Staff_Wanted_List.run();
        dispose();
    }//GEN-LAST:event_wanted_List_ButtonActionPerformed

    private void change_Pass_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_Pass_ButtonActionPerformed
        // TODO add your handling code here:
        View_Staff_Change_Password.run();
    }//GEN-LAST:event_change_Pass_ButtonActionPerformed

    private void log_Out_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_Out_ButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this,"Do you want to log out?", "Log out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            View_Login.run();
            dispose(); // Đóng cửa sổ hiện tại
        }
    }//GEN-LAST:event_log_Out_ButtonActionPerformed

    private void expired_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expired_ButtonActionPerformed
        // TODO add your handling code here:
        List<Expired_Person> expired_People = Model.getOverdueEntries(); // Lấy danh sách đối tượng quá hạn
        Expired_Frame.displayExpiredPeople(expired_People);
    }//GEN-LAST:event_expired_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(View_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Staff().setVisible(true);
            }
        });
    }
    
    public static void run() {
        new View_Staff().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_Pass_Button;
    private javax.swing.JButton expired_Button;
    private javax.swing.JLabel id_Label;
    private javax.swing.JButton log_Out_Button;
    private javax.swing.JLabel name_Label;
    private javax.swing.JButton record_Button;
    private javax.swing.JLabel temp_Id_Label;
    private javax.swing.JLabel temp_Name_Field;
    private javax.swing.JButton wanted_List_Button;
    // End of variables declaration//GEN-END:variables
}
