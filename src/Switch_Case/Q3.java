package Switch_Case;

import java.util.Scanner;

 class ClothSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size acronym: ");
        String size = sc.next().toUpperCase();

        switch(size) {
            case "S":
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L":
                System.out.println("Large");
                break;
            case "XL":
                System.out.println("Extra Large");
                break;
            case "XXL":
                System.out.println("Double Extra Large");
                break;
            default:
                System.out.println("Invalid size");
        }
        sc.close();
    }
}
