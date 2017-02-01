
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

       while (hangman.gameOn() ){
           
       System.out.println("Type a command: ");
       String com= reader.nextLine();
       if (com.equals("quit")) {
           //System.out.println("Thank you for playing!");
           break;}
       if (com.equals("status")){
           hangman.printStatus();
           System.out.println("You have not made any guesses yet.");
           System.out.println("Unused letters: abcdefghijklmnopqrstuvwxyz");
       }
       if(com.length() == 1) {  
        hangman.guess(com);
        }
       if(com.isEmpty()) {
    System.out.println("String was empty");
    printMenu();
       }
hangman.printMan() ;
hangman.printWord() ;

       
       
           
       } // PROGRAM YOUR SOLUTION HERE


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
