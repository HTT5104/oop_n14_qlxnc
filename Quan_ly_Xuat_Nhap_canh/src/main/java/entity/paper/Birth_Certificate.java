package entity.paper;

import java.util.*;
import java.time.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Birth_Certificate extends Paper{
    private String birth_Place;
    private String ethnic;
    private String father;
    private String mother;
    private String registration_Place;
    private LocalDate registration_Date;
    private String registrant;

    public Birth_Certificate() {
    }
    

    public Birth_Certificate(String birth_Place, String ethnic, String father, String mother, String registration_Place, LocalDate registration_Date, String registrant, String id, String name, String dob, boolean isMale, String nation) {
        super(id, name, dob, isMale, nation);
        this.birth_Place = birth_Place;
        this.ethnic = ethnic;
        this.father = father;
        this.mother = mother;
        this.registration_Place = registration_Place;
        this.registration_Date = registration_Date;
        this.registrant = registrant;
    }

    @XmlElement
    public String getBirth_Place() {
        return birth_Place;
    }

    public void setBirth_Place(String birth_Place) {
        this.birth_Place = birth_Place;
    }

    @XmlElement
    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    @XmlElement
    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @XmlElement
    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @XmlElement
    public String getRegistration_Place() {
        return registration_Place;
    }

    public void setRegistration_Place(String registration_Place) {
        this.registration_Place = registration_Place;
    }

    @XmlElement
    public LocalDate getRegistration_Date() {
        return registration_Date;
    }

    public void setRegistration_Date(LocalDate registration_Date) {
        this.registration_Date = registration_Date;
    }

    @XmlElement
    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }
    
    
}
