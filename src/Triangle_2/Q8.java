package Triangle_2;

import java.util.Scanner;
class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int ch = i;
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print((char)('A' + ch - 1) + "\t");
                } else {
                    System.out.print(ch + "\t");
                }
                ch--;
            }
            System.out.println();
        }
    }
}
