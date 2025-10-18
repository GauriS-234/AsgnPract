package String;

import java.util.Scanner;

public class Q18 {
    public static boolean CheckSubstring(String str1 , String str2){
       return str1.toString().contains(str2.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the substring to check: ");
        String str2 = sc.nextLine();
        if(CheckSubstring(str1,str2)){
            System.out.println("The sentence contains the substring "+ str2);
        }else {
            System.out.println("No substring found");
        }
    }
}
