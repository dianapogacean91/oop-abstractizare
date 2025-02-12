package abstract_classes.animals;

public class Bulldog extends Dog {

    public Bulldog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }
}
