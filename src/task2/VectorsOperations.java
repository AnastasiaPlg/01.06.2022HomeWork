package task2;

import task1.Vector;

public interface VectorsOperations {
    public double findLength();

    public Point findVectorCoordinates();

    public VectorND findVectorSum(VectorND vector);

    public VectorND findVectorDifference(VectorND vector);

    public double findScalarMulti(VectorND vector);

    public static void compareVectors(VectorND vector1, VectorND vector2) {
        if (vector1.findLength() == vector2.findLength()) {
            System.out.println("Vectors have the same length.");
        } else {
            VectorND maxLengthVector = vector1;
            if (vector1.findLength() < vector2.findLength()) {
                maxLengthVector = vector2;
            }
            System.out.print("The largest vector info: " + maxLengthVector.toString());
        }
    }
}
