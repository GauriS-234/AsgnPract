package Array;

import java.util.*;
class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int sum = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum += (arr[i][j] = sc.nextInt());
        System.out.println("Sum=" + sum);
    }
}

