package String_Practice;

import java.util.Scanner;

 class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += ch;
            }
        }

        System.out.println("Output: " + result);
    }
}

