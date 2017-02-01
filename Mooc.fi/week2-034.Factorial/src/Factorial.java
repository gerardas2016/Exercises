import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int i= reader.nextInt();
        int a=0;
        int sum=1;
        while (a<i){
            sum*=i;
            i--;
        }
        System.out.println("Sum is "+sum);
    }
}
