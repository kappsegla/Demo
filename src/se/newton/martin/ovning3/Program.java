package se.newton.martin.ovning3;


import se.newton.martin.ovning3.comparators.OrderShapesByPerimeterComparator;
import se.newton.martin.ovning3.shapes.Rectangle;
import se.newton.martin.ovning3.shapes.ResizeableRectangle;
import se.newton.martin.ovning3.shapes.Shape;
import se.newton.martin.ovning3.shapes.ShapeType;

import java.util.ArrayList;

public class Program {
    public Shape CreateShape(ShapeType shape) {
        if (shape == ShapeType.ELLIPSE) {
            return null;
        } else if (shape == ShapeType.RECTANGLE) {
            return new Rectangle(0, 0);
        } else if (shape == ShapeType.RESIZABLERECTANGLE) {
            return new ResizeableRectangle(0, 0);
        }
        return null;
    }

    public void ViewShapeInfo(Shape shape) {
        System.out.println(shape.toString());
    }

    public void doIt() {

        ArrayList<Shape> listOfShapes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Shape theShape = CreateShape(ShapeType.RECTANGLE);
            theShape.setLength(i * Math.random());
            theShape.setWidth(i * Math.random());
            listOfShapes.add(theShape);
            ViewShapeInfo(theShape);
        }

        System.out.println("---------");

        // listOfShapes.sort(new OrderShapesByAreaComparator());
        // listOfShapes.sort(new OrderShapesByPerimeterComparator());
        listOfShapes.sort((o1, o2) -> {
            if (o1.getArea() < o2.getArea())
                return -1;
            if (o1.getArea() > o2.getArea())
                return 1;
            return 0;
        });

        for (Shape shape : listOfShapes) {
            ViewShapeInfo(shape);
        }

//        ViewShapeInfo(theShape);

//        ResizeableRectangle theShapeShifter = (ResizeableRectangle) CreateShape(ShapeType.RESIZABLERECTANGLE);
//        theShapeShifter.setWidth(10);
//        theShapeShifter.setLength(5);
//        ViewShapeInfo(theShapeShifter);
//        theShapeShifter.resize(50);
//        ViewShapeInfo(theShapeShifter);

//        listOfShapes.add(theShape);
//        listOfShapes.add(theShapeShifter);

//        ViewShapeInfo(listOfShapes.get(1));
//
//        if( listOfShapes.get(1) instanceof  IResizable) {
//            IResizable r = (IResizable) listOfShapes.get(1);
//            r.resize(50);
//
//            ViewShapeInfo(listOfShapes.get(1));
//        }


    }

    public static void main(String[] args) {

        new Program().doIt();
    }
}
