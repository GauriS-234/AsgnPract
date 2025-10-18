package Datatypes;

class C2W_LongDemo {
    public static void main(String[] args) {
//        long num1 = 123456789101123;
        long num1 = 123456789101123L;
        System.out.println(num1);
    }
}
//This will give output as integer number too large


 class C2W_LongDemo1 {
    public static void main(String[] args) {
        long num1 ;
        int num2 = 200005;
        num1 = num2;
        System.out.println(num1);
    }
}
//This will give output as 200005 because int can be converted into long


 class C2W_LongDemo2 {
    public static void main(String[] args) {
        long num1 = 2000005;
//        int num2 = num1;
        long num2 = num1;
        System.out.println(num1);
    }
}
//This code will give output as Incompatible type: possible lossy conversion from long to int


 class C2W_LongDemo3 {
    public static void main(String[] args) {
        long num1 = 2000005;
//        int num2 = num1L;
        long num2 = num1;
        System.out.println(num1);
    }
}
//This code will give compile time error as cannot find symbol