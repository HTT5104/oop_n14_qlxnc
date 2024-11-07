package entity.immigration;

import java.util.*;
import java.time.*;

public class Record {
    private LocalDateTime time;
    private String type;
    private String type_customer;
    private String airport;
    private String airport_Id;
    private String flight;
    private String airline;
    private int gate;
    private String name;
    private String nation;
    private String dob;
    private boolean isMale;
    private String reason;
    private int stay;
    private String locates;
    private String id_Card;
    private String birth_Cert;
    private String passport;
    private String visa;

    public Record() {
    }
    
    //Constructor
    public Record(LocalDateTime time, String type, String type_customer, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, String reason, int stay, String locates, String id_Card, String birth_Cert, String passport, String visa) {
        this.time = time;
        this.type = type;
        this.type_customer = type_customer;
        this.airport = airport;
        this.airport_Id = airport_Id;
        this.flight = flight;
        this.airline = airline;
        this.gate = gate;
        this.name = name;
        this.nation = nation;
        this.dob = dob;
        this.isMale = isMale;
        this.reason = reason;
        this.stay = stay;
        this.locates = locates;
        this.id_Card = id_Card;
        this.birth_Cert = birth_Cert;
        this.passport = passport;
        this.visa = visa;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_customer() {
        return type_customer;
    }

    public void setType_customer(String type_customer) {
        this.type_customer = type_customer;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getAirport_Id() {
        return airport_Id;
    }

    public void setAirport_Id(String airport_Id) {
        this.airport_Id = airport_Id;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    public String getLocates() {
        return locates;
    }

    public void setLocates(String locates) {
        this.locates = locates;
    }

    public String getId_Card() {
        return id_Card;
    }

    public void setId_Card(String id_Card) {
        this.id_Card = id_Card;
    }

    public String getBirth_Cert() {
        return birth_Cert;
    }

    public void setBirth_Cert(String birth_Cert) {
        this.birth_Cert = birth_Cert;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
    
}
