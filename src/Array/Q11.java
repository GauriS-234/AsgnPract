package Array;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        System.out.println("even numbers ");
        for (int i = 0 ; i < arr.length; i++){

            if (arr[i] %2 ==0){

                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Count of even elements is : "+count);
    }
}
