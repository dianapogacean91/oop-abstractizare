package abstract_classes.paintapp;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, String lineWidth, int radius) {
        super(color, lineWidth);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Circle{" +
                "radius=" + radius +
                '}';
    }
}
