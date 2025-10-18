package Ifelse_2;

class CareerSuggestion {
    public static void main(String[] args) {
        double percentage = 72.5;
        if (percentage > 85.0)
            System.out.println("Medical");
        else if (percentage > 75.0)
            System.out.println("Engineering");
        else if (percentage > 65.0)
            System.out.println("Pharmacy or Bachelor in Science");
        else
            System.out.println("Other career options");
    }
}
