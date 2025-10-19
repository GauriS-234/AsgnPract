package Number_System;

import java.util.Scanner;
class CompositeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean composite = false;
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                composite = true;
                break;
            }
        }
        if(composite)
            System.out.println(n + " is a composite number.");
        else
            System.out.println(n + " is not a composite number.");
    }
}

