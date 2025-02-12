package abstract_classes.animals;

public class Beagle extends Dog{


    public Beagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("boooowl");
    }
}
