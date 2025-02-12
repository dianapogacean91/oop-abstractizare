package abstract_classes.interfaces.flyable;

import java.util.ArrayList;
import java.util.List;

public class TestFlyable {

    public static void main(String[] args) {

        Flyable bird = new Bird("randunica", 12);
        Flyable plane = new Plane("boeing 370", "bob", 12000);

        List<Flyable> flyableList = new ArrayList<>();

        flyableList.add(bird);
        flyableList.add(plane);

        for (Flyable flyable : flyableList) {
            flyable.takeOff();
            flyable.fly();
            flyable.land();
        }
    }
}
