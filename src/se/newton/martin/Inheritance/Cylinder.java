package se.newton.martin.Inheritance;

import java.util.Currency;

public class Cylinder extends Circle {
    public float height;

    public Cylinder() {
        System.out.println("Cylinder Constructor running");
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        return circumference() * height + super.getArea() * 2;
    }
}
