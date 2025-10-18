package String;

public class Q2 {
    public static String toUpper(String str) {
        return str.toUpperCase();
    }
    public static String toLower(String str){
        return str.toLowerCase();
    }
    public static void main(String[] args){
        String str = "Java";
        String upperStr = toUpper(str);
        String lowerStr = toLower(str);
        System.out.println(upperStr + " "+ lowerStr);
    }
}
