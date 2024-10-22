package entity.paper;

import java.util.*;
import java.time.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Visa extends Paper{
    private String category;
    private String passport_Id;
    private boolean isMultiple;
    private String valid_Date;
    private String exp;
    private String issue_Date;

    public Visa(String category, String passport_Id, boolean isMultiple, String valid_Date, String exp, String issue_Date, String id, String name, String dob, boolean isMale, String nation) {
        super(id, name, dob, isMale, nation);
        this.category = category;
        this.passport_Id = passport_Id;
        this.isMultiple = isMultiple;
        this.valid_Date = valid_Date;
        this.exp = exp;
        this.issue_Date = issue_Date;
    }

    @XmlElement
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement
    public String getPassport_Id() {
        return passport_Id;
    }

    public void setPassport_Id(String passport_Id) {
        this.passport_Id = passport_Id;
    }

    @XmlElement
    public boolean isIsMultiple() {
        return isMultiple;
    }

    public void setIsMultiple(boolean isMultiple) {
        this.isMultiple = isMultiple;
    }

    @XmlElement
    public String getValid_Date() {
        return valid_Date;
    }

    public void setValid_Date(String valid_Date) {
        this.valid_Date = valid_Date;
    }

    @XmlElement
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @XmlElement
    public String getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(String issue_Date) {
        this.issue_Date = issue_Date;
    }
    
}
