package String_Practice;

import java.util.Scanner;

 class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First String: ");
        String s1 = sc.nextLine();
        System.out.print("Second String: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagram");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        boolean anagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("Both strings are anagram strings.");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}

