// case study 2: case 1
abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public double getAmount() {
        return amount;
    }
    abstract double processPayment();
}

class CreditCard extends Payment {
    public CreditCard(String transactionId, double amount) {
        super(transactionId, amount);
    }
    double processPayment() {
        return getAmount() + (getAmount() * 0.02);
    }
}

class UPI extends Payment {
    private String upiId;
    public UPI(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }
    double processPayment() {
        if (upiId == null || upiId.isEmpty()) {
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmount();
    }
}

public class case2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard("TXN101", 1000);
        Payment p2 = new UPI("TXN102", 1000, "user@upi");
        System.out.println("Transaction: " + p1.getTransactionId());
        System.out.println("Credit Card Payment: " + p1.processPayment());
        System.out.println();
        System.out.println("Transaction: " + p2.getTransactionId());
        System.out.println("UPI Payment: " + p2.processPayment());
    }
}