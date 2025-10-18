package For_Loop_1;

import java.util.Scanner;

 class TableOfNReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = 10; i >= 1; i--) {
            System.out.print(N * i);
            if(i != 1) System.out.print(", ");
        }

        sc.close();
    }
}

