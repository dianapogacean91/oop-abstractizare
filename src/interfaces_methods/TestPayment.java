package interfaces_methods;

public class TestPayment {

    public static void main(String[] args) {

        CreditCardPayment ccp = new CreditCardPayment("12312312312323333");

        //upcasting
        Payment creditCardPayment = new CreditCardPayment("12312312312323333");

        Payment payPalPayment = new PaypalPayment("diana@email.com");


        creditCardPayment.processPayment(40.0);
        creditCardPayment.printReceipt(30);
        System.out.println();
        payPalPayment.printReceipt(80.0);
        payPalPayment.processPayment(90.0);

    }
}
