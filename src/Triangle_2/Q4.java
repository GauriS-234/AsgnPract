package Triangle_2;

import java.util.Scanner;

class Pattern9 {

        public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

System.out.println("Enter number of rows: ");

    int rows= sc.nextInt();

     for (int i = 1; i <= rows; i++) {

        for (int j = rows; j >= rows-i+1; j--) {

            if (i % 2 != 0) {
                System.out.print((char) ('a' + j - 1) + "\t");

                System.out.println((char) ('a' + j - 1) + "\t");

            } else {

                System.out.print((j) + "\t");
            }
        }
            System.out.println();
        }
    }
    }