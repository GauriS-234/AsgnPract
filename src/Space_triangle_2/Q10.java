package Space_triangle_2;

import java.util.Scanner;



import java.util.Scanner;

class NumberPattern10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        int ch = 65;
        for (int i = 1; i <=rows ; i++){
            for (int s = 1 ; s <= rows-i ; s++){
                System.out.print("\t");
            }
            for (int j = 1; j <=i ; j++){
                if (i % 2 ==1){
                    System.out.print(i+ ""+ (char)ch+"\t");
                    ch++;
                }else{
                    System.out.print(i+ ""+ (char)(ch+32)+"\t");
                    ch++;
                }


            }

            System.out.println();
        }
    }
}



