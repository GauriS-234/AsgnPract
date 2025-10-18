package Switch_Case;

import java.util.Scanner;

 class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        boolean pass = true;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            if(marks[i] < 35) { // assuming passing marks = 35
                pass = false;
            }
        }

        if(!pass) {
            System.out.println("You failed the exam");
        } else {
            int total = 0;
            for(int mark : marks) total += mark;
            int avg = total / 5;

            switch(avg / 10) {
                case 10:
                case 9:
                    System.out.println("First Class with Distinction");
                    break;
                case 8:
                case 7:
                    System.out.println("First Class");
                    break;
                case 6:
                case 5:
                    System.out.println("Second Class");
                    break;
                default:
                    System.out.println("Pass");
            }
        }

        sc.close();
    }
}

