

package inlämningsuppgift.pkg2;
import javax.swing.JOptionPane;

public class Inlämningsuppgift2 {

    
    public static void main(String[] args) {
        
        //*I String kapitlet så ber jag användaren skriva in 5 ord*//
       
        String forsta= JOptionPane.showInputDialog("Skriv in ett ord!");
        
        String andra =JOptionPane.showInputDialog( forsta );
        
        String tredje = JOptionPane.showInputDialog( forsta + " " + andra );
       
        String fjerde = JOptionPane.showInputDialog( forsta + " " + andra + " " + tredje);
        
        String femte = JOptionPane.showInputDialog( forsta + " " + andra + " " + tredje + " " + fjerde );
        
        //*Här skriver jag ut de användarvalda orden*//
        
        JOptionPane.showMessageDialog(null, forsta + " " + andra + " " + tredje + " " + fjerde + " " + femte);
        
    }
    
}

/*

Tack!

Snyggt ochj enkelt! Du hade kunnat göra det ännu elegantare med en array.

*/