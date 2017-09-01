package se.newton.martin;

public class PointsManager {
    public static void main(String[] args){

        final Point point1 = new Point(3,4);

        Point point2 = new Point(0,0);

        point1 = point2;

        //Copy constructor
        Point point3 = new Point(point1);

        Point point4 = point1.clonePoint(); //Returns a new copy of point1

        Point point5 = new Point();
        point4.copyTo(point5);  //Copy point4 into point5 object

        Line line = new Line(point1, point2);

        System.out.println("Line length: " + line.length());

        point1.setX(2);

        System.out.println("Line length: " + line.length());


        /*
        System.out.println( point1.distanceTo(point4) );
        System.out.println( point1.distanceTo(point5) );

        System.out.println( point1.distanceTo(point3) );

        System.out.println( point1.distanceTo(point2) );
        */
    }
}
