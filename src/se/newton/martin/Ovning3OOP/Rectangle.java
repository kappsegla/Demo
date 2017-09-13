package se.newton.martin.Ovning3OOP;

public class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return getLength() * 2 + getWidth() * 2;
    }
}




