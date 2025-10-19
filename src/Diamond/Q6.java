package Diamond;

import java.util.Scanner;

class DiamondNumericPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        int totalRows = 2 * rows - 1;
        for (int i = 1; i <= totalRows; i++) {
            int currentRow = (i <= rows) ? i : 2 * rows - i;
            for (int s = 0; s < rows - currentRow; s++) System.out.print("  ");
            for (int j = 1; j <= currentRow; j++) System.out.print(j + " ");
            for (int j = currentRow - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}

