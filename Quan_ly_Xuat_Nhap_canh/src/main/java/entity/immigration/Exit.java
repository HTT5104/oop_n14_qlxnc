package entity.immigration;

import entity.paper.Birth_Certificate;
import entity.paper.Identity_Card;
import entity.paper.Passport;
import entity.paper.Visa;
import java.time.LocalDate;

public class Exit extends Record{
    private Passport passport;
    private Visa visa;
    private Identity_Card id_Card;
    private Birth_Certificate birth_Cert;

    public Exit(Passport passport, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.passport = passport;
    }

    public Exit(Passport passport, Visa visa, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = true;
        this.passport = passport;
        this.visa = visa;
    }

    public Exit(Passport passport, Identity_Card id_Card, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.id_Card = id_Card;
    }

    public Exit(Passport passport, Visa visa, Identity_Card id_Card, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.visa = visa;
        this.id_Card = id_Card;
    }

    public Exit(Passport passport, Birth_Certificate birth_Cert, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.birth_Cert = birth_Cert;
    }

    public Exit(Passport passport, Visa visa, Birth_Certificate birth_Cert, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        super(airport, airport_Id, flight, airline, gate, name, nation, dob, isMale);
        super.isForeign = false;
        this.passport = passport;
        this.visa = visa;
        this.birth_Cert = birth_Cert;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Visa getVisa() {
        return visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public Identity_Card getId_Card() {
        return id_Card;
    }

    public void setId_Card(Identity_Card id_Card) {
        this.id_Card = id_Card;
    }

    public Birth_Certificate getBirth_Cert() {
        return birth_Cert;
    }

    public void setBirth_Cert(Birth_Certificate birth_Cert) {
        this.birth_Cert = birth_Cert;
    }
    
    
}
