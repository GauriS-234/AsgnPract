package Diamond;

import java.util.Scanner;

import java.util.Scanner;

class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        if (rows > 0) {
            generateDiamond(rows);
        }
        scanner.close();
    }

    public static void generateDiamond(int rows) {
        int totalRows = 2 * rows - 1;
        for (int i = 1; i <= totalRows; i++) {
            int currentRow = (i <= rows) ? i : (2 * rows - i);
            int spaces = rows - currentRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            int num = (currentRow % 2 != 0) ? 1 : 0;
            int elements = 2 * currentRow - 1;
            for (int j = 0; j < elements; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
