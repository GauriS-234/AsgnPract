package Ifelse_1;

import java.util.*;
class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0)
            System.out.println(num + " is a positive number.");
        else if (num < 0)
            System.out.println(num + " is a negative number.");
        else
            System.out.println(num + " is zero.");
    }
}

