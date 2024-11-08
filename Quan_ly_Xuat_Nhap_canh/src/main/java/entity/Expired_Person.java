/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ADMIN
 */
public class Expired_Person {
    private String time;
    private String name;
    private String nation;
    private String passport;
    private String expiryDate;

    // Constructor
    public Expired_Person(String time, String name, String nation, String passport, String expiryDate) {
        this.time = time;
        this.name = name;
        this.nation = nation;
        this.passport = passport;
        this.expiryDate = expiryDate;
    }
    
    public Expired_Person(String time, String name, String nation, String passport, LocalDateTime expiryDate) {
        this.time = time;
        this.name = name;
        this.nation = nation;
        this.passport = passport;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.expiryDate = expiryDate.format(formatter); // Chuyển đổi
    }

    // Getters
    public String getTime() { return time; }
    public String getName() { return name; }
    public String getNation() { return nation; }
    public String getPassport() { return passport; }
    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDateTime expiryDate) {
        // Đổi LocalDateTime thành String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.expiryDate = expiryDate.format(formatter); // Chuyển đổi
    }
}
