public class Printing {

    public static void printStars(int amount) {
       int i=0;
       while (i<amount){
        System.out.print("*");
        i++;
       }
       System.out.print("\n");

        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        int x= sideSize;
        int i=0;
        while (i<sideSize){
            printStars(x);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int x= width;
        int i= 0;
        while (i<height){
            printStars(x);
          i++;
        }
      
        
        // 39.3
    }

    public static void printTriangle(int size) {
        int i=0;
        while (i<size){
              i++;
            printStars(i);
        }
        
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

      //  printStars(3);
//         printStars(5);
//          printStars(8);
      //  System.out.println("\n---");  // printing --- to separate the figures
      //  printSquare(4);
        System.out.println("\n---");
       // printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
//} public static void printStars(int amount) {
//        // 39.1
//        // you can print one star with the command
//        // System.out.print("*");
//        // call this command amount times        
//        int printed = 0;
//        while (printed < amount) {
//            System.out.print("*");
//            printed = printed + 1;
//        }
//        System.out.println("");
//    }
// 
//    public static void printSquare(int sideSize) {
//        // 39.2
//        int printed = 0;
//        while (printed < sideSize) {
//            printStars(sideSize);
//            printed = printed + 1;
//        }
//    }
// 
//    public static void printRectangle(int width, int height) {
//        // 39.3
//        int printed = 0;
//        while (printed < height) {
//            printStars(width);
//            printed = printed + 1;
//        }
//    }
// 
//    public static void printTriangle(int size) {
//        // 39.4
//        int row = 1;
//        while (row <= size) {
//            printStars(row);
//            row = row + 1;
//        }
//    }
// 
//    public static void main(String[] args) {
//        // Tests do not use main, yo can write code here freely!
//        // if you have problems with tests, please try out first 
//        // here to see that the printout looks correct
// 
//        printStars(3);
//        System.out.println("\n---");  // printing --- to separate the figures
//        printSquare(4);
//        System.out.println("\n---");
//        printRectangle(5, 6);
//        System.out.println("\n---");
//        printTriangle(3);
//        System.out.println("\n---");
//    }
