package entity;

import java.util.*;

class Customer {
    protected String name;
    protected String nation;
    protected Date dob;
    protected boolean isMale;
    protected boolean isForeign;

    public Customer(String name, String nation, Date dob, boolean isMale, boolean isForeign) {
        this.name = name;
        this.nation = nation;
        this.dob = dob;
        this.isMale = isMale;
        this.isForeign = isForeign;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isIsForeign() {
        return isForeign;
    }

    public void setIsForeign(boolean isForeign) {
        this.isForeign = isForeign;
    }
}

class Domestic_Customer extends Customer{
    private String id;
    private String birth_certificate;
    
    public Domestic_Customer(String name, String nation, Date dob, boolean isMale, boolean isForeign, String id, String birth_certificate) {
        super(name, nation, dob, isMale, isForeign);
        this.id = id;
        this.birth_certificate = birth_certificate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirth_certificate() {
        return birth_certificate;
    }

    public void setBirth_certificate(String birth_certificate) {
        this.birth_certificate = birth_certificate;
    }
    
}

class Foreign_Customer extends Customer{
    private String passport;
    private String visa; 
    
    public Foreign_Customer(String name, String nation, Date dob, boolean isMale, boolean isForeign, String passport, String visa) {
        super(name, nation, dob, isMale, isForeign);
        this.passport = passport;
        this.visa = visa;
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