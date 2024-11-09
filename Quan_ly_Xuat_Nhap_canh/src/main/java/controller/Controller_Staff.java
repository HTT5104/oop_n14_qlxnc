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
import model.Model;

public class Controller_Staff {
    private static String warning;
    
    public static boolean CheckInfo(String type, String cus_Type, int gate, String strDob, int stay, String nation, String passport){
        warning = "";
        if(gate<=0){
            warning = warning + "\nInvalid gate";
        }
        if(Controller.isValidDate(strDob)==false){
            warning = warning + "\nInvalid birthday";
        }
        if(type.equals("Entry") && (cus_Type.equals("Foreign (Non Visa)") || cus_Type.equals("Foreign (Visa)")) && stay<=0){
            warning = warning + "\nInvalid stay time";
        }
        if(Controller_Manager.isNationAndPassportExists(nation, passport, new File(Model.getWanted_Path()))==true){
            warning = warning + "\nWanted person in "+nation;
        }
        if(!warning.equals("")){
            JOptionPane.showMessageDialog(null, warning, "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Information is valid");
            return true;
        }
    }
}

