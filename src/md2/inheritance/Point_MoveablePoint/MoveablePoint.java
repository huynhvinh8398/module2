package md2.inheritance.Point_MoveablePoint;

public class MoveablePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;
    // tạo hàm constructor
    public MoveablePoint(){};
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //tạo phương thức get và set
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float [] getSpeed() {
        return new float[] {xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{(x,y)="+getX()+getY()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }
}

