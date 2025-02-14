package company;

public class Person {
    private String cnp;
    private String name;

    public Person(String cnp, String name) {
        this.cnp = cnp;
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public String getName() {
        return name;
    }
}
