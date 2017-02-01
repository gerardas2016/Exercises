
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int a= Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int another = Integer.parseInt(reader.nextLine());
        
        double d= (double) a/another;
        
        String print= "Division:"+a+"/"+another+" = "+d;
        System.out.println(print);
        
        
        
//       System.out.println("Type a number: ");
//        int x= Integer.parseInt(reader.nextLine());
//       System.out.println("Type another number: ");
//        int y= Integer.parseInt(reader.nextLine());
//        
//        double z=(double )x/y;
//        String print= "Divison: "+ x+ "/"+y+ " = "+ z;
//       System.out.println(print);
// Implement your program here. Remember to ask the input from user.
    }
}
