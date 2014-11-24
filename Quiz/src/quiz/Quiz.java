package quiz;

import java.util.*;

/*
 * @Merim Sakic
 */
public class Quiz {

    static Scanner user_input = new Scanner(System.in);
    
    static int points = 0;
    
    /** Här har jag gjort en metod som kallas på efter frågan är ställd och kontrollerar
     *ifall svaret är rätt, om så är fallet så får man ett poäng även.**/
    static boolean isitcorrect (String theAnswer) {
        boolean value = true;
        String Answer = user_input.nextLine();
        if(Answer.equalsIgnoreCase(theAnswer)) {
            System.out.println("Rätt svar!");
            points++;
            value = true;
        }
        else {
            System.out.println("Fel svar!");
    }
        return value;
    }
    /**Används i början för att starta programmet, denna snutt gör "flowet" snyggare**/
    public static void pauseProg(){
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
   
    public static void main(String[] args) {
        
        /**Svar på frågorna**/
        String svar1 = "barrack obama";
        String svar2= "1998";
        String svar3= "simon ekdahl";
        String svar4= "5";
        String svar5= "darth vader";
        String svar6= "islands häst";
        String svar7= "ja";
        String svar8= "muuu";
        String svar9= "lenovo";
        String svar10= "fredrik reinfeldt";
        
        
        /**Quizet startar**/
        System.out.println("Välkommen till mitt quiz! tryck Enter när du vill börja");
        pauseProg();
 
        /**Här ställs frågorna plus så kontrolleras svaren.**/
        System.out.println("Vad heter USA's president?");
        isitcorrect(svar1);
        
        System.out.println("När bildades IT-Gymnasiet?");
        isitcorrect(svar2);
        
        System.out.println("Vad heter våran ny rektor på ITG i Örebro?");
        isitcorrect(svar3);
        
        System.out.println("Hur många dagar i veckan går vi i skolan?");
        isitcorrect(svar4);
       
        System.out.println("Vad heter mannen med svart mask i Star Wars?");
        isitcorrect(svar5);
        
        System.out.println("Vilken hästras finns på Island?");
        isitcorrect(svar6);
        
        System.out.println("Är Samsung bättre än Iphone?");
        isitcorrect(svar7);
        
        System.out.println("Vad säger kosorna? (tre slutbokstäver)");
        isitcorrect(svar8);
        
        System.out.println("Vad är ITG's märke på PC datorerna?");
        isitcorrect(svar9);
        
        System.out.println("Vad heter våran gamla stadsminister?");
        isitcorrect(svar10);
        
        /**Här displayas den ihopskrapade poängsumman och programet avslutas**/
        System.out.println("Du har samlat: " + points + " poäng");
        System.exit(0);
    }
    
}