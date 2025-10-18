package Array;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements divisible by 3: ");
        int sum = 0;
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i] % 3==0){
                System.out.println(arr[i]);
                sum = sum +arr[i];
            }
        }
        System.out.println("Sum pf elements divisible by 3 is: "+sum);
    }
}
