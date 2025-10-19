package Diamond;

import java.util.Scanner;

 class DiamondOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int totalRows = n * 2 - 1;
        int oddNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("    ");
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++) System.out.print(oddNumber + "   ");
            System.out.println();
            oddNumber += 2;
        }
        oddNumber -= 4;
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("    ");
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++) System.out.print(oddNumber + "   ");
            System.out.println();
            oddNumber -= 2;
        }
    }
}
