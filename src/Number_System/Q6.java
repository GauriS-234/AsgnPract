package Number_System;

import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
