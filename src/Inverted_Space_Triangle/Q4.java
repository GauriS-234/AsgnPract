package Inverted_Space_Triangle;

import java.util.Scanner;

 class Pattern3 {
    public static void main(String[] args) {
        int rows = 3;
        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");

            if (i == 1) {
                System.out.println("1   2   3");
            } else if (i == 2) {
                System.out.println("A   B");
            } else {
                System.out.println("1");
            }
        }
    }
}
