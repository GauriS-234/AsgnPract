package String;

import java.util.Scanner;

public class Q16 {
    public static boolean isPalindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        return str.equals(rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
