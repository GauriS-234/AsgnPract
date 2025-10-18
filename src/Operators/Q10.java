package Operators;

import java.util.Scanner;


class ShoppingDiscountCalculator {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = price * quantity;
            System.out.println("\nTotal before discount = ₹" + total);

            boolean isBigPurchase = total > 1000;
            boolean hasOfferCoupon = true;
            if (isBigPurchase && hasOfferCoupon) {
                System.out.println("You are eligible for an extra discount!");
            }

            double discount = (total > 2000) ? 0.20 : (total > 1000 ? 0.10 : 0.05);

            total -= total * discount;
            System.out.println("Discount applied: " + (discount * 100) + "%");

            int rewardPoints = 0;
            rewardPoints += 10;
            rewardPoints++;
            System.out.println("You earned reward points: " + rewardPoints);

            System.out.println("\n----- BILL SUMMARY -----");
            System.out.println("Product: " + product);
            System.out.println("Final Price after discount: ₹" + total);

            if (total >= 5000)
                System.out.println("You also get a free gift!");
            else
                System.out.println("Spend ₹" + (5000 - total) + " more to get a free gift.");

            sc.close();
        }
    }


