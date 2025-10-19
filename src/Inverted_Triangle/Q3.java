package Inverted_Triangle;

import java.util.Scanner;

 class NumberPattern3 {

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

        int totalElements = numRows * (numRows + 1) / 2;
        int currentNum = 2 * totalElements;

        for (int i = 1; i <= numRows; i++) {
            for (int j = i; j <= numRows; j++) {
                System.out.print(currentNum + " ");
                currentNum -= 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

