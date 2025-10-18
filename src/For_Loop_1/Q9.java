package For_Loop_1;
import java.util.Scanner;

 class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}

