package task1;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Vector vector2D1 = new Vector2D(new Point(1, 1), new Point(3, 5));
        Vector vector2D2 = new Vector2D(new Point(3, 6), new Point(7, 1));
        System.out.println(vector2D1.findLength());
        System.out.println(vector2D1.findVectorSum(vector2D2).toString());
        System.out.println(vector2D1.findVectorDifference(vector2D2).toString());
        System.out.println(vector2D1.findScalarMulti(vector2D2));
        Vector vector3D1 = new Vector3D(new Point(1, 1, 1), new Point(3, 5, 8));
        Vector vector3D2 = new Vector3D(new Point(3, 6, 5), new Point(7, 1, 4));
        System.out.println(vector3D1.findLength());
        System.out.println(vector3D1.findVectorSum(vector3D2).toString());
        System.out.println(vector3D1.findVectorDifference(vector3D2).toString());
        System.out.println(vector3D1.findScalarMulti(vector3D2));
        System.out.println(Arrays.toString(Vector2D.createArrayOfVectors(5)));
        System.out.println(Arrays.toString(Vector3D.createArrayOfVectors(5)));
        VectorsOperations.compareVectors(vector3D2, vector2D1);
    }
}
