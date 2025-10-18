package String;

import java.util.Scanner;

public class Q10 {
    public static String Concate(String str1 , String str2){
        String str3 ="";
        str3 = str1.concat(str2);
        return str3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("String 1 : ");
        String str1 = sc.next();
        System.out.println("String 2 : ");
        String str2 = sc.next();
        String str3 = Concate(str1, str2);
        System.out.println("Concated String: "+str3);
        int length = str3.length();
        System.out.println("Length of Conacated String: "+length);

    }
}
