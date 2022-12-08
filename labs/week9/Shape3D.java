package labs.week9;

public abstract class Shape3D extends Shape2D {
    protected double depth;

    public Shape3D(double depth, double height, double width) {
        super(height, width);
        this.depth = depth;
    }

    public Shape3D(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return "the volume is " + getVolume() + " " + super.toString();
    }
}
