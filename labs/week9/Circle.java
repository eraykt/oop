package labs.week9;

public class Circle extends Shape2D {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

}
