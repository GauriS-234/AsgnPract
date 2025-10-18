package Nested_for_1;

import java.util.Scanner;
class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }
    }
}