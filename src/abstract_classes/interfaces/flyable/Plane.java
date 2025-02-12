package abstract_classes.interfaces.flyable;

public class Plane implements Flyable {

    public Plane(String engine, String pilot, int maxAlt) {
        this.engine = engine;
        this.pilot = pilot;
        this.maxAlt = maxAlt;
    }

    private String engine;
    private String pilot;
    private int maxAlt;

    @Override
    public void takeOff() {
        System.out.println("takeoff at speed ....");
    }

    @Override
    public void fly() {
        System.out.println("fly at max alt: " + this.maxAlt);
    }

    @Override
    public void land() {
        System.out.println("pilot " + this.pilot + " lands the aircraft");
    }
}
