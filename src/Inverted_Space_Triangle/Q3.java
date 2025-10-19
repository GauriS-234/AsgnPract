package Inverted_Space_Triangle;

import java.util.Scanner;

 class Pattern4 {
    public static void main(String[] args) {
        int rows = 3;
        char ch = 'a';
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");

            if (i == 1) {
                System.out.println("a   1   b");
            } else if (i == 2) {
                System.out.println("1   c");
            } else {
                System.out.println("d");
            }
        }
    }
}
