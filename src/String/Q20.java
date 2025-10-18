package String;

import java.util.Scanner;

public class Q20 {
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");   // split the string into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuffer sb = new StringBuffer(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        return result.toString().trim();   // remove trailing space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be reversed word by word: ");
        String str1 = sc.nextLine();
        System.out.println(reverseEachWord(str1));
    }
}
