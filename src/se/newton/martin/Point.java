package se.newton.martin;

public class Point {
    private int x;
    private int y;

    public Point() {
        setX(0);
        setY(0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    //Copy Constructor
    public Point(Point point) {
        copyData(point, this);
//        this.x = point.x;
//        this.y = point.y;
    }

    public Point(int[] coords){
        this.setX(coords[0]);
        this.setY(coords[1]);
    }

    public double distanceTo(Point point) {
        int a = point.getX() - this.getX();
        int b = point.getY() - this.getY();
        return Math.sqrt(a * a + b * b);
    }

    public Point clonePoint() {
        return new Point(this);
    }

    @Deprecated
    public void copyTo(Point point) {
        copyData(this, point);
//        point.x = this.x;
//        point.y = this.y;
    }

    private void copyData(Point from, Point to)
    {
        to.setX(from.getX());
        to.setY(from.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}














