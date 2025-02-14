package company;

public class Contractor extends Person implements Payable{

    //TODO - play with this example
    //TODO - create a list with persons, list of payable persons etc
    private String pfaId;


    public Contractor(String cnp, String name, String pfaId) {
        super(cnp, name);
        this.pfaId = pfaId;
    }

    @Override
    public void getPaid(double amount) {
        System.out.println(String.format("Transfering money to contractor with pfa id %s %f", this.pfaId, amount));
    }
}
