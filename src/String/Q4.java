package String;

import java.util.Scanner;

public class Q4 {
    public static boolean Equality(String str1, String str2){
        return str1.equalsIgnoreCase(str2);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.next();
        System.out.println("Enter the second String: ");
        String str2 = sc.next();
        System.out.println(Equality(str1, str2));


    }
}
