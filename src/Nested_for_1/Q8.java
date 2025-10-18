package Nested_for_1;

import java.util.Scanner;
class AlphabetSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(ch++ + "\t");
            }
            System.out.println();
        }
    }
}
