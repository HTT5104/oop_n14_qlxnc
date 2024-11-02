/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity.paper;

import entity.immigration.Entry;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@XmlRootElement
public class Information {
    private Birth_Certificate birth_Certificate;
    private Entry entry;
    private Identity_Card identity_Card;
    private Passport passport;
    private Visa visa;
    private Paper paper;

    public Information() {
    }
    @XmlElement
    public Birth_Certificate getBirth_Certificate() {
        return birth_Certificate;
    }
    @XmlElement
    public Entry getEntry() {
        return entry;
    }
    @XmlElement
    public Identity_Card getIdentity_Card() {
        return identity_Card;
    }
    @XmlElement
    public Passport getPassport() {
        return passport;
    }
    @XmlElement
    public Visa getVisa() {
        return visa;
    }
    @XmlElement
        public Paper getPaper() {
        return paper;
    }

    public void setBirth_Certificate(Birth_Certificate birth_Certificate) {
        this.birth_Certificate = birth_Certificate;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public void setIdentity_Card(Identity_Card identity_Card) {
        this.identity_Card = identity_Card;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }
    
    
    
}
