package controller.staff;

import entity.immigration.Entries;
import entity.immigration.Entry;
import entity.paper.Birth_Certificate;
import entity.paper.Identity_Card;
import entity.paper.Passport;
import entity.paper.Visa;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.*;

public class Controller_Staff {
    private static Identity_Card id_Card;
    private Birth_Certificate birth_Cert;
    private Passport passport;
    private Visa visa;
    
    public static void add_Entry(Entry new_Entry) {
        try {
            JAXBContext context = JAXBContext.newInstance(Entries.class, Entry.class, Identity_Card.class);
            System.out.println("Tạo JAXBContext thành công.");

            File file = new File("./data/record.xml");

            // Danh sách các Entry hiện có
            List<Entry> entryList;

            // Kiểm tra nếu file tồn tại và không rỗng, đọc dữ liệu từ file
            if (file.exists() && file.length() > 0) {
                Unmarshaller unmarshaller = context.createUnmarshaller();
                Entries existingEntries = (Entries) unmarshaller.unmarshal(file);
                
                // Lấy danh sách Entry hiện có từ file
                entryList = existingEntries.getEntryList(); 
            } else {
                // Nếu file không tồn tại hoặc rỗng, khởi tạo danh sách mới
                entryList = new ArrayList<>();
            }

            entryList.add(new_Entry); // Thêm Entry mới vào danh sách

            // Ghi lại toàn bộ danh sách vào file XML
            Entries entriesWrapper = new Entries();
            entriesWrapper.setEntryList(entryList); // Đặt danh sách Entry đã cập nhật vào Entries

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(entriesWrapper, file);

            System.out.println("Ghi dữ liệu vào file XML thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void save_Id_Card(String id, String name, String dob, boolean isMale, String nation, String origin, String residence, String issue_Date, String exp, String identification){

        id_Card = new Identity_Card(id, name, dob, isMale, nation, origin, residence, issue_Date, exp, identification);
    }
    
    public static void save_Temp_Entry_Id_Card(String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale){
        LocalDateTime dateTime = LocalDateTime.now(); // Lấy thời gian hiện tại
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Định dạng ngày giờ
        String time = dateTime.format(formatter); // Chuyển đổi sang String        
        Entry entry = new Entry(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale, id_Card);
        add_Entry(entry);
    }
    
}
