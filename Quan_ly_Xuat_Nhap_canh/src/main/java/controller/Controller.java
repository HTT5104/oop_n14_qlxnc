/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import controller.Md5;

/**
 *
 * @author ADMIN
 */
public class Controller {
    private static String temp_Id;
    
    public static int checkLogin(String id, String role, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("User.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String csvId = parts[0].trim();
                    String csvRole = parts[1].trim();
                    String csvPassword = parts[3].trim();
                    // Kiểm tra thông tin đăng nhập
                    if (csvId.equals(id) && role.equals("Manager") && csvRole.equals(role) && csvPassword.equals(Md5.encrypt(password))) {
                        return 1;
                    }
                    
                    if (csvId.equals(id) && role.equals("Staff") && csvRole.equals(role) && csvPassword.equals(Md5.encrypt(password))) {
                        
                        return 2;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 3; // Đăng nhập thất bại
    }

    public static String getTemp_Id() {
        return temp_Id;
    }

    public static void setTemp_Id(String temp_Id) {
        Controller.temp_Id = temp_Id;
    }
}
