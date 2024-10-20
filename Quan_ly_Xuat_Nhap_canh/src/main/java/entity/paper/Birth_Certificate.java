package entity.paper;

import java.util.*;

public class Birth_Certificate extends Paper{
    private String birth_Place;
    private String ethnic;
    private String father;
    private String mother;
    private String registration_Place;
    private Date registration_Date;
    private String registrant;

    public Birth_Certificate(String birth_Place, String ethnic, String father, String mother, String registration_Place, Date registration_Date, String registrant, String id, String name, String dob, boolean isMale, String nation) {
        super(id, name, dob, isMale, nation);
        this.birth_Place = birth_Place;
        this.ethnic = ethnic;
        this.father = father;
        this.mother = mother;
        this.registration_Place = registration_Place;
        this.registration_Date = registration_Date;
        this.registrant = registrant;
    }

    public String getBirth_Place() {
        return birth_Place;
    }

    public void setBirth_Place(String birth_Place) {
        this.birth_Place = birth_Place;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getRegistration_Place() {
        return registration_Place;
    }

    public void setRegistration_Place(String registration_Place) {
        this.registration_Place = registration_Place;
    }

    public Date getRegistration_Date() {
        return registration_Date;
    }

    public void setRegistration_Date(Date registration_Date) {
        this.registration_Date = registration_Date;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }
    
    
}