package square_circle;

public class Square implements FigureMetrics{
    private double sideLength;

    public Square(double sideLength) {
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
    public double calculateArea() {
        if (getSideLength() == 0){
            return 0;
        }
        else {
            return getSideLength() * getSideLength();
        }
    }

    @Override
    public double calculatePerimeter() {
        if (getSideLength() == 0){
            return 0;
        }
        else {
            return getSideLength() * 4;
        }
    }
}
