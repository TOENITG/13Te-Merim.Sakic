package cardgame;
import java.util.*;

public class CardGame {
     
    /**Kapitalet**/
    static int money = 300;
    
    /**Detta är "spelplanen".**/
    static  int[]cardNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static String[]cardSuit = {"Spader", "Hjärter", "Klöver", "Ruter"};
    
    /**"Press enter to continue" metod**/
    static void pauseProg(){
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Välkommen till mitt kort spel!");
        System.out.println("Vet du hur man spelar spelet? (Om jag skriv Ja) ");
        String svar1 = user_input.nextLine();
            if(!svar1.equalsIgnoreCase("ja")){
                
                /**Hur man spelar - INSTRUKTIONER**/
                System.out.println("Du börjar med att välja en uppsättning och sedan ett tal mellan 1-13.");
                System.out.println("1=ess, 2-10=de värden de representerar, 11=Knekt, 12=Dam och 13=Kung.");
                System.out.println("Sedan väljer du din insättning. (OBS ditt start kapital är 300 coins)");
                    pauseProg();
                System.out.println("Exempel. Ruter 5 och 10 coins.");
                System.out.println("Sedan kommer spelet automatiskt dra ett av 52 möjliga kort");
                System.out.println("Om du gissade rätt kort, vinner du +100% av din satsade insättning.");
                System.out.println("Om du satsade 10 coins får du 20 tillbaka.");
                    pauseProg();
                System.out.println("Om du enbart gissar rätt på siffra eller uppsättning, så vinner du bara 50% av insättningen");
                System.out.println("Är du redo?");
                    pauseProg();
            }
            else {
                pauseProg();
            }
            
                System.out.println("Då börjar vi!");
            
                /**Koden nedan ska köras sålänge Saldot är över 0.**/
            while(money > 0) {
                
                /**Programet frågar efter en uppsättning.**/
                System.out.println("Välj en uppsättning (Hjärter, Klöver, Ruter eller Spader)");
                String InputSuit = user_input.nextLine();
                
                
                while(!InputSuit) { <------------------- fortsätt här!
                
                
                     System.out.println("Skärp dig! Skriv någon av uppsättningarna");
                    InputSuit = user_input.next();
                }
                
                /**Måste substringa första bokstaven på uppsättningen när användaren skriver in Hjärter eller Klöver, de
                 * sparas inte som hjärter eller klöver p.g.a. "ä/ö". Så får jämföra första bokstaven med första bokstaven 
                 * på det som datorn slumpar fram **/
                String subInputSuit = InputSuit.substring(0, 1);
                
                /**Programet frågar efter ett kortnummer**/
                System.out.println("Välj ett tal mellan 1 - 13");
                String InputNumber = user_input.nextLine();
                while(!InputNumber.matches("[0-9]+")){
                    System.out.println("Välj ett tal mellan 1-13!");
                    InputNumber = user_input.nextLine();
                }
                int ConvertedInputNumber = Integer.parseInt(InputNumber);
                    
                /**Här kontrollerar programet ifall det varda kortnummret finns.**/
                while(ConvertedInputNumber > 13 | ConvertedInputNumber < 1) {
                    System.out.println("Välj ett tal mellan 1-13.");
                    InputNumber = user_input.nextLine();
                    if(InputNumber.matches("[0-9]+")){
                    ConvertedInputNumber = Integer.parseInt(InputNumber);
                    }
                }   
                
                 /**Programet frågar efter spelarens insats. Plus den kontrollerar att det är siffror **/
                System.out.println("Välj din insats!(Endast heltal) saldo: " + money);
                String InputBet = user_input.nextLine();
                while(!InputBet.matches("[0-9]+")){
                    System.out.println("Välj om din insats! (Endast tal - Heltal)");
                    InputBet = user_input.nextLine();
                }
                int ConvertedInputBet = Integer.parseInt(InputBet);
                
                /**Här kontrollerar programmet ifall insättningen överstiger saldo**/
                while(ConvertedInputBet>money | ConvertedInputBet < 0){
                    System.out.println("Du kan ej lägga den insatsen, var vänlig skriv en annan summa! Ditt Saldo: " + money);
                    InputBet = user_input.nextLine();
                    if(InputBet.matches("[0-9]+")) {
                    ConvertedInputBet = Integer.parseInt(InputBet);
                    }
                }
                money = money - ConvertedInputBet;
                
                System.out.println("Ditt Saldo: " + money);
                pauseProg();
                
                Random randomValue = new Random();
                
                /**Här Randomgeneratar jag kortnummer samt uppsättningen.**/
                int RandomizedcardNumber = (cardNumber[randomValue.nextInt(cardNumber.length)]);
                String RandomizedcardSuit = (cardSuit[randomValue.nextInt(cardSuit.length)]);
                String subRandomizedcardSuit = RandomizedcardSuit.substring(0,1);
                
                
                /**Här kontrollerar programmet ifall man har gissat rätt**/
                if(subInputSuit.equalsIgnoreCase(subRandomizedcardSuit)) {
                    int InputSuitBetGain = ConvertedInputBet / 2;
                    System.out.println("Du gissade rätt på uppsättningen. :)");
                    money = money + InputSuitBetGain + ConvertedInputBet;
                    }
                if(InputNumber.equals(RandomizedcardNumber)) {
                    int InputCardBetGain = ConvertedInputBet / 2;
                    System.out.println("Du gissade rätt på kortnummret. :)");
                    money = money + InputCardBetGain + ConvertedInputBet;
                    }
                
                /**Här displays ens gissning, vad datorn tog fram samt saldot**/
                System.out.println("Du gissade: " + InputSuit + ", " + InputNumber);
                System.out.println("Datorn tog fram: " + RandomizedcardSuit + ", " + RandomizedcardNumber);
                System.out.println("Ditt saldo är nu: " + money);
            
                
                /**När kapitalet når 0 coins, så frågar spelet ifall man vill restarta, 
                 * om ja så tillsätts 300 coins på kontot**/
                while(money==0) {
                    System.out.println("Dina pengar tog slut, vill du spela igen? y/n");
                    String PlayAgain = user_input.nextLine();
                    String IfPlayAgain = PlayAgain.substring(0,1);
                        if(IfPlayAgain.equalsIgnoreCase("y") | IfPlayAgain.equalsIgnoreCase("j")) {
                            money = money + 300;
                        }
                else{
                    System.out.println("Game Over");
                    System.exit(0);
                    }
                        
            }
        }
    }
}