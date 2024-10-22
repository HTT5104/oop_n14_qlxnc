package entity.immigration;

import entity.paper.Birth_Certificate;
import entity.paper.Identity_Card;
import entity.paper.Passport;
import entity.paper.Visa;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Exit extends Record{
    private Passport passport;
    private Visa visa;
    private Identity_Card id_Card;
    private Birth_Certificate birth_Cert;

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.passport = passport;
    }

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport, Visa visa) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.passport = passport;
        this.visa = visa;
    }

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport, Identity_Card id_Card) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.id_Card = id_Card;
    }

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport, Visa visa, Identity_Card id_Card) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.visa = visa;
        this.id_Card = id_Card;
    }

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport, Birth_Certificate birth_Cert) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.birth_Cert = birth_Cert;
    }

    public Exit(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale, Passport passport, Visa visa, Birth_Certificate birth_Cert) {
        super(time, airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.visa = visa;
        this.birth_Cert = birth_Cert;
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
    public Identity_Card getId_Card() {
        return id_Card;
    }

    public void setId_Card(Identity_Card id_Card) {
        this.id_Card = id_Card;
    }

    @XmlElement
    public Birth_Certificate getBirth_Cert() {
        return birth_Cert;
    }

    public void setBirth_Cert(Birth_Certificate birth_Cert) {
        this.birth_Cert = birth_Cert;
    }
    
    
}
