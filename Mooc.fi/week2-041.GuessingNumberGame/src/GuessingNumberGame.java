
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int x=0;
        int i=0;
        while (numberDrawn!=x){
            System.out.println("Guess a number: ");
            x = reader.nextInt();
            
            i++;
            if (x<numberDrawn){
                System.out.println("The number is greater, guesses made: "+i);
                System.out.println("");
            }
            if (x>numberDrawn){
                System.out.println("The number is lesser, guesses made: "+i);
            }
            if (x==numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
            break;}
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
