package task1;

public class Vector3D extends Vector {
    final String VECTOR_INFO = "This is vector for 3d-system.";

    public Vector3D(Point point1, Point point2) {
        super(point1, point2);
    }

    public Vector3D(Point point) {
        super(point);
    }

    @Override
    public Point findVectorCoordinates() {
        double x = getPoint2().getX() - getPoint1().getX();
        double y = getPoint2().getY() - getPoint1().getY();
        double z = getPoint2().getZ() - getPoint1().getZ();
        Point point = new Point(x, y, z);
        return point;
    }

    @Override
    public String toString() {
        if (getPoint() == null) {
            setPoint(findVectorCoordinates());
            setPoint1(null);
            setPoint2(null);
        }
        Point point = getPoint();
        return VECTOR_INFO + String.format(" Vector coordinates: (%.2f, %.2f, %.2f)", point.getX(), point.getY(), point.getZ());
    }

    @Override
    public double findLength() {
        Point point = findVectorCoordinates();
        double length = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2) + Math.pow(point.getZ(), 2));
        return length;
    }

    @Override
    public Vector3D findVectorSum(Vector vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        Point point = new Point(point1.getX() + point2.getX(), point1.getY() + point2.getY(), point1.getZ() + point2.getZ());
        Vector3D sumVector = new Vector3D(point);
        return sumVector;
    }

    @Override
    public Vector3D findVectorDifference(Vector vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        Point point = new Point(point1.getX() - point2.getX(), point1.getY() - point2.getY(), point1.getZ() - point2.getZ());
        Vector3D diffVector = new Vector3D(point);
        return diffVector;
    }

    @Override
    public double findScalarMulti(Vector vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        double scalarMulti = point1.getX() * point2.getX() + point1.getY() * point2.getY() + point1.getZ() * point2.getZ();
        return scalarMulti;
    }

    public static Vector[] createArrayOfVectors(int n) {
        Vector[] randomVectors3D = new Vector[n];
        while (true) {
            double x1 = 20 * Math.random();
            double y1 = 20 * Math.random();
            double z1 = 20 * Math.random();
            double x2 = 20 * Math.random();
            double y2 = 20 * Math.random();
            double z2 = 20 * Math.random();
            Vector vector3D = new Vector3D(new Point(x1, y1, z1), new Point(x2, y2, z2));
            for (int i = 0; i < randomVectors3D.length; i++) {
                if (randomVectors3D[i] == null) {
                    randomVectors3D[i] = vector3D;
                    break;
                }
            }
            int q = 0;
            for (int i = 0; i < randomVectors3D.length; i++) {
                if (randomVectors3D[i] == null) {
                    q++;
                }
            }
            if (q == 0) {
                break;
            }
        }
        return randomVectors3D;
    }
}
