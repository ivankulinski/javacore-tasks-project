package point;

public class UsePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(3);
        point.setZ(1);
        System.out.println(point.toString());

        System.out.println(new Point(4,4,4));
        System.out.println(new Point(7,7));
    }
}
