package controller.staff;

import entity.paper.Birth_Certificate;
import entity.paper.Identity_Card;
import entity.paper.Passport;
import entity.paper.Visa;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.xml.bind.*;

public class Controller_Staff {
    private static Identity_Card id_Card;
    private static Birth_Certificate birth_Cert;
    private static Passport passport;
    private static Visa visa;
    private static String warning;
    
    public static void reset_Paper(){
        id_Card = null;
        birth_Cert = null;
        passport = null;
        visa = null;
        warning = "";
    }
}

