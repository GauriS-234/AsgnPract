package Nested_for_1;

import java.util.Scanner;
class NumberLetterCombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(j + "" + ch + "\t");
            }
            System.out.println();
        }
    }
}
