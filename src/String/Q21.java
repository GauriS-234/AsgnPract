package String;

import java.util.StringTokenizer;

public class Q21 {
    public static void main(String [] args){
        String str = "Core2web@biencaps";
        StringTokenizer strToken = new StringTokenizer(str,"");
       while(strToken.hasMoreTokens()){
           System.out.println(strToken.nextToken());
       }

    }
}
