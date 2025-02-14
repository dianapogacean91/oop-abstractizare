package company;

public class Intern extends Person{

    private int internshipDuration;

    public Intern(String cnp, String name, int internshipDuration) {
        super(cnp, name);
        this.internshipDuration = internshipDuration;
    }
}
