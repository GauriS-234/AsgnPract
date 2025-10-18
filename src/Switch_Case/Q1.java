package Switch_Case;

import java.util.Scanner;
class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.next();

        switch(color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("No such color is present in traffic lights");
        }
        sc.close();
    }
}
