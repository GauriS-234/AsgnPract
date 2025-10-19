package String_Practice;

import java.util.Scanner;

 class SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Shashi", "Ashish", "Kanha", "Rahul", "Badhe"};
        System.out.print("Enter String to Search: ");
        String search = sc.nextLine();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("String found at index : " + index);
        } else {
            System.out.println("String not found");
        }
    }
}

