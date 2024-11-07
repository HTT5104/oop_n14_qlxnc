package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.xml.bind.*;

public class Controller_Staff {
    private static String warning;
    
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
            
            System.out.print("Save success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

