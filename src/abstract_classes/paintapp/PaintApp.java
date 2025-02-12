package abstract_classes.paintapp;

import java.util.ArrayList;
import java.util.List;

public class PaintApp {


    public static void main(String[] args) {
        Shape square1 = new Square("red", "2.0", 4);

        Shape circle1 = new Circle("green", "3.0", 6);
        Shape circle2 = new Circle("red", "3.0", 3);

        Shape triangle = new Triangle("purple", "2.0", 2, 5, 7);


        List<Shape> shapes = new ArrayList<>();

        shapes.add(square1);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(triangle);

        for (Shape shape : shapes) {
            System.out.println("shape described: "+ shape.toString()+ "area: " + shape.area());
        }


    }
}
