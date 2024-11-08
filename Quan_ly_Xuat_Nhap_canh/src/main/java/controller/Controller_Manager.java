/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    private static boolean isNationAndPassportExists(String nation, String passport, File file) {
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
}
