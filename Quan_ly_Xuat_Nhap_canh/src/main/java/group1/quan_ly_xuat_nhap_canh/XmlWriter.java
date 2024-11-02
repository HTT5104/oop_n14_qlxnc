package group1.quan_ly_xuat_nhap_canh;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Customer {
    private String name;
    private Address address;

    // Constructor
    public Customer() {}
    
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

@XmlRootElement
class Address {
    private String street;
    private String city;

    // Constructor
    public Address() {}
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @XmlElement
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class XmlWriter {
    public static void main(String[] args) {
        try {
            // Khởi tạo các object
            Address address = new Address("123 Street", "");
            Customer customer = new Customer("John Doe", address);

            // Tạo JAXB context
            JAXBContext context = JAXBContext.newInstance(Customer.class);

            // Tạo Marshaller
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Ghi object vào file XML
            marshaller.marshal(customer, new File("customer.xml"));

            System.out.println("Object đã được ghi vào file XML thành công.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
