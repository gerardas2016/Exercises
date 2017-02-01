
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int i= reader.nextInt();
       // i= (int) ((double) i*1.0);
        int sum=0;
        int x=0;
        while (i>=0){
        sum= (int) Math.pow(2, i);
        i--;
        
        x +=sum;
        // System.out.println("The result is "+ sum);
            //System.out.println(x);
        }
        
        System.out.println("The result is "+ x);
        
//        System.out.print("Type a number: ");
//        int n = Integer.parseInt(reader.nextLine());
//        int result = 0;
// 
//        int number = 0;
//        while (number <= n) {
//            int power = (int) Math.pow(2, number);
//            result += power;
//            number++;
//        }
// 
//        System.out.println("The result is " + result);
// 
//    }

    }
}
