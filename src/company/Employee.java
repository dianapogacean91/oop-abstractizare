package company;

public class Employee extends Person implements Payable {

    private String employeeId;

    public Employee(String cnp, String name, String employeeId) {
        super(cnp, name);
        this.employeeId = employeeId;
    }

    @Override
    public void getPaid(double amount) {
        System.out.println(String.format("Transfering money to employee %f", amount));
    }
}
