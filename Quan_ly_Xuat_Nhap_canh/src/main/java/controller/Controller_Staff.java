package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.xml.bind.*;

public class Controller_Staff {
    private static String warning;
    
    public static boolean CheckInfo(int gate, String strDob, int stay){
        warning = "";
        if(gate<=0){
            warning = warning + "Invalid gate";
        }
        if(Controller.isValidDate(strDob)==false){
            warning = warning + "Invalid birthday";
        }
        if(stay<=0){
            warning = warning + "Invalid stay time";
        }
        if(!warning.equals("")){
            JOptionPane.showMessageDialog(null, warning, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Information is valid");
            return true;
        }
    }
}

