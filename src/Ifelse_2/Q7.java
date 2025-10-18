package Ifelse_2;

import java.util.*;
class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sellingPrice = sc.nextDouble();
        double costPrice = sc.nextDouble();
        if (sellingPrice > costPrice)
            System.out.println("Profit of " + (sellingPrice - costPrice));
        else if (costPrice > sellingPrice)
            System.out.println("Loss of " + (costPrice - sellingPrice));
        else
            System.out.println("No profit no loss");
    }
}

