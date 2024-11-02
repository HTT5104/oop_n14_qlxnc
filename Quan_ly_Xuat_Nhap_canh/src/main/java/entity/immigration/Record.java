package entity.immigration;

import java.util.*;
import java.time.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Record {
    protected String time;
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

    public Record() {
    }
    

    public Record(String time, String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, String dob, boolean isMale) {
        this.time = time;
        this.airport = airport;
        this.airport_Id = airport_Id;
        this.flight = flight;
        this.airline = airline;
        this.gate = gate;
        this.name = name;
        this.nation = nation;
        this.dob = dob;
        this.isMale = isMale;
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
