package Ifelse_2;

import java.util.*;
class VoterAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 0)
            System.out.println("Valid age for voting");
        else
            System.out.println("Invalid age");
    }
}

