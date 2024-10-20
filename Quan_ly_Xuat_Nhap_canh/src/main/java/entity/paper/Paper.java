package entity.paper;

public class Paper {
    protected String id;
    protected String name;
    protected String dob;
    protected boolean isMale;
    protected String nation;

    public Paper(String id, String name, String dob, boolean isMale, String nation) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.isMale = isMale;
        this.nation = nation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    
    
}
