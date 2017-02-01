
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int x= reader.nextInt();
        
        if (x<=29) System.out.println("failed");
        else if (x<=34)System.out.println("1");
        else if (x<=39)System.out.println("2");
        else if (x<=44)System.out.println("3");
        else if (x<=49)System.out.println("4");
        else System.out.println("5");
    }
}
