package entity.paper;

import java.util.*;
import java.time.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passport extends Paper{
    private String code;
    private String type;
    private String identity_Card_Id;
    private LocalDate issue_Date;
    private LocalDate exp;

    public Passport() {
    }
    

    public Passport(String code, String type, String identity_Card_Id, LocalDate issue_Date, LocalDate exp, String id, String name, String dob, boolean isMale, String nation) {
        super(id, name, dob, isMale, nation);
        this.code = code;
        this.type = type;
        this.identity_Card_Id = identity_Card_Id;
        this.issue_Date = issue_Date;
        this.exp = exp;
    }

    @XmlElement
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public String getIdentity_Card_Id() {
        return identity_Card_Id;
    }

    public void setIdentity_Card_Id(String identity_Card_Id) {
        this.identity_Card_Id = identity_Card_Id;
    }

    @XmlElement
    public LocalDate getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(LocalDate issue_Date) {
        this.issue_Date = issue_Date;
    }

    @XmlElement
    public LocalDate getExp() {
        return exp;
    }

    public void setExp(LocalDate exp) {
        this.exp = exp;
    }
    
}
