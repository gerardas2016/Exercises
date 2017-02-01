
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int i= reader.nextInt();
        System.out.println("Last: ");
        int a= reader.nextInt();
        int sum=0;
        while (i<=a){
            sum+=a;
            a--;
        }
        System.out.println("The sum "+ sum);
    }
}
