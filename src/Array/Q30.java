package Array;

import java.util.*;
class CornerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(arr[0][0] + " " + arr[0][c - 1] + " " + arr[r - 1][0] + " " + arr[r - 1][c - 1]);
    }
}

