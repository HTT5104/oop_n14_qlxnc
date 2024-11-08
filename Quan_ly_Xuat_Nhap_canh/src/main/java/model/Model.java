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
}
