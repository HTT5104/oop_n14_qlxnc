package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    private String id;
    private String role;
    private String name;
    private String md5_Password;

    public User(String id, String role, String name) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.md5_Password = "dd4b21e9ef71e1291183a46b913ae6f2";
    }

    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getMd5_Password() {
        return md5_Password;
    }

    public void setMd5_Password(String md5_Password) {
        this.md5_Password = md5_Password;
    }
    
}
