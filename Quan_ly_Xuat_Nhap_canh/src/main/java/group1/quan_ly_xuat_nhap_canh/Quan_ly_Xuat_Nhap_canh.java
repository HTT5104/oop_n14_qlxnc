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
        Identity_Card id_card = new Identity_Card("001204005037", "Ha Tai Thanh", "05/01/2004", true, "Vietnam", "Hanoi", "78 Quan Su", "05/01/2004", "05/01/2004", "");
        Entry test = new Entry("22/10/2024 12:57:34","Noi Bai", "VN_NB", "VNA123", "Vietnam Airline", 5, "Ha Tai Thanh", "Vietnam", "05/01/2004", true, id_card);
    }
}
