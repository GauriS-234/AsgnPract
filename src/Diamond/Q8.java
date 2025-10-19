package Diamond;

import java.util.Scanner;

class DiamondAlphabetPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        int totalRows = 2 * rows - 1;
        for (int i = 1; i <= totalRows; i++) {
            int currentRow = (i <= rows) ? i : 2 * rows - i;
            for (int s = 0; s < rows - currentRow; s++) System.out.print("  ");
            int start = rows - currentRow;
            for (int j = 0; j < currentRow; j++) System.out.print((char)('A' + start + j) + " ");
            for (int j = currentRow - 2; j >= 0; j--) System.out.print((char)('A' + start + j) + " ");
            System.out.println();
        }
    }
}

