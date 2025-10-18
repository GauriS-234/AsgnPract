package Array;

import java.util.Scanner;

public class Q16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0 ; i<arr.length ;i++){
                arr[i] = sc.nextInt();
            }
            int product = 1 ;
            for (int i = 0 ; i< arr.length; i++){
                if (i % 2 !=0){
                    product = product * arr[i];
                }
            }
            System.out.println("Product of odd indexed elements: "+ product);
        }
    }


