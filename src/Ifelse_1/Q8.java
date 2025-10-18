package Ifelse_1;

import java.util.*;
class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2)
            System.out.println(num1 + " is maximum between " + num1 + "," + num2);
        else
            System.out.println(num2 + " is maximum between " + num1 + "," + num2);
    }
}


