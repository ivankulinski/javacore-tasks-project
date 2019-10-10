package Point;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(){
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0){
            this.x = 0;
        }
        else{
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0){
            this.y = 0;
        }
        else{
            this.y = y;
        }
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        if (z < 0){
            this.z = 0;
        }
        else{
            this.z = z;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
