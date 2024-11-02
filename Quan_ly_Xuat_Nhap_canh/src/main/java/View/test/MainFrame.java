/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.test;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author admin
 */
interface DataListener {
    void onDataReceived(String data);
}

class SecondFrame extends JFrame {
    private JTextField textField;
    private JButton sendBackButton;
    private DataListener listener;

    public SecondFrame(DataListener listener) {
        this.listener = listener; // Gán listener được truyền từ MainFrame

        setTitle("Second Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Tạo JTextField để nhập dữ liệu gửi về
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        add(textField);

        // Tạo nút để gửi dữ liệu về MainFrame
        sendBackButton = new JButton("Send Data Back");
        sendBackButton.setBounds(50, 100, 200, 30);
        add(sendBackButton);

        sendBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listener != null) {
                    String data = textField.getText(); // Lấy dữ liệu từ JTextField
                    listener.onDataReceived(data); // Gọi phương thức callback
                }
                dispose(); // Đóng SecondFrame sau khi gửi dữ liệu
            }
        });
    }
}


public class MainFrame extends JFrame implements DataListener {
    private JTextField textField;
    private JButton openSecondFrameButton;
    private JLabel receivedDataLabel;

    public MainFrame() {
        setTitle("Main Frame");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Tạo JTextField để nhập dữ liệu cho SecondFrame
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        add(textField);

        // Nút để mở SecondFrame
        openSecondFrameButton = new JButton("Open Second Frame");
        openSecondFrameButton.setBounds(50, 100, 200, 30);
        add(openSecondFrameButton);

        // Label để hiển thị dữ liệu nhận từ SecondFrame
        receivedDataLabel = new JLabel("Received Data: ");
        receivedDataLabel.setBounds(50, 150, 200, 30);
        add(receivedDataLabel);

        openSecondFrameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mở SecondFrame và truyền MainFrame (this) làm listener
                SecondFrame secondFrame = new SecondFrame(MainFrame.this);
                secondFrame.setVisible(true);
            }
        });
    }

    // Triển khai phương thức onDataReceived từ DataListener
    @Override
    public void onDataReceived(String data) {
        receivedDataLabel.setText("Received Data: " + data); // Hiển thị dữ liệu trên JLabel
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}


