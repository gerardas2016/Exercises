
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int i= reader.nextInt();
        int a=0;
        int sum=0;
        while (a<i){
            sum+=i;
            i--;
        }
        System.out.println("Sum is "+sum);
    }
}
