package Number_System;

import java.util.Scanner;
class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), temp = n, rev = 0;
        while(temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(n == rev)
            System.out.println(n + " is a palindrome number.");
        else
            System.out.println(n + " is not a palindrome number.");
    }
}

