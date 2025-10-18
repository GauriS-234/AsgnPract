package Ifelse_2;

import java.util.*;
class PythagorasTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            System.out.println("The numbers are Pythagoras triplets");
        else
            System.out.println("The numbers are not Pythagoras triplets");
    }
}
