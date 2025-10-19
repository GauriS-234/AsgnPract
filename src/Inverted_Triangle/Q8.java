package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern9 {

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

            // Add spaces for triangular shape
            for (int s = 1; s < i; s++) {
                System.out.print("    ");
            }

            int currentNum = numRows - i + 1;  // Starting number for the row
            char currentChar = (char) ('A' + numRows - i); // Starting letter for row (A, B, C...)

            // Row alternation: odd = numbers, even = letters
            for (int j = i; j <= numRows; j++) {
                if (i % 2 != 0) {
                    System.out.print(currentNum + "   ");
                    currentNum--;
                } else {
                    System.out.print(currentChar + "   ");
                    currentChar--;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
