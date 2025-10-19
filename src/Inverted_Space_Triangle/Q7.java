package Inverted_Space_Triangle;

import java.util.Scanner;

 class PatternABCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        char ch = 'A'; // Starting character

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("    "); // 4 spaces for alignment
            }

            // Print characters for this row
            for (int j = i; j <= rows; j++) {
                // Print letter — uppercase for odd count, lowercase for even
                if ((ch - 'A') % 2 == 0)
                    System.out.print(ch + "   ");
                else
                    System.out.print(Character.toLowerCase(ch) + "   ");
                ch++;
            }

            System.out.println(); // Move to next line
        }
        sc.close();
    }
}

