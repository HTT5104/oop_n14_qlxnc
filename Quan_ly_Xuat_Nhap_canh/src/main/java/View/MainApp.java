/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author admin
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        // Tạo đối tượng cho giao diện đăng nhập và quản lý
        View_Login loginFrame = new View_Login();
        View_Staff NV = new View_Staff();
        
        // Hiển thị giao diện đăng nhập
        loginFrame.setVisible(true);
        
        // Xử lý sự kiện khi nhấn vào nút đăng nhập
        loginFrame.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra thông tin đăng nhập nếu cần (ví dụ username/password)
                // Ở đây giả sử thông tin đúng nên ta chuyển tiếp
                loginFrame.setVisible(false); // Ẩn giao diện đăng nhập
                NV.setVisible(true); // Hiển thị giao diện quản lý
            }
        });
    }
}





