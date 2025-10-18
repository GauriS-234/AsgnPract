package String;

public class Q13 {
    public static String remove(String str1){
        return str1.trim();
    }
    public static void main(String[] args){
        String str1 = "     Hello,World!   ";
        String output = remove(str1);
        System.out.println("Output:"+output);
    }
}
