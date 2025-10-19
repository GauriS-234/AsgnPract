package Inverted_Space_Triangle;

import java.util.Scanner;

 class Pattern5 {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");
            if (i == 1)
                System.out.println("1   B   3");
            else if (i == 2)
                System.out.println("B   3");
            else
                System.out.println("3");
        }
    }
}
