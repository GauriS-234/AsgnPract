//Write a java program that takes a comma-seperated list of words as input and uses
// StringTokenizer to extract and print each word after trimming any extra spaces

package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        StringTokenizer st = new StringTokenizer(info,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
