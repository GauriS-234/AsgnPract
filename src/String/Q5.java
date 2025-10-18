package String;

import java.util.Scanner;

public class Q5 {
    public static void GetCharacter(String str){
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        GetCharacter(str);
    }
}
