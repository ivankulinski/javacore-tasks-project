package AbstractObject;

public class Circle extends  GraphicObject{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            System.out.println("Validation error! Radius is set to 0");
        }
        else {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        if (getRadius() == 0){
            return 0;
        }
        else {
            return Math.PI * (Math.pow(getRadius(), 2));
        }
    }

}
