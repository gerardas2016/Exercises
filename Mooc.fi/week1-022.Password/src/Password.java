
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while(true){
            System.out.println("Type the password:");
            String x= reader.nextLine();
            if (password.equals(x)){
                System.out.println("Right!");
                System.out.println("The secret is: Hello world!");
                break;
            }
            else System.out.println("Wrong!");
            
        }
        // Write your code here
    }
}
