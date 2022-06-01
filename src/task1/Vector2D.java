package task1;

public class Vector2D extends Vector {
    final String VECTOR_INFO = "This is vector for 2d-system.";

    public Vector2D(Point point1, Point point2) {
        super(point1, point2);
    }

    public Vector2D(Point point) {
        super(point);
    }

    @Override
    public Point findVectorCoordinates() {
        double x = this.getPoint2().getX() - this.getPoint1().getX();
        double y = this.getPoint2().getY() - this.getPoint1().getY();
        Point point = new Point(x, y);
        return point;
    }

    @Override
    public double findLength() {
        Point point = findVectorCoordinates();
        double length = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
        return length;
    }

    @Override
    public String toString() {
        if (getPoint() == null) {
            setPoint(findVectorCoordinates());
            setPoint1(null);
            setPoint2(null);
        }
        Point point = getPoint();
        return VECTOR_INFO + String.format(" Vector coordinates: (%.2f, %.2f)", point.getX(), point.getY());
    }

    @Override
    public Vector2D findVectorSum(Vector vector) {
        Point point1 = this.findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        Point point = new Point(point1.getX() + point2.getX(), point1.getY() + point2.getY());
        Vector2D sumVector = new Vector2D(point);
        return sumVector;
    }

    @Override
    public Vector2D findVectorDifference(Vector vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        Point point = new Point(point1.getX() - point2.getX(), point1.getY() - point2.getY());
        Vector2D diffVector = new Vector2D(point);
        return diffVector;
    }

    @Override
    public double findScalarMulti(Vector vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        double scalarMulti = point1.getX() * point2.getX() + point1.getY() * point2.getY();
        return scalarMulti;
    }

    public static Vector[] createArrayOfVectors(int n) {
        Vector[] randomVectors2D = new Vector[n];
        while (true) {
            double x1 = 20 * Math.random();
            double y1 = 20 * Math.random();
            double x2 = 20 * Math.random();
            double y2 = 20 * Math.random();
            Vector vector2D = new Vector2D(new Point(x1, y1), new Point(x2, y2));
            for (int i = 0; i < randomVectors2D.length; i++) {
                if (randomVectors2D[i] == null) {
                    randomVectors2D[i] = vector2D;
                    break;
                }
            }
            int q = 0;
            for (int i = 0; i < randomVectors2D.length; i++) {
                if (randomVectors2D[i] == null) {
                    q++;
                }
            }
            if (q == 0) {
                break;
            }
        }
        return randomVectors2D;
    }
}
