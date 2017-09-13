package se.newton.martin.ovning3.shapes;

public abstract class Shape {
    private double length;
    private double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Längd  : " + getLength() + "\n" +
        "Bredd  : " + getWidth() + "\n" +
        "Omkrets: " + getPerimeter() + "\n"+
        "Area   : " + getArea();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
