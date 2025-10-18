package Operators;

import java.util.Scanner;

public class Q3 {
    public static void logical(boolean  num1 , boolean num2){
        boolean AND = num1 && num2;
        boolean OR = num1 || num2;
        boolean NOT1 = !num1;
        boolean NOT2 = !num2;

        System.out.println("Logical AND:"+num1+ "&&"+ num2 +"= "+ AND);
        System.out.println("Logical OR:"+num1+ "||"+ num2 +"= "+ OR);
        System.out.println("Logical NOT for the first value:"+"!"+num1+"= "+ NOT1);
        System.out.println("Logical NOT for the second value:"+"!"+num2+"= "+ NOT2);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("first boolean value(true/false): ");
        boolean num1 = sc.nextBoolean();
        System.out.println("Second boolean value(true/false): ");
        boolean num2 = sc.nextBoolean();

        logical(num1, num2);
    }
}
