package String_Practice;

import java.util.Scanner;

 class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Character to remove: ");
        char ch = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }

        System.out.println("Output: " + result);
    }
}

