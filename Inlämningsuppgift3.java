package inlämningsuppgift.pkg3;

import java.util.Scanner;
public class Inlämningsuppgift3 {
    
    /**En kontroll som checkar ifall det är siffror som har matats in.**/
    static double Kontroll()
    {
    Scanner user_input = new Scanner (System.in);
    boolean sant;
    double tal = 0;
      do
        {
         try
            {
                tal = Double.parseDouble(user_input.next( ));
                sant = true;
            }
            catch(NumberFormatException e)
          {
          System.out.println("Använd siffror, var vänlig och skriv igen.");
          sant = false;
          }
        }
        while(!sant);
      return tal;
      }
    public static void main(String[] args) {
     
        /**En introduktion, samt så ber jag användaren skriva in två tal som ska adderas och sedan skrivas ut.
        De sparas som doubles**/
        System.out.println("Hej och välkommen till mitt lilla program!");
        System.out.println("Nu ska vi addera två tal, var vänlig och skriv in ett tal.");
        double forsta_tal = Kontroll();
        System.out.println("Var vänlig och skriv in ett till tal.");
        double andra_tal = Kontroll();
        double summa = forsta_tal + andra_tal;
        System.out.println("Vi adderar dina tal: " + forsta_tal + " + " + andra_tal + " = " + summa + ".");
        
        
        /**Här ber jag användaren skriva in ett tal som ska subtraheras från summan och sedan displaya differansen.**/
        System.out.println("Nu ska vi subtrahera: ");
        double tredje_tal = Kontroll();
        double differans = summa - tredje_tal;
        System.out.println("Differansen är: " + summa + " - " + tredje_tal + " = "+ differans);
        
        /**Här ber jag användaren skriva ett tal som ska multipliceras med differansen och sedan displayas.**/
        System.out.println("Nu ska vi multiplicera: ");
        double fjerde_tal = Kontroll();
        double multiplication = differans * fjerde_tal;
        System.out.println("Multiplicering: " + differans + " * " + fjerde_tal +" = " + multiplication);
        
        /**Här ber jag användaren skriva ett tal som ska divideras med produkten och sedan displayas, sedan avslutas programet.**/
        System.out.println("Sist ska vi dividera: ");
        double femte_tal = Kontroll();
        double dividering = multiplication / femte_tal;
        System.out.println("Dividering: " + multiplication + " / " + femte_tal + " = " + dividering);
        System.exit(0);
          
    }
    
}
