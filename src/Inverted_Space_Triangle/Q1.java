package Inverted_Space_Triangle;

class Pattern6 {
    public static void main(String[] args) {
        int rows = 3;
        char ch = 'a';
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");
            for (int j = i; j <= rows; j++) {
                System.out.print(ch + "   ");
                ch++;
            }
            System.out.println();
        }
    }
}
