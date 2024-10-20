package entity.paper;

import java.util.*;
import java.time.*;

public class Passport extends Paper{
    private String code;
    private String type;
    private String identity_Card_Id;
    private LocalDate issue_Date;
    private LocalDate exp;

    public Passport(String code, String type, String identity_Card_Id, LocalDate issue_Date, LocalDate exp, String id, String name, String dob, boolean isMale, String nation) {
        super(id, name, dob, isMale, nation);
        this.code = code;
        this.type = type;
        this.identity_Card_Id = identity_Card_Id;
        this.issue_Date = issue_Date;
        this.exp = exp;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentity_Card_Id() {
        return identity_Card_Id;
    }

    public void setIdentity_Card_Id(String identity_Card_Id) {
        this.identity_Card_Id = identity_Card_Id;
    }

    public LocalDate getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(LocalDate issue_Date) {
        this.issue_Date = issue_Date;
    }

    public LocalDate getExp() {
        return exp;
    }

    public void setExp(LocalDate exp) {
        this.exp = exp;
    }
    
}
