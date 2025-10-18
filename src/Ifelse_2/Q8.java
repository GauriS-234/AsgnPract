package Ifelse_2;

import java.util.*;
class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percent = sc.nextDouble();
        if (percent >= 85)
            System.out.println("Passed first class with distinction");
        else if (percent >= 70)
            System.out.println("Passed first class");
        else if (percent >= 60)
            System.out.println("Passed second class");
        else if (percent >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}

