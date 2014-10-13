package inlämingsuppgift.pkg1;
import javax.swing.JOptionPane;
public class Inlämingsuppgift1 {

    public static void main(String[] args) {
        //*Här tar jag reda på information om användaren*//
        
        String first_name = JOptionPane.showInputDialog("Förnamn");
        
        
        String last_name = JOptionPane.showInputDialog("Efternamn");
        
        
        String birthday = JOptionPane.showInputDialog("Skriv in ditt födelsedatum ÅÅMMDD", "xxxxxx");
        
        
        String city = JOptionPane.showInputDialog("I vilken stad bor du?");
        
        
        String Adress = JOptionPane.showInputDialog("Skriv in din adress!");
    
        
        //*Här tar jag ut användarens födelsedatum i två steg, "dag" och månad*//
        
        
        String monad;
        monad = birthday.substring(2, 4);
        String dag;
        dag = birthday.substring(4, 6);
        
        //*Här under skriver jag vad som ska skrivas ut*//
        
        JOptionPane.showMessageDialog(null, "Hej " + first_name + " " + last_name + ", den " + dag + "/" + monad + " kommer vi till " + Adress + " i " + city + " och gratulerar dig på din födelsedag!");
        
        //*Sedan avslutas programmet*//
        System.exit(0);
    }
    
}
