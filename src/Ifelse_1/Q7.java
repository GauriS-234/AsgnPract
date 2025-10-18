package Ifelse_1;

import java.util.*;
class DivisibleBy2_5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 5 == 0 && num % 10 == 0)
            System.out.println(num + " is divisible by 2,5 and 10");
        else
            System.out.println("Is Not Divisible By 2,5 and 10");
    }
}

