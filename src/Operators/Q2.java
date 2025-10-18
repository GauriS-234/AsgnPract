package Operators;

public class Q2 {
    public static void relational(int num1 , int num2){
        boolean a = num1 > num2;
        boolean b = num1 < num2;
        boolean c = num1 == num2;
        boolean d = num1 != num2;
        boolean e = num1 >= num2;
        boolean f = num1 <= num2;
        System.out.println(num1 + ">"+ num2 +": "+a);
        System.out.println(num1 + "<"+ num2 +": "+b);
        System.out.println(num1 + "=="+ num2 +": "+c);
        System.out.println(num1 + "!="+ num2 +": "+d);
        System.out.println(num1 + ">="+ num2 +": "+e);
        System.out.println(num1 + "<="+ num2 +": "+f);


    }
    public static void main(String[] args){
        int num1 = 7;
        int num2 = 5;
        relational(num1 , num2);
    }
}
