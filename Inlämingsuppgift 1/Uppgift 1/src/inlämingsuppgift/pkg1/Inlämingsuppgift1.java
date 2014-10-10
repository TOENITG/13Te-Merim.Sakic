package inlämingsuppgift.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Inlämingsuppgift1 {

    public static void main(String[] args) {
        //*TODO code here*//
        
        Scanner user_input = new Scanner (System.in);
        
        String first_name;
        first_name = JOptionPane.showInputDialog("Förnamn");
        
        String last_name;
        last_name = JOptionPane.showInputDialog("Efternamn");
        
        String birthday;
        birthday = JOptionPane.showInputDialog("Skriv in ditt födelsedatum ÅÅMMDD");
        
        String city;
        city = JOptionPane.showInputDialog("I vilken stad bor du?");
        
        String Adress;
        Adress = JOptionPane.showInputDialog("Skriv in din adress!");
    
        String datum;
        datum = birthday.substring(2, 6);
        
        JOptionPane.showMessageDialog(null, "Hej " + first_name + " " + last_name + ", den " + datum + " kommer vi till " + Adress + " i " + city + " och gratulerar dig på din födelsedag!");
        System.exit(0);
    }
    
}
