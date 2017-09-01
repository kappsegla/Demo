package se.newton.martin;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1.clonePoint();
        this.point2 = point2.clonePoint();
    }

    public double length() {
        return point1.distanceTo(point2);
    }
}
