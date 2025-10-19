package Number_System;

import java.util.Scanner;
class SumEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        while(n > 0) {
            int d = (int)(n % 10);
            if(d % 2 == 0)
                sum += d;
            n /= 10;
        }
        System.out.println("The sum of even numbers is " + sum);
    }
}

