package Array;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of employees: ");
        int count_of_employee = sc.nextInt();
        int [] arr_of_age = new int[count_of_employee];
        for (int i = 0 ; i < arr_of_age.length ; i++){
            arr_of_age[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr_of_age.length ; i++){
            System.out.println(arr_of_age[i]);
        }
    }
}
