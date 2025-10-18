package Array;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        boolean flag = false;
        int index = -1;
        for (int i = 0 ; i < arr.length;i++){
            if (num == arr[i]){
                flag = true;
                index = i;
                break;
            }
        }
        if (flag = false){
            System.out.println("Not present");
        }else {
            System.out.println(num +" found at index "+index);
        }
    }
}
