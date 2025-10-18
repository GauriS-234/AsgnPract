package For_Loop_1;

import java.util.Scanner;

 class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.print(N * i);
            if(i != 10) System.out.print(", ");
        }

        sc.close();
    }
}

