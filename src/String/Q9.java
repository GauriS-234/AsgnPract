package String;

import java.util.Scanner;

public class Q9 {
    public static int Index(String str){
        return str.indexOf('a');
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Index of First occurence of a: ");
        int result = Index(str);
        System.out.println(result);
    }
}
