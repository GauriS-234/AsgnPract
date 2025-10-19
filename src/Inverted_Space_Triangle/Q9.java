package Inverted_Space_Triangle;

 class Pattern8 {
    public static void main(String[] args) {
        int rows = 3;
        int num = 3;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("    ");
            for (int j = i; j <= rows; j++) {
                System.out.print((num * j) + "   ");
            }
            num--;
            System.out.println();
        }
    }
}

