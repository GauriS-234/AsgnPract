package String;

public class Q1 {
    public static int strLength(String str){
        int length =str.length();
        return length;
    }
    public static void main(String[] args){
        String str = "Hello";
        System.out.print("Length: ");
        System.out.println(strLength(str));
    }
}
