package entity.paper;

import java.util.*;
public class Passport extends Paper{
    private String code;
    private String type;
    private String identity_Card_Id;
    private Date issue_Date;
    private Date exp;

    public Passport(String code, String type, String identity_Card_Id, Date issue_Date, Date exp, String id, String name, String dob, boolean isMale, String nation) {
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

    public Date getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(Date issue_Date) {
        this.issue_Date = issue_Date;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }
    
}
