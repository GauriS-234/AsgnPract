package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (N): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }

        System.out.println("\nGenerated Pattern:\n");

        char currentChar = 'A'; // starting character

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print("\t");
            }

            // Print characters in the current row
            for (int j = i; j <= n; j++) {
                // Alternate uppercase/lowercase for variety
                if (currentChar % 2 == 0)
                    System.out.print(Character.toLowerCase(currentChar) + "\t");
                else
                    System.out.print(currentChar + "\t");

                currentChar++;
                if (currentChar > 'Z') currentChar = 'A'; // wrap around if needed
            }

            System.out.println();
        }

        sc.close();
    }
}
