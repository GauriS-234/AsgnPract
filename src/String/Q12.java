//Write a program to take two strings as input from the user and check whether those string objects are equal
//or not . If they are equal print true or false

package String;

import java.util.Scanner;

public class Q12 {
    public static boolean Check(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1 = sc.next();
        System.out.println("Enter the second String: ");
        String str2 = sc.next();
        boolean result = Check(str1, str2);
        System.out.println("Output: "+result);

    }

}
