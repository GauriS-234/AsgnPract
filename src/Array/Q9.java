package Array;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i<arr.length; i++){
            if (i % 2 !=0){
                System.out.println(arr[i]+ " is an odd indexed element");
            }
        }
    }
}
