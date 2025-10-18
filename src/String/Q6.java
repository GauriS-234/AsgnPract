package String;

import java.util.Scanner;

public class Q6 {
    public static String Reverse(String str){
        String rev ="";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println(Reverse(str));
    }
}
