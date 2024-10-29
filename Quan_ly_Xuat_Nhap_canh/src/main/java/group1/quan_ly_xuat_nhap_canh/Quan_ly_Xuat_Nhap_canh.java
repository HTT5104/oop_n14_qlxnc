/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group1.quan_ly_xuat_nhap_canh;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import java.time.*;
import entity.immigration.Entry;
import entity.paper.Identity_Card;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author ADMIN
 */
public class Quan_ly_Xuat_Nhap_canh {

    public static void main(String[] args) {
        try {
            // Tạo đối tượng Identity_Card và Entry
            Identity_Card id_card = new Identity_Card("001204005037", "Linh", "05/01/2004", true, "Vietnam", "Hanoi", "78 Quan Su", "05/01/2004", "05/01/2004", "");
            Entry test = new Entry("22/10/2024 12:57:34","Noi Bai", "VN_NB", "VNA123", "Vietnam Airline", 5, "Ha Tai Thanh", "Vietnam", "05/01/2004", true, id_card);

            JAXBContext context = JAXBContext.newInstance(Entry.class, Identity_Card.class);
            System.out.println("Tao JAXBContext thanh cong.");

           
            File file = new File("./data/record.xml"); 
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(test, file);

            System.out.println("Ghi du lieu vao file XML thanh cong!");

            // Đọc lại dữ liệu từ file XML
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Entry entryFromFile = (Entry) unmarshaller.unmarshal(file);

            // Hiển thị thông tin sau khi đọc từ file XML
            System.out.println("Đọc dữ liệu từ file XML:");
            System.out.println("Tên: " + entryFromFile.getName());
            System.out.println("Sân bay: " + entryFromFile.getAirport());
            System.out.println("Số hiệu chuyến bay: " + entryFromFile.getAirport_Id());
            System.out.println("Thông tin ID Card của hành khách:");
            System.out.println(" - ID: " + entryFromFile.getId_card().getId());
            System.out.println(" - Tên: " + entryFromFile.getId_card().getName());
            

        } catch (JAXBException e) {
            System.out.println("Loi JAXB: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
