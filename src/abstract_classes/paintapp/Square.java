package abstract_classes.paintapp;

public class Square extends Shape {

    private int lat;

    public Square(String color, String lineWidth, int lat) {
        super(color, lineWidth);
        this.lat = lat;
    }

    @Override
    public double perimeter() {
        return 4 * lat;
    }

    @Override
    public double area() {
        return lat * lat;
    }

    @Override
    public String toString() {
        return super.toString() + " Square{ lat=" + this.lat + "}";
    }
}
