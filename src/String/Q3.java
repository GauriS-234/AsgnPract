package String;

import java.util.Scanner;

public class Q3 {
    public static char FindChar(String str, int index){
        char result = str.charAt(index);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        char result =  FindChar(str, index);
        System.out.println(result);
    }
}
