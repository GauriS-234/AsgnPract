package Ifelse_2;

import java.util.*;

class CafeteriaBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java Cafeteria!");
        System.out.print("Enter number of meals you want to buy: ");
        int meals = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= meals; i++) {
            System.out.print("Enter price of meal " + i + ": ");
            double price = sc.nextDouble();
            total += price;
        }

        System.out.println("Total bill before discount: " + total);

        if (total >= 500) {
            double discount = total * 0.1;
            total -= discount;
            System.out.println("You got a 10% discount of " + discount);
        }

        System.out.println("Final bill amount: " + total);
        System.out.println("Thank you for visiting Java Cafeteria!");
    }
}
