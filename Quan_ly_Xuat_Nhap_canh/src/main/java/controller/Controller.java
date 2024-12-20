/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import controller.Md5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Model;

/**
 *
 * @author ADMIN
 */
public class Controller {
    private static String temp_Id;
    private static String temp_Name;
    
    public static int checkLogin(String id, String role, String password) {
        // Sử dụng ClassLoader để tải file CSV từ classpath
        File file = new File(Model.getUser_Path());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String csvId = parts[0].trim();
                    String csvName = parts[2].trim();
                    String csvRole = parts[1].trim();
                    String csvPassword = parts[3].trim();
                    // Kiểm tra thông tin đăng nhập
                    if (csvId.equals(id) && role.equals("Manager") && csvRole.equals(role) && csvPassword.equals(Md5.encrypt(password))) {
                        temp_Id = id;
                        temp_Name = csvName;
                        return 1;
                    }

                    if (csvId.equals(id) && role.equals("Staff") && csvRole.equals(role) && csvPassword.equals(Md5.encrypt(password))) {
                        temp_Id = id;
                        temp_Name = csvName;
                        return 2;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 3; // Đăng nhập thất bại
    }
    
    public static int changePassword(String old_Password, String new_Password, String confirm_Password) { 
        File file = new File(Model.getUser_Path());
        List<String> lines = new ArrayList<>();
        boolean isUpdated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String csvId = parts[0].trim();
                    String csvPassword = parts[3].trim();

                    // Kiểm tra thông tin đăng nhập
                    if (temp_Id.equals(csvId)) {
                        if (Md5.encrypt(old_Password).equals(csvPassword)) {
                            if (new_Password.equals(confirm_Password)) {
                                // Cập nhật mật khẩu trong dòng này
                                parts[3] = Md5.encrypt(new_Password);
                                line = String.join(",", parts);
                                isUpdated = true;
                            } else {
                                return 2; // Xác nhận mật khẩu không khớp
                            }
                        } else {
                            return 1; // Mật khẩu cũ không đúng
                        }
                    }
                }
                lines.add(line); // Thêm dòng vào danh sách
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ghi lại nội dung đã cập nhật vào file
        if (isUpdated) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return 0; // Đổi mật khẩu thành công
        }

        return 3; // Không tìm thấy id
    }

    public static boolean isValidDate(String dateStr) {
        // Định dạng ngày tháng năm
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // Không cho phép ngày không hợp lệ

        try {
            // Thử phân tích chuỗi thành ngày tháng năm
            sdf.parse(dateStr);
            String[] parts = dateStr.split("-");
            int day = Integer.parseInt(parts[2]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[0]);

            // Kiểm tra số ngày hợp lệ cho từng tháng
            int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            // Nếu là năm nhuận và tháng 2 thì có 29 ngày
            if (isLeapYear(year) && month == 2) {
                daysInMonth[2] = 29;
            }

            // Kiểm tra ngày hợp lệ
            return day >= 1 && day <= daysInMonth[month];
        } catch (ParseException | NumberFormatException e) {
            // Nếu có lỗi khi phân tích, nghĩa là ngày không hợp lệ
            return false;
        }
    }

    // Kiểm tra xem năm có phải là năm nhuận không
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static String getTemp_Id() {
        return temp_Id;
    }

    public static void setTemp_Id(String temp_Id) {
        Controller.temp_Id = temp_Id;
    }

    public static String getName() {
        return temp_Name;
    }

    public static void setName(String name) {
        Controller.temp_Name = name;
    }
}
