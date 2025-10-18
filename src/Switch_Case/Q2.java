package Switch_Case;

import java.util.Scanner;

 class GradeRemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");
        String grade = sc.next().toUpperCase();

        switch(grade) {
            case "O":
                System.out.println("Outstanding");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid grade");
        }
        sc.close();
    }
}

