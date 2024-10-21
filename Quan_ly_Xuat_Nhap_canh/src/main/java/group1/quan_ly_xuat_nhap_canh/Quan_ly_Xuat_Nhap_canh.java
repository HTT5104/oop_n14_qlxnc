/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group1.quan_ly_xuat_nhap_canh;

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
        Identity_Card id_card = new Identity_Card("001204005037", "Ha Tai Thanh", "05_01_2004", true, "Vietnam", "Hanoi", "78 Quan Su", LocalDate.of(2004, Month.JANUARY, 5), LocalDate.of(2004, Month.JANUARY, 5), "");
        Entry test = new Entry("Noi Bai", "VN_NB", "VNA123", "Vietnam Airline", 5, "Ha Tai Thanh", "Vietnam", LocalDate.of(2004, Month.JANUARY, 5), true, id_card);
    }
}
