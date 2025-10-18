package Inheritance;

class Invoice {
    int invoiceId;
    String customerName;
    double totalAmount;

    // Constructor
    public Invoice(int invoiceId, String customerName, double totalAmount) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Method to apply GST
    public void applyGST(double gstRate) {
        double finalAmount = totalAmount + (totalAmount * gstRate / 100);
        System.out.println("Final Bill for " + customerName + ": " + finalAmount);
    }
}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice(101, "Gauri", 5000);
        inv.applyGST(18); // 18% GST
    }
}

