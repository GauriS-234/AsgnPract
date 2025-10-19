package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = 0;

        System.out.print("Enter the number of rows (N): ");
        if (scanner.hasNextInt()) {
            numRows = scanner.nextInt();
            if (numRows < 1) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        System.out.println("\nGenerated Pattern:\n");

        for (int i = 1; i <= numRows; i++) {
            // Add indentation (spaces) for triangular shape
            for (int s = 1; s < i; s++) {
                System.out.print("    ");
            }

            // Decide starting character (uppercase for odd rows, lowercase for even rows)
            char currentChar = (i % 2 == 0) ? 'a' : 'A';

            // Print decreasing number of letters per row
            for (int j = i; j <= numRows; j++) {
                System.out.print(currentChar + "   ");
                currentChar++;
            }

            System.out.println();
        }

        scanner.close();
    }
}
