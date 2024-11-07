/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.manager.View_Add_Staff;

/**
 *
 * @author ADMIN
 */
public class Controller_Manager {
    public static DefaultTableModel load_User_Data(DefaultTableModel model) {
        try (BufferedReader reader = new BufferedReader(new FileReader("User.csv"))) {
            String line;
            reader.readLine(); // Bỏ qua dòng tiêu đề

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 4) {
                    model.addRow(new Object[] { data[0], data[1], data[2]});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }
    
    public static void deleteUserById(String id) {
        File file = new File("User.csv");
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine(); // Lưu dòng tiêu đề
            lines.add(line);

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (!data[0].equals(id)) {  // Bỏ qua dòng có id cần xóa
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
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
            JOptionPane.showMessageDialog(null, "Sucess");
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
}
