package entity;

class Entry{
    private String airport;
    private String airport_Id;
    private String flight;
    private String airline;
    private int gate;
    private Customer customer;
    private String reason; //Lý do nhập cảnh
    private int stay; //Thời hạn lưu trú (tính theo ngày)
    private String location; //Điểmm đến

    //Constructor cho khách quốc tế
    public Entry(String airport, String airport_Id, String flight, String airline, int gate, Customer customer, String reason, int stay, String location) {
        this.airport = airport;
        this.airport_Id = airport_Id;
        this.flight = flight;
        this.airline = airline;
        this.gate = gate;
        this.customer = customer;
        this.reason = reason;
        this.stay = stay;
        this.location = location;
    }

    //Constructor cho khách nội địa
    public Entry(String airport, String airport_Id, String flight, String airline, int gate, Customer customer) {
        this.airport = airport;
        this.airport_Id = airport_Id;
        this.flight = flight;
        this.airline = airline;
        this.gate = gate;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Exit{
    private String airport;
    private String airport_Id;
    private String flight;
    private String airline;
    private int gate;
    private Customer customer;

    public Exit(String airport, String airport_Id, String flight, String airline, int gate, Customer customer) {
        this.airport = airport;
        this.airport_Id = airport_Id;
        this.flight = flight;
        this.airline = airline;
        this.gate = gate;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}