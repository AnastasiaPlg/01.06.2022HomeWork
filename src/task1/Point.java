package task1;

public class Point extends Coordinates {
    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public Point(double x, double y, double z) {
        this(x, y);
        this.setZ(z);
    }
}
