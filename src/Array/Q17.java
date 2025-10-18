package Array;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        if (size % 2==0){
                for (int j = 0 ; j < arr.length ; j++){
                    System.out.println(arr[j++]);
                }

            }else {
                for (int i = 0 ; i < size ; i++){
                    System.out.println(arr[i]);
                }

            }
        }
    }

