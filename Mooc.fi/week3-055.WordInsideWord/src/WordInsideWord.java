
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String zodis2 = reader.nextLine();

        int index = word.indexOf(zodis2);

        if(index> -1){

            System.out.println("The word " + zodis2 + " is found in the word " + word);
        }
        else {
            System.out.println("The word " + zodis2 + " is not found in the word " + word);
        }
        
        
        
        
    }
    
//    String word1 = reader.nextLine();
//        System.out.print("Type the 2. word:");
//        String word2 = reader.nextLine();
// 
//        if (word1.indexOf(word2) != -1) {
//            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
//        } else {
//            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
//        }

    
    
    
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Type the first word: ");
//        String word= reader.nextLine();
//        System.out.println("Type the second word: ");
//        String word2= reader.nextLine();
//        int a=word.indexOf(word2);
//        String b= word.substring(a);
//        System.out.println(a);
//        System.out.println(b);
//        
//        //if (word.contains(word.substring(a)))
//        if (a > -1){
//            System.out.println("The word "+ word2+" is found in the word "+ word);
//        }
//        else System.out.println("The word "+word2+" is not found in the word "+ word);
//        
//    }
}
