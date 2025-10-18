package For_Loop_1;

import java.util.Scanner;



 class FirstNWhole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = 0; i <= N; i++) {
            System.out.print(i);
            if(i != N) System.out.print(", ");
        }

        sc.close();
    }
}


