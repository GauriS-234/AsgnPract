package Number_System;

import java.util.Scanner;
class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            int d = n % 10;
            System.out.print(d + (n > 9 ? ", " : ""));
            n /= 10;
        }
    }
}

