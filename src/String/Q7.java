package String;

import java.util.Scanner;

public class Q7 {
    public static int Vowel(String str){
        int countVowel = 0;
        String lowerstr = str.toLowerCase();
        for(int i =0; i <str.length(); i++){
            char ch = lowerstr.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u'){
                countVowel++;
            }
        }
        return countVowel;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Count of Vowels is: "+Vowel(str));

    }
}
