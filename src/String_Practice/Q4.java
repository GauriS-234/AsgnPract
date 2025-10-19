package String_Practice;

import java.util.Scanner;

 class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings to concat: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String result = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + ": ");
            String s = sc.nextLine();
            result += s;
        }

        System.out.println("Output: " + result);
    }
}

