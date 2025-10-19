package Space_triangle_2;

import java.util.Scanner;

 class NumberPattern1 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter number of rows:");
         int rows = scanner.nextInt();
         int num = 1;
         for (int i = 1; i <=rows ; i++){
             for (int s = 1 ; s <= rows ; s++){
                 System.out.print("\t");
             }
             for (int j = 1; j <=i ; j++){
                 System.out.print(num+"\t");
                    num +=2;
             }
             System.out.println();
         }
     }
 }
