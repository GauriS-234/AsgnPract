package Array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 0 ; i < arr.length ; i++){

            if (i == size-1){
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]+",");
            }
        }
        System.out.println();
    }
}

