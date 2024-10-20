package entity.paper;

import java.util.*;
import java.time.*;

public class Identity_Card extends Paper{
    private String origin;
    private String residence;
    private LocalDate issue_Date;
    private LocalDate exp;
    private String identification;
    public Identity_Card(String id, String name, String dob, boolean isMale, String nation, String origin, String residence, LocalDate issue_Date, LocalDate exp, String identification) {
        super(id, name, dob, isMale, nation);
        this.origin = origin;
        this.residence = residence;
        this.issue_Date = issue_Date;
        this.exp = exp;
        this.identification = identification;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
}
