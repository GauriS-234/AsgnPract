package String_Practice;

import java.util.Scanner;

 class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("The Length of entered String is " + length);
    }
}

