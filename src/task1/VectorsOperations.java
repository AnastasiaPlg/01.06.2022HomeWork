package task1;

public interface VectorsOperations {
    public double findLength();

    public Point findVectorCoordinates();

    public Vector findVectorSum(Vector vector);

    public Vector findVectorDifference(Vector vector);

    public double findScalarMulti(Vector vector);

    public static void compareVectors(Vector vector1, Vector vector2) {
        if (vector1.findLength() == vector2.findLength()) {
            System.out.println("Vectors have the same length.");
        } else {
            Vector maxLengthVector = vector1;
            if (vector1.findLength() < vector2.findLength()) {
                maxLengthVector = vector2;
            }
            System.out.print("The largest vector info: " + maxLengthVector.toString());
        }
    }
}
