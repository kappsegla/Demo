package se.newton.martin.Inheritance;

public class Circle {
    public float radius;

    public Circle(){
        System.out.println("Circle Constructor running");
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double circumference() {
        return radius * 2 * Math.PI;
    }


}
