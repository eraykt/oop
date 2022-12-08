package labs.week9;

public class Sphere extends Shape3D {

    public Sphere(double radius) {
        super(0, radius);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * PI * radius * radius * radius;
    }

    @Override
    public double getArea() {
        return 4 * PI * radius * radius;
    }

}
