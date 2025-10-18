package Operators;

class Q1 {
    public static void op(int num1 , int num2){
        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        System.out.println("Addition: "+num1 +"+"+ num2 +"="+ add);
        System.out.println("Subtraction: "+num1 +"-"+ num2 +"="+ sub);
        System.out.println("Multiplication: "+num1 +"*"+ num2 +"="+mult);
        System.out.println("Division: "+num1 +"/"+ num2 +"="+div);
    }
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        op(num1 , num2);

    }
}
