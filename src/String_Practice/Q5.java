package String_Practice;

import java.util.Scanner;

 class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                char first = (char)(word.charAt(0) - 32); // ASCII conversion
                result += first + word.substring(1) + " ";
            }
        }

        System.out.println("Output: " + result.trim());
    }
}

