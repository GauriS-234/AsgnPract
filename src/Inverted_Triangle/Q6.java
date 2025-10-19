package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern7 {

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

        System.out.println("\nGenerated Pattern:");

        for (int i = 1; i <= numRows; i++) {

            int elementsInRow = numRows - i + 1;

            for (int j = 1; j <= elementsInRow; j++) {

                if (j == 1) {
                    System.out.print("1 ");
                } else if (j == 2) {
                    System.out.print("a ");
                } else if (j == 3) {
                    System.out.print("2 ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

