/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Model {
    public static void saveRecord(String time, String type, String type_customer, String airport, String airport_Id, String flight,
            String airline, int gate, String name, String nation, String dob, boolean isMale, String reason, int stay, String locates,
            String id_Card, String birth_Cert, String passport, String visa) {
        File fileToSave = new File("record.csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave, true))) {
            if (fileToSave.length() > 0) {
                writer.newLine();  // Chỉ thêm dòng mới nếu file không trống
            }
            writer.write(time + "," + type + "," + type_customer + "," + airport + "," + airport_Id + "," + flight + "," + airline
                    + "," + gate + "," + name + "," + nation + "," + dob + "," + isMale + "," + reason + "," + stay + "," + locates
                    + "," + id_Card + "," + birth_Cert + "," + passport + "," + visa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DefaultTableModel load_Record_Data(DefaultTableModel model) {
        try (BufferedReader reader = new BufferedReader(new FileReader("record.csv"))) {
            String line;
            reader.readLine(); // Bỏ qua dòng tiêu đề

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Đảm bảo mảng data có độ dài là 19 bằng cách thêm "N/A" vào các trường còn thiếu
                String[] completeData = new String[19];
                for (int i = 0; i < 19; i++) {
                    if (i < data.length && data[i] != null && !data[i].trim().isEmpty()) {
                        completeData[i] = data[i];
                    } else {
                        completeData[i] = "N/A"; // Giá trị mặc định nếu dữ liệu rỗng hoặc thiếu
                    }
                }

                // Thêm dòng hoàn chỉnh vào model
                model.addRow(completeData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }
    
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
    
    public static DefaultTableModel load_Wanted_Data(DefaultTableModel model) {
        try (BufferedReader reader = new BufferedReader(new FileReader("wanted.csv"))) {
            String line;
            reader.readLine(); // Bỏ qua dòng tiêu đề

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2) {
                    model.addRow(new Object[] { data[0], data[1] });
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }
    
    public static void deleteWanted(String nation, String passport) {
        File file = new File("Wanted.csv");
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine(); // Lưu dòng tiêu đề
            lines.add(line);

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (!(data[0].equals(nation) && data[1].equals(passport))) {  // Bỏ qua dòng có cả nation và passport cần xóa
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
    
    public static void count_Entry_Exit(String targetNation, String targetPassport) {
        File file = new File("record.csv");
        int entryCount = 0;
        int exitCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Kiểm tra xem dòng có đủ cột dữ liệu không
                if (data.length >= 19) { 
                    String nation = data[10];       // `nation` ở vị trí 11
                    String passport = data[16];     // `passport` ở vị trí 17
                    String type = data[1];          // `type` ở vị trí 2

                    // Kiểm tra nếu nation và passport trùng khớp
                    if (nation.equals(targetNation) && passport.equals(targetPassport)) {
                        if (type.equals("Entry")) {
                            entryCount++;
                        } else if (type.equals("Exit")) {
                            exitCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
