import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String word= reader.nextLine();
        System.out.println("Length of the end part: ");
        int a= reader.nextInt();
        //int b= 
        System.out.println("Result: "+ word.substring(word.length()-a));
        
        
//        System.out.print("Length of the end part:  ");
//        int lengthOfEnd = Integer.parseInt(reader.nextLine());
//         
//        int startingPosition = word.length() - lengthOfEnd;
//        System.out.print("Result: " + word.substring(startingPosition, word.length()));

    }
}
