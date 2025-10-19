package Diamond;

import java.util.Scanner;

class DiamondRepeatedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        int totalRows = 2 * rows - 1;
        for (int i = 1; i <= totalRows; i++) {
            int currentRow = (i <= rows) ? rows - i + 1 : i - rows + 1;
            for (int s = 0; s < rows - (i <= rows ? i : totalRows - i + 1); s++) System.out.print("  ");
            int elements = 2 * (i <= rows ? i : totalRows - i + 1) - 1;
            for (int j = 0; j < elements; j++) System.out.print(currentRow + " ");
            System.out.println();
        }
    }
}

