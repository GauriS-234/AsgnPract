package String;

import java.util.Arrays;
import java.util.Scanner;

public class Q19 {
    public static boolean isAnagram(String str1, String str2){
       str1 = str1.replaceAll("\\s","").toLowerCase();
       str2 = str2.replaceAll("\\s","").toLowerCase();
       if(str1.length() != str2.length()){
           return false;
       }
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = sc.next();
        System.out.println("Enter the String2: ");
        String str2 = sc.next();
        if(isAnagram(str1, str2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
