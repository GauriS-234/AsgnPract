package Switch_Case;

import java.util.Scanner;

 class TrafficAlerts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Traffic Alerts Menu:");
        System.out.println("1. Accident");
        System.out.println("2. Roadblock");
        System.out.println("3. Heavy Traffic");
        System.out.println("4. Diversion");
        System.out.println("5. Clear");

        System.out.print("Enter alert number: ");
        int alert = sc.nextInt();

        switch(alert) {
            case 1:
                System.out.println("Alert: Accident ahead, drive carefully!");
                break;
            case 2:
                System.out.println("Alert: Roadblock, take alternative route!");
                break;
            case 3:
                System.out.println("Alert: Heavy traffic, expect delays!");
                break;
            case 4:
                System.out.println("Alert: Diversion in place, follow signs!");
                break;
            case 5:
                System.out.println("Alert: Roads are clear, safe journey!");
                break;
            default:
                System.out.println("Invalid input, please select 1-5");
        }

        sc.close();
    }
}
