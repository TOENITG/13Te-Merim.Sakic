package cardgame;
import java.util.*;

public class CardGame {
     
    /**Kapitalet**/
    static int money = 300;
    
    /**Detta är "spelplanen".**/
    static  int[]cardNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static String[]cardSuit = {"Spades", "Hearts", "Diamonds", "Clubs"};
    
    /**"Press enter to continue" metod**/
    static void pauseProg(){
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
    
    public static void main(String[] args) {
       
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Welcome to my Card Game!");
        System.out.println("Do you need instructions? (if true enter yes otherwise press enter)");
        String svar1 = user_input.nextLine();
            if(svar1.equalsIgnoreCase("yes")){
                
                /**Hur man spelar - INSTRUKTIONER**/
                System.out.println("You start by choosing suit, and then a number between 1-13.");
                System.out.println("1=aces, 2-10=the value they represent, 11=Jack, 12=Queen och 13=King.");
                System.out.println("Then you'll choose your bet. (You start with 300 coins)");
                    pauseProg();
                System.out.println("Exampel. Spdes of 5 and 10 coins.");
                System.out.println("Then the game will automatically drew one of 52 possible cards.");
                System.out.println("If you guessed the card, you will win 100% of your bet.");
                System.out.println("So if you bet 10 coins you will get 20 back.");
                    pauseProg();
                System.out.println("If you only guess the number right or the suit, you'll win 50% of your bet");
                System.out.println("Are you redy?");
                    pauseProg();
            }
            else {
                pauseProg();
            }
            
                System.out.println("Now we start!");
            
                /**Koden nedan ska köras sålänge Saldot är över 0.**/
            while(money > 0) {
                
                /**Programet frågar efter en uppsättning.**/
                System.out.println("Choose a suit - Spades, Clubs, Hearts or Diamonds");
                String InputSuit = user_input.nextLine();
               
                /**Programmet kontrollerar ifall man har valt en giltig uppsättning.**/ 
                while(!InputSuit.equalsIgnoreCase("spades") && !InputSuit.equalsIgnoreCase("clubs") && !InputSuit.equalsIgnoreCase("hearts") && !InputSuit.equalsIgnoreCase("diamonds")){
                    System.out.println("The choosen suit does not exist, choose again.");
                    InputSuit = user_input.nextLine();
                }

                /**Programet frågar efter ett kortnummer**/
                System.out.println("Choose a number between 1 - 13");
                String InputNumber = user_input.nextLine();
                while(!InputNumber.matches("[0-9]+")){
                    System.out.println("Choose a number between 1-13!");
                    InputNumber = user_input.nextLine();
                }
                int ConvertedInputNumber = Integer.parseInt(InputNumber);
                    
                /**Här kontrollerar programet ifall det valda kortnummret finns.**/
                while(ConvertedInputNumber > 13 | ConvertedInputNumber < 1) {
                    System.out.println("Choose a number between 1-13.");
                    InputNumber = user_input.nextLine();
                    if(InputNumber.matches("[0-9]+")){
                    ConvertedInputNumber = Integer.parseInt(InputNumber);
                    }
                }   
                
                 /**Programet frågar efter spelarens insats. Plus den kontrollerar att det är siffror **/
                System.out.println("Choose your bet!(Only Integers) Currency: " + money);
                String InputBet = user_input.nextLine();
                while(!InputBet.matches("[0-9]+")){
                    System.out.println("Choose again! Only Integers!");
                    InputBet = user_input.nextLine();
                }
                int ConvertedInputBet = Integer.parseInt(InputBet);
                
                /**Här kontrollerar programmet ifall insättningen överstiger saldo eller är orimligt**/
                while(ConvertedInputBet>money | ConvertedInputBet < 0){
                    System.out.println("You can't lay that bet, Please choose another bet! Your Currency: " + money);
                    InputBet = user_input.nextLine();
                    if(InputBet.matches("[0-9]+")) {
                    ConvertedInputBet = Integer.parseInt(InputBet);
                    }
                }
                /**Saldot efter insastsen har blivit gjord.**/
                money = money - ConvertedInputBet;
                
                /**Jag skriver ut en rad där det står hur mkt pengar man har kvar.**/
                System.out.println("Currency: " + money);
                pauseProg();
                
                Random randomValue = new Random();
                
                /**Här Randomgeneratar jag kortnummer samt uppsättningen.**/
                int RandomizedcardNumber = (cardNumber[randomValue.nextInt(cardNumber.length)]);
                String RandomizedcardSuit = (cardSuit[randomValue.nextInt(cardSuit.length)]);
                
                /**Här kontrollerar programmet ifall man har gissat rätt på uppsättningen**/
                if(InputSuit.equalsIgnoreCase(RandomizedcardSuit)) {
                    int InputSuitBetGain = ConvertedInputBet / 2;
                    System.out.println("You guessed the Suit right. :)");
                    money = money + InputSuitBetGain + ConvertedInputBet;
                    }
                else{
                    System.out.println("You guessed wront on the suit. :(");
                } 
                
                /**Här kontrollerar programmet ifall man har gissat rätt på kortnummret**/
                if(InputNumber.equals(RandomizedcardNumber)) {
                    int InputCardBetGain = ConvertedInputBet / 2;
                    System.out.println("You gueseed right on the number. :)");
                    money = money + InputCardBetGain + ConvertedInputBet;
                    }
                else {
                    System.out.println("You guessed wrong on the number. :(");
                }
                
                /**Här displays ens gissning, vad datorn tog fram samt saldot**/
                System.out.println("Your guess: " + InputSuit + ", " + InputNumber);
                System.out.println("Randomated: " + RandomizedcardSuit + ", " + RandomizedcardNumber);
                System.out.println("Your current currency: " + money);
            
                /**När kapitalet når 0 coins, så frågar spelet ifall man vill restarta, 
                 * om ja så tillsätts 300 coins på kontot annars så stängs programmet av**/
                while(money==0) {
                    System.out.println("You are depleted, play again? y/n");
                    String PlayAgain = user_input.nextLine();
                    String IfPlayAgain = PlayAgain.substring(0,1);
                        if(IfPlayAgain.equalsIgnoreCase("y")) {
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