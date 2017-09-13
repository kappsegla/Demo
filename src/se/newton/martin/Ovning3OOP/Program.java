package se.newton.martin.Ovning3OOP;

public class Program {
    public Shape CreateShape(ShapeType shape){
        if(shape == ShapeType.ELLIPSE)
        {
            return null;
        }
        else if(shape == ShapeType.RECTANGLE)
        {
            return new Rectangle(0,0);
        }
        return null;
    }

    public void ViewShapeInfo(Shape shape){
        System.out.println(shape.toString());
    }

    public void doIt() {
        Shape theShape = CreateShape(ShapeType.RECTANGLE);
        theShape.setLength(10);
        theShape.setWidth(5);
        ViewShapeInfo(theShape);
    }
    public static void main(String[] args){

        new Program().doIt();
    }
}
