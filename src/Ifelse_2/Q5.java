package Ifelse_2;

import java.util.*;
class FloatDivisibleBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num % 6 == 0)
            System.out.println(num + " is divisible by 6");
        else
            System.out.println(num + " is not divisible by 6");
    }
}

