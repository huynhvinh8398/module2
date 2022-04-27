package md2.Point2D_3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    // Tạo hàm constructor
    public Point3D(){};

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }
    // tạo phương thức set và get
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
   public void setXYZ() {
//       this.x=x;
//        this.y =y;
////        this.z = z;
   }
    public float[] getXYZ() {
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + Arrays.toString(getXYZ());
    }
}
