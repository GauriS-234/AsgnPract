package For_Loop_1;

import java.util.Scanner;

 class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i += 2) {
            System.out.print(i);
            if(i + 2 <= N) System.out.print(", ");
        }

        sc.close();
    }
}

