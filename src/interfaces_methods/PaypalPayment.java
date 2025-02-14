package interfaces_methods;

public class PaypalPayment implements Payment {
    public PaypalPayment(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public void processPayment(double amount) {
        if (Payment.isValid(amount)) {
            System.out.println(String.format("Processed paypal payment for amount %f", amount));
        } else {
            System.out.println("Amount is invalid!");
        }
    }
}
