package abstract_classes.interfaces.flyable;

public class Bird implements Flyable {

    public Bird(String species, int wingSpan) {
        this.species = species;
        this.wingSpan = wingSpan;
    }

    private String species;
    private int wingSpan;

    @Override
    public void takeOff() {
        System.out.println("Bird " + this.species + " takes off");
    }

    @Override
    public void fly() {
        System.out.println("Bird " + this.species + " flies with wingspan: " + this.wingSpan);
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }


    public void eat(){
        System.out.println("bird eats");
    }
}
