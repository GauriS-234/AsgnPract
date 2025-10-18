package Ifelse_2;

import java.util.*;
class NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 1000)
            System.out.println(num + " is in the range 1 to 1000.");
        else
            System.out.println(num + " is not in the range 1 to 1000.");
    }
}
