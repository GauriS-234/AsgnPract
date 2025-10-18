package Array;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ;i < arr.length; i++){
            if (arr[i] % 4 ==0){
                System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
            }
        }
    }
}
