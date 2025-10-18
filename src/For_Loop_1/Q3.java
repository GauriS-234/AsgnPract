package For_Loop_1;

import java.util.Scanner;

 class FirstNThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int count = 0;
        int num = 100;
        while(count < N) {
            System.out.print(num);
            count++;
            if(count != N) System.out.print(", ");
            num++;
        }

        sc.close();
    }
}

