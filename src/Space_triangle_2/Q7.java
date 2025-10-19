package Space_triangle_2;

import java.util.Scanner;

class NumberPattern7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <=rows ; i++){
            for (int s = 1 ; s <= rows-i ; s++){
                System.out.print("\t");
            }
            for (int j = 1; j <=i ; j++){
                if (i % 2==0){
                    System.out.print(ch+"\t");
                }else {
                    System.out.print(num+"\t");
                }

                num ++;
            }
            if(i % 2==0)
                ch++;
            System.out.println();
        }
    }
}

