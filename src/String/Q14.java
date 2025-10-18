package String;

public class Q14 {
    public static String ReplaceChar(String str1){
        //char ch = str1.charAt(0);

        return str1.replace('a','e');
    }
    public static void main (String[] args){
        String str1 = "We are Programmers and we are proud of it";
        String output = ReplaceChar(str1);
        System.out.println("Output: "+output);
    }
}
