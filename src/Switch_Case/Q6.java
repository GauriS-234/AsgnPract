package Switch_Case;

import java.util.Scanner;

 class NumberSpelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-5): ");
        int num = sc.nextInt();

        switch(num) {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            default: System.out.println("The entered number is greater than 5");
        }

        sc.close();
    }
}

