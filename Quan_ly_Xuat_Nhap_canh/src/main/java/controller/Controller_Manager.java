/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Model;
import view.manager.View_Add_Staff;
import view.manager.View_Manager_Wanted_List;

/**
 *
 * @author ADMIN
 */
public class Controller_Manager {
    public static void addUser(String id, String role, String name) {
        File fileToSave = new File("User.csv");

        // Kiểm tra xem id có tồn tại trong file không
        if (isIdExists(id, fileToSave)) {
            JOptionPane.showMessageDialog(null, "ID already exists. User not added");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave, true))) {
            if (fileToSave.length() > 0) {
                writer.newLine();  // Chỉ thêm dòng mới nếu file không trống
            }
            writer.write(id + "," + role + "," + name + "," + "dd4b21e9ef71e1291183a46b913ae6f2");
            JOptionPane.showMessageDialog(null, "Sucess. Press Update to see new list");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addWanted(String nation, String passport) {
        File fileToSave = new File("wanted.csv");

        // Kiểm tra xem id có tồn tại trong file không
        // Kiểm tra xem cặp nation và passport có tồn tại không
        if (isNationAndPassportExists(nation, passport, fileToSave)) {
            JOptionPane.showMessageDialog(null, "This wanted person already exist. Can not added.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave, true))) {
            if (fileToSave.length() > 0) {
                writer.newLine();  // Chỉ thêm dòng mới nếu file không trống
            }
            writer.write(nation + "," + passport);
            JOptionPane.showMessageDialog(null, "Sucess. Press Update to see new list");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Hàm kiểm tra id đã tồn tại hay chưa
    private static boolean isIdExists(String id, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(id)) {
                    return true; // ID đã tồn tại
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Hàm kiểm tra xem nation và passport có tồn tại không
    public static boolean isNationAndPassportExists(String nation, String passport, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2 && data[0].equals(nation) && data[1].equals(passport)) {
                    return true; // Nation và passport đã tồn tại
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void applyFilterPassport(TableRowSorter<DefaultTableModel> sorter, String text) {
        if (text.trim().isEmpty()) {
            sorter.setRowFilter(null); // Hiện tất cả dữ liệu nếu không có bộ lọc
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text,1)); // Lọc dữ liệu khớp với văn bản
        }
    }
    
    public static DefaultTableModel load_Filter_Record_Data(DefaultTableModel model, LocalDateTime fromDate, LocalDateTime toDate,
                                                            boolean type_Entry, boolean type_Exit,
                                                            boolean cusType_Id_Card, boolean cusType_Birth_Cert,
                                                            boolean cusType_Non_Visa, boolean cusType_Visa) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (int line = 0; line<model.getRowCount();line++) {
            LocalDateTime entryTime = LocalDateTime.parse((String)model.getValueAt(line, 0), formatter);
            if(entryTime.isBefore(fromDate) || entryTime.isAfter(toDate)){
                model.removeRow(line);
                line = line - 1;
                continue;
            }
            if(type_Entry==false){
                if (model.getValueAt(line, 1).toString().equals("Entry")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
            if(type_Exit==false){
                if (model.getValueAt(line, 1).toString().equals("Exit")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
            if(cusType_Id_Card==false){
                if (model.getValueAt(line, 2).toString().equals("Domestic (ID card)")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
            if(cusType_Birth_Cert==false){
                if (model.getValueAt(line, 2).toString().equals("Domestic (Birth cert)")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
            if(cusType_Non_Visa==false){
                if (model.getValueAt(line, 2).toString().equals("Foreign (Non Visa)")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
            if(cusType_Visa==false){
                if (model.getValueAt(line, 2).toString().equals("Foreign (Visa)")) {
                    model.removeRow(line);
                    line = line - 1;
                    continue;
                }
            }
        }
        return model;
    }
}
