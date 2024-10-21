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
    private LocalDate valid_Date;
    private LocalDate exp;
    private LocalDate issue_Date;

    public Visa(String category, String passport_Id, boolean isMultiple, LocalDate valid_Date, LocalDate exp, LocalDate issue_Date, String id, String name, String dob, boolean isMale, String nation) {
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
    public LocalDate getValid_Date() {
        return valid_Date;
    }

    public void setValid_Date(LocalDate valid_Date) {
        this.valid_Date = valid_Date;
    }

    @XmlElement
    public LocalDate getExp() {
        return exp;
    }

    public void setExp(LocalDate exp) {
        this.exp = exp;
    }

    @XmlElement
    public LocalDate getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(LocalDate issue_Date) {
        this.issue_Date = issue_Date;
    }
    
}
