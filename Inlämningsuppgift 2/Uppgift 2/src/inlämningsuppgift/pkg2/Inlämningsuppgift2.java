

package inlämningsuppgift.pkg2;
import javax.swing.JOptionPane;

public class Inlämningsuppgift2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String forsta;
        forsta= JOptionPane.showInputDialog("Skriv in ett ord!");
        
        String andra;
        andra =JOptionPane.showInputDialog("Skriv in ett till");
        
        String tredje;
        tredje = JOptionPane.showInputDialog("Ännu ett till");
        
        String fjerde;
        fjerde = JOptionPane.showInputDialog("Ett fjärde ord");
        
        String femte;
        femte = JOptionPane.showInputDialog("När du kommit såhär långt, skriv ett sista");
        
        JOptionPane.showMessageDialog(null, forsta + andra + tredje + fjerde + femte);
        
    }
    
}
