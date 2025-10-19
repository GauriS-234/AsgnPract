package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern8 {

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
            // Indentation for triangle shape
            for (int s = 1; s < i; s++)
                System.out.print("    ");

            int num = numRows - i + 1;  // starting number for the row
            char ch = 'a';              // starting character

            for (int j = i; j <= numRows; j++) {
                // Print number for odd columns, letter for even columns
                if ((j - i) % 2 == 0) {
                    System.out.print(num + "   ");
                    num--;
                } else {
                    System.out.print(ch + "   ");
                    ch++;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
