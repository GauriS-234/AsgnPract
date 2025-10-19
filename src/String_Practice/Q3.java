package String_Practice;

import java.util.Scanner;

 class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }

        System.out.println("Output String: " + result.trim());
    }
}

