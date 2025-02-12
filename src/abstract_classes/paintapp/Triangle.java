package abstract_classes.paintapp;

public class Triangle extends Shape {

    private int lat1;
    private int lat2;
    private int lat3;

    public Triangle(String color, String lineWidth, int lat1, int lat2, int lat3) {
        super(color, lineWidth);
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }

    @Override
    public double perimeter() {
        return this.lat1 + this.lat2 + this.lat3;
    }

    @Override
    public double area() {
        //formula lui Heron
        // radical din (semiP * (semiP-lat1) * (semiP-lat2) * (semiP-lat3)
        double semiP = perimeter() / 2;
        return Math.sqrt(semiP * (semiP - this.lat1) * (semiP - this.lat2) * (semiP - this.lat3));
    }

    @Override
    public String toString() {
        return super.toString() + " Triangle{" +
                "lat1=" + lat1 +
                ", lat2=" + lat2 +
                ", lat3=" + lat3 +
                '}';
    }
}
