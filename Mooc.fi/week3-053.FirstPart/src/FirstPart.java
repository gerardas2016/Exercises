
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String word= reader.nextLine();
        System.out.println("Length of the first part: ");
        int a= reader.nextInt();
        
        System.out.println("Result: "+ word.subSequence(0, a));
        
//        System.out.print("Length of the first part: ");
//        int lengthOfBeginning = Integer.parseInt(reader.nextLine());
//         
//        System.out.print("Result: " + word.substring(0, lengthOfBeginning));

        
    }
}
