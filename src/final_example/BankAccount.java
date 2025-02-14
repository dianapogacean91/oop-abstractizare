package final_example;

public class BankAccount {

    //constanta
    public static final String BANK_NAME = "Ing";

    private final String accountNumber;

    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(final double amount){
        balance+=amount;
    }


}
