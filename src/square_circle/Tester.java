package square_circle;

public class Tester {
    public static void main(String[] args) {
        Square sq = new Square(3);
        System.out.println(sq.calculateArea());
        System.out.println(sq.calculatePerimeter());

        System.out.println();

        Circle cr = new Circle(4);
        System.out.println(cr.calculateArea());
        System.out.println(cr.calculatePerimeter());
    }
}
