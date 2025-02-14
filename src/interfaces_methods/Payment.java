package interfaces_methods;

public interface Payment {

    static boolean isValid(double amount) {
        return amount > 0;
    }

    //abstract method
    void processPayment(double amount);

    //default method in interface - method with implementation - non-abstract
    default void printReceipt(double amount) {
        System.out.println(String.format("Printing receipt for amount %f", amount));
        logTransaction(amount);
    }

    private void logTransaction(double amount) {
        System.out.println(String.format("Logging transaction for amount: %f", amount));
    }
}
