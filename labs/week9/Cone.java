package labs.week9;

public class Cone extends Shape3D {

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return PI * radius * radius * height / 3;
    }

    @Override
    public double getArea() {
        return -1;
    }

}
