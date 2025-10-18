package Switch_Case;

import java.util.Scanner;

 class MovieSubscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select your plan:");
        System.out.println("1. Platinum");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Bronze");
        System.out.println("5. Free");

        System.out.print("Enter your plan: ");
        String plan = sc.next();

        switch(plan.toLowerCase()) {
            case "platinum":
                System.out.println("For the Platinum plan, the price is 799");
                break;
            case "gold":
                System.out.println("For the Gold plan, the price is 599");
                break;
            case "silver":
                System.out.println("For the Silver plan, the price is 399");
                break;
            case "bronze":
                System.out.println("For the Bronze plan, the price is 199");
                break;
            case "free":
                System.out.println("For less than 199, the platform is free with limited access");
                break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
