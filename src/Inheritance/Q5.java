package Inheritance;

class Account {
    int accountNumber;
    String holderName;

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double interestRate) {
        super(accountNumber, holderName);
        this.interestRate = interestRate;
    }

    public void calculateInterest(double balance) {
        double interest = balance * interestRate / 100;
        System.out.println("Interest for " + holderName + ": " + interest);
    }
}

class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "Gauri", 5);
        sa.calculateInterest(10000);
    }
}
