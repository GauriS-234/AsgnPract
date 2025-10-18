package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String []args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter number of people present in the queue:");
        int size = Integer.parseInt(br.readLine());
        String[] voterName = new String[size];
        System.out.println("Enter Voter Name: ");
        for (int i = 0 ; i < size ; i++){
            voterName[i] = br.readLine();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Voter names:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0 ; i<size ; i++){
            System.out.println(voterName[i]);
        }
    }
}
