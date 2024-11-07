package entity.immigration;

import java.util.*;
import java.time.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Record {
    protected String time;
    protected String type;
    protected String airport;
    protected String airport_Id;
    protected String flight;
    protected String airline;
    protected int gate;
    protected String name;
    protected String nation;
    protected String dob;
    protected boolean isMale;
    protected boolean isForeign;
    protected int stay;
    protected String locates;
    protected String id_Card;
    protected String birth_Cert;
    protected String passport;
    protected String visa;

    public Record() {
    }
    


    @XmlElement
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    @XmlElement
    public String getAirport_Id() {
        return airport_Id;
    }

    public void setAirport_Id(String airport_Id) {
        this.airport_Id = airport_Id;
    }

    @XmlElement
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @XmlElement
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @XmlElement
    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @XmlElement
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @XmlElement
    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    @XmlElement
    public boolean isIsForeign() {
        return isForeign;
    }

    public void setIsForeign(boolean isForeign) {
        this.isForeign = isForeign;
    }
    
}
