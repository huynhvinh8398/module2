package md2.Point2D_3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 4, 5);
        point3D.setXYZ();
        point3D.setX(4);
        point3D.setZ(5);
        point3D.setY(7);
//        point3D.getXYZ();
        System.out.println(point3D.toString());

    }

}

