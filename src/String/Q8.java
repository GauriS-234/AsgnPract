package String;

import java.util.Scanner;

public class Q8 {
    public static boolean Hello(String str){
        return str.toLowerCase().contains("hello");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        boolean containsHello = Hello(str);

        if(containsHello){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
