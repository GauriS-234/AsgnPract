package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        int numRows = scanner.nextInt();

        if (numRows < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("\nGenerated Pattern:\n");

        char ch = 'A'; // Start character

        for (int i = 1; i <= numRows; i++) {

            // Print leading tabs (indentation)
            for (int s = 1; s < i; s++) {
                System.out.print("\t");
            }

            // Print characters in row
            for (int j = i; j <= numRows; j++) {

                // Alternate uppercase/lowercase pattern
                if ((ch - 'A') % 2 == 0) {
                    System.out.print(ch + "\t");
                } else {
                    System.out.print(Character.toLowerCase(ch) + "\t");
                }

                ch++;
                if (ch > 'Z') ch = 'A'; // wrap around if exceeds Z
            }

            System.out.println();
        }

        scanner.close();
    }
}
