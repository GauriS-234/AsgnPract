package Array;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0 ;
        for (int i = 0 ; i< arr.length; i++){

            if(arr[i]% 2 !=0){
                sum= sum+arr[i];

            }
        }
        System.out.println("Sum of odd elements: "+sum);
    }
}
