package entity.immigration;

import java.util.*;
import java.time.*;

public class Record {
    protected LocalDateTime time;
    protected String airport;
    protected String airport_Id;
    protected String flight;
    protected String airline;
    protected int gate;
    protected String name;
    protected String nation;
    protected LocalDate dob;
    protected boolean isMale;
    protected boolean isForeign;

    public Record(String airport, String airport_Id, String flight, String airline, int gate, String name, String nation, LocalDate dob, boolean isMale) {
        this.time = LocalDateTime.now();
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

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getAirport_Id() {
        return airport_Id;
    }

    public void setAirport_Id(String airport_Id) {
        this.airport_Id = airport_Id;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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
