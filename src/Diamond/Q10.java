package Diamond;

import java.util.Scanner;

class DiamondRowPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        int totalRows = 2 * rows - 1;
        for (int i = 1; i <= totalRows; i++) {
            int currentRow = (i <= rows) ? i : 2 * rows - i;
            for (int s = 0; s < rows - currentRow; s++) System.out.print("  ");
            for (int j = currentRow; j < 2*currentRow; j++) System.out.print(j + " ");
            for (int j = 2*currentRow - 2; j >= currentRow; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}

