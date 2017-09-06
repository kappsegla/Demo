package se.newton.martin.Inheritance;

public class Cone extends Circle{
    public float height;

    @Override
    public double getArea() {
        return super.getArea() + Math.PI * radius * Math.sqrt(radius * radius + height*height);
    }

    public double getVolume(){
        return (super.getArea() * height) / 3;
    }
}
