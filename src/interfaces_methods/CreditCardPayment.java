package interfaces_methods;

public class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public void processPayment(double amount) {
        if (Payment.isValid(amount)) {
            System.out.println(String.format("Processing credit card payment for amount %f", amount));
        } else {
            System.out.println("Invalid amount!");
        }
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Printing receipt for credit card payment");
    }
}
