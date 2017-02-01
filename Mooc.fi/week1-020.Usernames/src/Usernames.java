
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String x= reader.nextLine();
        System.out.println("Type your password: ");
        String y= reader.nextLine();
        
        String a= "alex";
        String b= "mightyducks";
        String c= "emily";
        String d = "cat";
        
        if ((x.equals(a)&&y.equals(b))||(x.equals(c)&&y.equals(d))) System.out.println("You are now logged into the system!");
        else System.out.println("Your username or password was invalid!");
    }
}
