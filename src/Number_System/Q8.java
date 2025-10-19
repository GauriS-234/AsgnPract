package Number_System;

import java.util.Scanner;
class EvenOddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            int d = (int)(n % 10);
            if(d % 2 == 0)
                sb.insert(0, d + ", ");
            else
                sb.insert(0, (d * d) + ", ");
            n /= 10;
        }
        System.out.println(sb.toString().trim());
    }
}

