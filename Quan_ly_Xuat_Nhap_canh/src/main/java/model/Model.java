/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Expired_Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import view.manager.View_Manager;

/**
 *
 * @author ADMIN
 */
public class Model {
    
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static String record_Path;
    private static String user_Path;
    private static String wanted_Path;

    public static String getRecord_Path() {
        return record_Path;
    }

    public static void setRecord_Path(String record_Path) {
        Model.record_Path = record_Path;
    }

    public static String getUser_Path() {
        return user_Path;
    }

    public static void setUser_Path(String user_Path) {
        Model.user_Path = user_Path;
    }

    public static String getWanted_Path() {
        return wanted_Path;
    }

    public static void setWanted_Path(String wanted_Path) {
        Model.wanted_Path = wanted_Path;
    }

public static void saveRecord(String time, String type, String type_customer, String airport, String airport_Id, String flight,
        String airline, Integer gate, String name, String nation, String dob, Boolean isMale, String reason, Integer stay, String locates,
        String id_Card, String birth_Cert, String passport, String visa) {
    File fileToSave = new File(Model.getRecord_Path());
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave, true))) {
        if (fileToSave.length() > 0) {
            writer.newLine();  // Chỉ thêm dòng mới nếu file không trống
        }
        
        // Xử lý giá trị rỗng
        String timeValue = (time == null || time.trim().isEmpty()) ? "N/A" : time;
        String typeValue = (type == null || type.trim().isEmpty()) ? "N/A" : type;
        String typeCustomerValue = (type_customer == null || type_customer.trim().isEmpty()) ? "N/A" : type_customer;
        String airportValue = (airport == null || airport.trim().isEmpty()) ? "N/A" : airport;
        String airportIdValue = (airport_Id == null || airport_Id.trim().isEmpty()) ? "N/A" : airport_Id;
        String flightValue = (flight == null || flight.trim().isEmpty()) ? "N/A" : flight;
        String airlineValue = (airline == null || airline.trim().isEmpty()) ? "N/A" : airline;
        String gateValue = (gate == null) ? "N/A" : gate.toString();
        String nameValue = (name == null || name.trim().isEmpty()) ? "N/A" : name;
        String nationValue = (nation == null || nation.trim().isEmpty()) ? "N/A" : nation;
        String dobValue = (dob == null || dob.trim().isEmpty()) ? "N/A" : dob;
        String isMaleValue = (isMale == null) ? "N/A" : isMale.toString();
        String reasonValue = (reason == null || reason.trim().isEmpty()) ? "N/A" : reason;
        String stayValue = (stay == null) ? "N/A" : stay.toString();
        String locatesValue = (locates == null || locates.trim().isEmpty()) ? "N/A" : locates;
        String idCardValue = (id_Card == null || id_Card.trim().isEmpty()) ? "N/A" : id_Card;
        String birthCertValue = (birth_Cert == null || birth_Cert.trim().isEmpty()) ? "N/A" : birth_Cert;
        String passportValue = (passport == null || passport.trim().isEmpty()) ? "N/A" : passport;
        String visaValue = (visa == null || visa.trim().isEmpty()) ? "N/A" : visa;
        
        writer.write(timeValue + "," + typeValue + "," + typeCustomerValue + "," + airportValue + "," + airportIdValue + "," + flightValue + "," + airlineValue
                + "," + gateValue + "," + nameValue + "," + nationValue + "," + dobValue + "," + isMaleValue + "," + reasonValue + "," + stayValue + "," + locatesValue
                + "," + idCardValue + "," + birthCertValue + "," + passportValue + "," + visaValue);

    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static DefaultTableModel load_Record_Data(DefaultTableModel model) {
        try (BufferedReader reader = new BufferedReader(new FileReader(Model.getRecord_Path()))) {
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
        try (BufferedReader reader = new BufferedReader(new FileReader(Model.getUser_Path()))) {
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
        File file = new File(Model.getUser_Path());
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
        try (BufferedReader reader = new BufferedReader(new FileReader(Model.getWanted_Path()))) {
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
        File file = new File(Model.getWanted_Path());
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
    
    public static List<Expired_Person> getOverdueEntries() {
        List<Expired_Person> overdueEntries = new ArrayList<>();
        Map<String, List<String[]>> recordsMap = new HashMap<>(); // Map để lưu các bản ghi của mỗi khách

        // Đọc file CSV và nhóm các bản ghi theo (Nation, Passport)
        try (BufferedReader reader = new BufferedReader(new FileReader(Model.getRecord_Path()))) {
            reader.readLine(); // Bỏ qua dòng tiêu đề
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String nation = data[9];
                String passport = data[17];
                String key = nation + "-" + passport;

                recordsMap.putIfAbsent(key, new ArrayList<>());
                recordsMap.get(key).add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Xử lý từng khách trong recordsMap
        for (List<String[]> records : recordsMap.values()) {
            int entryCount = 0;
            int exitCount = 0;
            String[] latestEntryRecord = null;

            for (String[] record : records) {
                String type = record[1];
                if ("Entry".equals(type)) {
                    entryCount++;
                    latestEntryRecord = record; // Cập nhật bản ghi "Entry" mới nhất
                } else if ("Exit".equals(type)) {
                    exitCount++;
                }
            }

            // Kiểm tra điều kiện quá hạn
            if (entryCount > exitCount && latestEntryRecord != null) {
                String timeStr = latestEntryRecord[0];
                String customerType = latestEntryRecord[2];
                int stayTime = Integer.parseInt(latestEntryRecord[13]);

                LocalDateTime entryTime = LocalDateTime.parse(timeStr, dateFormatter);
                LocalDate expiryDate;

                if ("Foreign (Non Visa)".equals(customerType)) {
                    expiryDate = entryTime.plusMonths(stayTime).plusDays(1).toLocalDate();
                } else if ("Foreign (Visa)".equals(customerType)) {
                    expiryDate = entryTime.plusDays(stayTime + 1).toLocalDate();
                } else {
                    continue;
                }

                if (expiryDate.isBefore(LocalDate.now())) {
                    // Tạo đối tượng OverdueEntry và thêm vào danh sách
                    overdueEntries.add(new Expired_Person(
                            timeStr,
                            latestEntryRecord[8],  // Name
                            latestEntryRecord[9],  // Nation
                            latestEntryRecord[17], // Passport
                            expiryDate.atStartOfDay() // Chuyển expiryDate thành LocalDateTime
                    ));
                }
            }
        }
        return overdueEntries;
    }

    public static Map<String, String[]> getOverstayedCustomers() {
        Map<String, String[]> customerRecords = new HashMap<>();
        Map<String, Integer> entryExitCounts = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(Model.getRecord_Path()))) {
            String line;
            reader.readLine();  // Bỏ qua dòng tiêu đề
            
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data.length >= 12) {
                    String nation = data[9].trim();
                    String passport = data[17].trim();
                    String type = data[1].trim();
                    String customerType = data[2].trim();
                    LocalDate time = LocalDate.parse(data[0].trim(), dateFormatter);
                    int stayTime = Integer.parseInt(data[13].trim());

                    String key = nation + "_" + passport;

                    if (type.equals("Entry")) {
                        entryExitCounts.put(key, entryExitCounts.getOrDefault(key, 0) + 1);
                        
                        if (!customerRecords.containsKey(key) || time.isAfter(LocalDate.parse(customerRecords.get(key)[0], dateFormatter))) {
                            customerRecords.put(key, new String[]{data[0], customerType, data[13]});
                        }
                    } else if (type.equals("Exit")) {
                        entryExitCounts.put(key, entryExitCounts.getOrDefault(key, 0) - 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kiểm tra khách quá hạn
        Map<String, String[]> overstayedCustomers = new HashMap<>();

        for (String key : customerRecords.keySet()) {
            String[] record = customerRecords.get(key);
            LocalDate entryDate = LocalDate.parse(record[0], dateFormatter);
            String customerType = record[1];
            int stayTime = Integer.parseInt(record[2]);

            LocalDate expiryDate;
            if (customerType.equals("Foreign (Non Visa)")) {
                expiryDate = entryDate.plusMonths(stayTime).plusDays(1);
            } else if (customerType.equals("Foreign (Visa)")) {
                expiryDate = entryDate.plusDays(stayTime + 1);
            } else {
                continue;
            }

            // Kiểm tra nếu số bản ghi Entry > Exit và ngày hết hạn đã qua
            if (entryExitCounts.get(key) > 0 && expiryDate.isBefore(LocalDate.now())) {
                overstayedCustomers.put(key, record);
            }
        }
        
        return overstayedCustomers;
    }
}
