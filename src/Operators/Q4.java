package Operators;

public class Q4 {
    public static void logical(int num1 , int num2){
        int AND = num1 & num2;
        int OR = num1 | num2;
        int XOR = num1 ^ num2;
        int Lefts = num1 << AND;
        int Rights = num1 >> AND;

        System.out.println("Bitwise AND: "+num1 + "&"+ num2+"="+ AND);
        System.out.println("Bitwise OR: "+num1 + "|"+ num2+"="+ OR);
        System.out.println("Bitwise XOR: "+num1 + "^"+ num2+"="+ XOR);
        System.out.println("Left Shift: "+num1 + "<<"+ AND+"="+ Lefts);
        System.out.println("Right Shift: "+num1 + ">>"+ AND+"="+ Rights);


    }
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 3;
        logical(num1 , num2);
    }
}
