//Take two input strings str1 and str2 from the user and print 0 if both the strings are equal
//else print the difference between the unequal elements

package String;

import java.util.Scanner;

public class Q11 {
    public static int StringDemo(String str1 , String str2){
        if(str1.equals(str2)){
            return 0;
        }else{
            int minLen = Math.min(str1.length(), str2.length());
            for(int i = 0 ; i < minLen ; i++){
                if(str1.charAt(i)!= str2.charAt(i)){
                    return str1.charAt(i)- str2.charAt(i);
                }
            }
        }
        return str1.length() - str2.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 :  ");
        String str1 = sc.next();
        System.out.println("Enter the String2:  ");
        String str2 = sc.next();
        int result = StringDemo(str1, str2);
        System.out.println("Result: "+result);

    }
}
