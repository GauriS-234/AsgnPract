package Inverted_Space_Triangle;

import java.util.Scanner;

 class Pattern2 {
    public static void main(String[] args) {
        int rows = 3;
        char ch = 'A';
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");

            if (i == 1) {
                System.out.println("A   b   C");
            } else if (i == 2) {
                System.out.println("1   2");
            } else {
                System.out.println("C");
            }
        }
    }
}
