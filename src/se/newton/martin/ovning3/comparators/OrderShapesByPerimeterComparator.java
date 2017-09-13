package se.newton.martin.ovning3.comparators;

import se.newton.martin.ovning3.shapes.Shape;

import java.util.Comparator;

public class OrderShapesByPerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getPerimeter() < o2.getPerimeter())
            return -1;
        if(o1.getPerimeter() > o2.getPerimeter())
            return 1;
        return 0;
    }
}
