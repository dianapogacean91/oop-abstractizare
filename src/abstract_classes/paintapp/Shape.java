package abstract_classes.paintapp;

public abstract class Shape {

    private String color;
    private String lineWidth;

    public Shape(String color, String lineWidth) {
        this.color = color;
        this.lineWidth = lineWidth;
    }


    public String getColor() {
        return color;
    }

    public String getLineWidth() {
        return lineWidth;
    }

    public abstract double perimeter();

    public abstract double area();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", lineWidth='" + lineWidth + '\'' +
                '}';
    }
}
