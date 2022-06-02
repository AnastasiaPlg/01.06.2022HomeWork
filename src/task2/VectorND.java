package task2;

import task1.Vector3D;

import java.util.Arrays;
import java.util.Scanner;

public class VectorND extends Vector {
    final String VECTOR_INFO = "This is vector for N-system.";

    public VectorND(Point point1, Point point2) {
        super(point1, point2);
    }

    public VectorND(Point point) {
        super(point);
    }

    @Override
    public double findLength() {
        Point point = findVectorCoordinates();
        double sum = 0;
        for (int i = 0; i < point.getCoordinates().length; i++) {
            sum = sum + Math.pow(point.getCoordinates()[i], 2);
        }
        double length = Math.sqrt(sum);
        return length;
    }

    @Override
    public Point findVectorCoordinates() {
        double[] vectorCoordinates = new double[getPoint1().getCoordinates().length];
        for (int i = 0; i < vectorCoordinates.length; i++) {
            vectorCoordinates[i] = getPoint2().getCoordinates()[i] - getPoint1().getCoordinates()[i];
        }
        Point point = new Point(vectorCoordinates);
        return point;
    }

    @Override
    public VectorND findVectorSum(VectorND vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        double[] vectorCoordinates = new double[getPoint1().getCoordinates().length];
        for (int i = 0; i < vectorCoordinates.length; i++) {
            vectorCoordinates[i] = point1.getCoordinates()[i] + point2.getCoordinates()[i];
        }
        Point point = new Point(vectorCoordinates);
        VectorND sumVector = new VectorND(point);
        return sumVector;
    }

    @Override
    public VectorND findVectorDifference(VectorND vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        double[] vectorCoordinates = new double[getPoint1().getCoordinates().length];
        for (int i = 0; i < vectorCoordinates.length; i++) {
            vectorCoordinates[i] = point1.getCoordinates()[i] - point2.getCoordinates()[i];
        }
        Point point = new Point(vectorCoordinates);
        VectorND sumVector = new VectorND(point);
        return sumVector;
    }

    @Override
    public double findScalarMulti(VectorND vector) {
        Point point1 = findVectorCoordinates();
        Point point2 = vector.findVectorCoordinates();
        double scalarMulti = 0;
        for (int i = 0; i < point1.getCoordinates().length; i++) {
            scalarMulti = scalarMulti + point1.getCoordinates()[i] * point2.getCoordinates()[i];
        }
        return scalarMulti;
    }

    public static VectorND[] createArrayOfVectors(int n) {
        VectorND[] randomVectorsND = new VectorND[n];
        while (true) {
            int m = 3;
            double[] coordinates = new double[m];
            for (int i = 0; i < coordinates.length; i++) {
                coordinates[i] = 20 * Math.random();
            }
            VectorND vectorND = new VectorND(new Point(coordinates));
            for (int i = 0; i < randomVectorsND.length; i++) {
                if (randomVectorsND[i] == null) {
                    randomVectorsND[i] = vectorND;
                    break;
                }
            }
            int q = 0;
            for (int i = 0; i < randomVectorsND.length; i++) {
                if (randomVectorsND[i] == null) {
                    q++;
                }
            }
            if (q == 0) {
                break;
            }
        }
        return randomVectorsND;
    }

    @Override
    public String toString() {
        if (getPoint() == null) {
            setPoint(findVectorCoordinates());
            setPoint1(null);
            setPoint2(null);
        }
        Point point = getPoint();
        return VECTOR_INFO + " N = " + point.getCoordinates().length + ". Vector coordinates: " + Arrays.toString(point.getCoordinates());
    }
}
