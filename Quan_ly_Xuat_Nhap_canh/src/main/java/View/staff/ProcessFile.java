/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.staff;

import entity.paper.Information;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@XmlRootElement
class InformationList {
    private List<Information> informationList;

    @XmlElement(name = "information")
    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }
}
class InformationXmlReader {
    public static List<Information> loadInformationListFromXml(String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(InformationList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File file = new File(filePath);

            if (file.exists()) {
                InformationList wrapper = (InformationList) unmarshaller.unmarshal(file);
                return wrapper.getInformationList();
            } else {
                // Nếu file chưa tồn tại, trả về danh sách trống
                return new ArrayList<>();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

class InformationXmlWriter {
    public static void saveInformationListToXml(List<Information> informationList) {
        try {
            // Tạo đối tượng wrapper để chứa danh sách
            InformationList wrapper = new InformationList();
            wrapper.setInformationList(informationList);

            // Cấu hình JAXB để lưu đối tượng wrapper vào file XML
            JAXBContext context = JAXBContext.newInstance(InformationList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Ghi danh sách vào file XML
            marshaller.marshal(wrapper, new File("information_list.xml"));

            System.out.println("Danh sách thông tin đã được lưu vào file XML thành công.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
class InformationXmlUpdater {
    public static void addInformationToXml(String filePath, Information newInformation) {
        // Đọc danh sách hiện có từ file XML
        List<Information> informationList = InformationXmlReader.loadInformationListFromXml(filePath);
        

        // Thêm đối tượng mới vào danh sách
        informationList.add(newInformation);

        // Lưu danh sách cập nhật lại vào file XML
        InformationXmlWriter.saveInformationListToXml(informationList);
    }
}
public class ProcessFile {
    
}
