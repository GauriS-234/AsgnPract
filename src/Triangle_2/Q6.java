package Triangle_2;

import java.util.Scanner;
class Pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print((char)('A' + i - j - 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
