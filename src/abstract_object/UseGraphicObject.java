package abstract_object;

public class UseGraphicObject {
    public static void main(String[] args) {
        Circle crc = new Circle(2);
        Rectangle rect = new Rectangle(2);
        System.out.println("Circle area: " + crc.area());
        System.out.println("Rectangle area: " + rect.area());


    }
}
