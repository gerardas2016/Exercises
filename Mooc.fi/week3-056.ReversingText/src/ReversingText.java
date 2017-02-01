
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
// write your code here
        int i=0;
        int j= text.length()-1;
        String a="";
       //
        while (i<text.length()){
        a +=text.charAt(j);
           
        i++;
        j--;
        }
            

// note that method does now print anything, it RETURNS the reversed string
        return a;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
