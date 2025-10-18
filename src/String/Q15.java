package String;

import java.util.Scanner;

public class Q15 {
    public static String[] Split(String str){
        return str.split(" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String str = sc.nextLine();
        String [] words = Split(str);
        for(String word : words){
            System.out.println(word);
        }

    }
}
