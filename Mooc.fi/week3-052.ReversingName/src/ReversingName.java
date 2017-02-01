import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name= reader.nextLine();
        int lenght=name.length()-1;
         int i=0;
         String a= "";
        while(i<name.length()){
            //System.out.println(lenght);
           // System.out.print("In reverse order: "+name.charAt(lenght));
            a+=name.charAt(lenght);
        i++;
        lenght--;
       
        }
         System.out.print("In reverse order: "+a);
    }
}
