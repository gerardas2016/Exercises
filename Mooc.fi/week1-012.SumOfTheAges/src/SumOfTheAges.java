
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println("Type your name: ");
	        String name= reader.nextLine();
	        
	        
	        System.out.println("Type your age : ");
	        int x= Integer.parseInt(reader.nextLine());
	        
	        System.out.println("Type your name: ");
	        String z= reader.nextLine();
	        
	        
	        System.out.println("Type your age: ");
	        int y= Integer.parseInt(reader.nextLine()); 
	        
	        System.out.println(name+" and "+ z+ " are "+(x+y)+" years old in total.");
        
       
    }
}
