package For_Loop_1;

import java.util.Scanner;

 class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= N; i += 2) {
            count++;
        }

        System.out.println("Count of odd numbers: " + count);

        sc.close();
    }
}
