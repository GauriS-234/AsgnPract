package For_Loop_1;

import java.util.Scanner;

 class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = N; i >= 10; i--) {
            System.out.print(i);
            if(i != 10) System.out.print(", ");
        }

        sc.close();
    }
}

