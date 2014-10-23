package inlämningsuppgift.pkg3;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Inlämningsuppgift3 {
    
    public static void main(String[] args) {
        
        /*Här ber jag användaren skriva in två tal */
        
        String forsta_tal = JOptionPane.showInputDialog("Skriv in ett tal: ");
        String andra_tal = JOptionPane.showInputDialog("Skriv in ännu ett tal: ");
        
        /*Här konverterar jag "string" till "double"*/
        
           double forsta_taldouble = Double.parseDouble(forsta_tal);
           double andra_taldouble = Double.parseDouble(andra_tal);
        
        /*Här deklarerar jag summan som double och vad den är, och skriver ut den*/
           
           double summa = forsta_taldouble + andra_taldouble;
        JOptionPane.showMessageDialog(null, "Summan: " + summa);
        
        /*Här ber jag användaren skriva in ett tredje tal*/
        
        String tredje_tal = JOptionPane.showInputDialog("Nu ska vi subtrahera, skriv in ett tal: ");
        
        /*--Konvertering--*/
        double tredje_taldouble = Double.parseDouble(tredje_tal);
        
        /*--Deklaration, värde och utskrift--*/
        double differans = summa - tredje_taldouble;
        JOptionPane.showMessageDialog(null, "Differansen: " + differans);
        
        /*--Ber om ett 4de nummer--*/
        String fjerde_tal = JOptionPane.showInputDialog("Nu ska vi multiplicera, skriv in ett tal");
        
        /*--Konvertering--*/
        double fjerde_taldouble = Double.parseDouble(fjerde_tal);
        
        /*--Deklaration, värde och utskrift--*/
        double multiplication = differans * fjerde_taldouble;
        JOptionPane.showMessageDialog(null, "Multiplikation: " + multiplication);
        
        /*Samma procedur om igen fast division i detta kapitel*/
        
        String femte_tal = JOptionPane.showInputDialog("Nu ska vi dividera, skriv in ett tal: ");
        
        double femte_taldouble = Double.parseDouble(femte_tal);
        
        double divison = multiplication / femte_taldouble;
        
        JOptionPane.showMessageDialog(null, "Division " + divison);
        System.exit(0);
    }
    
}
