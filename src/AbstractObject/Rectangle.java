package AbstractObject;

public class Rectangle extends GraphicObject{
    private double sideLength;

    public Rectangle(double sideLength) {
        setSideLength(sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength < 0){
            System.out.println("Validation error! Side length is set to 0");
        }
        else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public double area() {
        if (getSideLength() == 0){
            return 0;
        }
        else {
            return getSideLength() * getSideLength();
        }
    }
}
