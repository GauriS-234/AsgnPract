package Ifelse_1;

class CharCase {
    public static void main(String[] args) {
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an UPPERCASE character");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase character");
        else
            System.out.println(ch + " is not an alphabet");
    }
}


