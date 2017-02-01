public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
         int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
          System.out.print("\n");
    
    }

    public static void printWhitespaces(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print(" ");
            printed = printed + 1;
        }
       // System.out.println("");
    }

    public static void printTriangle(int size) {
        
        int a= 1;
        
        while (size>0){
        size--;
            int x=size;
            printWhitespaces(x);
            printStars(a);
            a++;
        }
//        int a = 1;
//        while (size > 0){
//            size--;
//            printWhitespaces(size);
//            printStars(a);
//
//            a++;
//
//        }

        
        
//        int x= size;
//        int y= 0;
//        int i=0;
//        while (i<=size){
//           
//            printWhitespaces(x);
//           printStars(y);
//            x--;
//           
//            y++;
//            i++;
           
    
        
        
//        System.out.println("***");
//        System.out.println("   ***");
    }

    public static void xmasTree(int height) {
        int x= height-1;
        int y= 1;
        int i=0;
        int n=0;
        while (i<height){
            printWhitespaces(x);
           printStars(y);
            x--;
            y+=2;
            i++;
        }
        while(n<2){
            int c=height-2;
              printWhitespaces(c);
               printStars(3);  
               n++;
               c--;
         }
//        System.out.println("         ***");
//        System.out.println("         ***");
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

       printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
