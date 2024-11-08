/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import entity.Expired_Person; // Giả sử có class chứa thông tin của các đối tượng quá hạn

public class Expired_Frame extends JFrame {

    private JTable overdueTable;

    public Expired_Frame(List<Expired_Person> expired_People) {
        setTitle("Expired people list");
        setSize(1200, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        String[] columnNames = {"Time", "Name", "Nation", "Passport", "Expiry Date"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        for (Expired_Person ex_person : expired_People) {
            model.addRow(new Object[]{
                ex_person.getTime(),
                ex_person.getName(),
                ex_person.getNation(),
                ex_person.getPassport(),
                ex_person.getExpiryDate()
            });
        }

        overdueTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(overdueTable);
        
        add(scrollPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

    public static void displayExpiredPeople(List<Expired_Person> expired_People) {
        Expired_Frame frame = new Expired_Frame(expired_People);
        frame.setVisible(true);
    }
}