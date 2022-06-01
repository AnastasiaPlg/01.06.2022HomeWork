package task1;

public abstract class Vector extends Coordinates implements VectorsOperations {
    private Point point;
    private Point point1;
    private Point point2;

    public Vector(Point point) {
        this.point = point;
    }

    public Vector(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

}
