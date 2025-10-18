package Nested_for_1;

import java.util.Scanner;
class ContinuousNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(num++ + "\t");
            }
            System.out.println();
        }
    }
}
