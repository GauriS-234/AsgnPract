package Operators;

import java.util.Scanner;

public class Q5 {
    public static void assignment(int a, int b){
        a+=3;
        System.out.println("After a+=3,a = "+a);
        b-=2;
        System.out.println("After b-=2,b = "+b);
        a*=2;
        System.out.println("After  a*=2,a = "+a);
        b/=3;
        System.out.println("After b/=3,b = "+b);
        a%=5;
        System.out.println("After a%=5,a = "+a);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial value of a: ");
        int a = sc.nextInt();
        System.out.println("Initial value of b: ");
        int b = sc.nextInt();
        assignment(a , b);

    }
}
