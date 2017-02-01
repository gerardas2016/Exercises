
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        System.out.println("Type the first number: ");
        int a= reader.nextInt();
        System.out.println("Type the second number: ");
        int b= reader.nextInt();
        System.out.println("Type the third number: ");
        int c= reader.nextInt();
        sum= a+b+c;

        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
