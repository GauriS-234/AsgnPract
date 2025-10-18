package Array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of characters: ");
        int num = sc.nextInt();
        char arr[] = new char[num];
        for (char i = 0 ; i < arr.length ; i++){
            arr[i] = sc.next().charAt(0);
        }
        for (char i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
