package md2.Abstract_interface.Comparable;

public class ComparableCircle extends Circle {
    public ComparableCircle() {

    }
   public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
//    @Override
//    public int compareTo(ComparableCircle o) {
//        if (getRadius()>o.getRadius()) return 1;
//        else if (getRadius()<o.getRadius()) return -1;
//          else return 1;
//    }
}
