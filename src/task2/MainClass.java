package task2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        VectorND vectorND1 = new VectorND(new Point(new double[]{1, 1}), new Point(new double[]{3, 5}));
        VectorND vectorND2 = new VectorND(new Point(new double[]{3, 6}), new Point(new double[]{7, 1}));
        vectorND1.findVectorCoordinates();
        System.out.println(vectorND1.findLength());
        System.out.println(vectorND1.findVectorSum(vectorND2).toString());
        System.out.println(vectorND1.findVectorDifference(vectorND2).toString());
        System.out.println(vectorND1.findScalarMulti(vectorND2));
        System.out.println(Arrays.toString(VectorND.createArrayOfVectors(5)));
        VectorsOperations.compareVectors(vectorND1, vectorND2);
    }
}
