package entity.immigration;

import java.util.*;
import java.time.*;
import entity.paper.Birth_Certificate;
import entity.paper.Identity_Card;
import entity.paper.Passport;
import entity.paper.Visa;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Entry extends Record{
    private Identity_Card id_Card;
    private Birth_Certificate birth_Cert;
    private String reason;
    private Passport passport;
    private Visa visa;
    private int stay;
    private String place;

    public Entry() {
    }
    

    //Constructor cho khách nội địa dùng CCCD
    public Entry(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Identity_Card id_Card) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.id_Card = id_Card;
    }

    //Constructor cho khách nội địa dùng giấy khai sinh
    public Entry(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Birth_Certificate birth_Cert) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.birth_Cert = birth_Cert;
    }

    //Constructor cho khách quốc tế cần thị thực
    public Entry(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, String reason, Passport passport, Visa visa, int stay, String place) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.reason = reason;
        this.passport = passport;
        this.visa = visa;
        this.stay = stay;
        this.place = place;
    }
    
    //Constructor cho khách quốc tế miễn thị thực
    public Entry(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, String reason, Passport passport, int stay, String place) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.reason = reason;
        this.passport = passport;
        this.stay = stay;
        this.place = place;
    }

    @XmlElement
    public Identity_Card getId_card() {
        return id_Card;
    }

    public void setId_card(Identity_Card id_Card) {
        this.id_Card = id_Card;
    }

    @XmlElement
    public Birth_Certificate getBirth_cert() {
        return birth_Cert;
    }

    public void setBirth_cert(Birth_Certificate birth_Cert) {
        this.birth_Cert = birth_Cert;
    }

    @XmlElement
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @XmlElement
    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @XmlElement
    public Visa getVisa() {
        return visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    @XmlElement
    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    @XmlElement
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    
}
