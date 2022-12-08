package labs.week9;

public class Pyramid extends Shape3D {

    public Pyramid(double depth, double height, double width) {
        super(depth, height, width);
    }

    @Override
    public double getVolume() {
        return 3 / height * width * depth;
    }

    @Override
    public double getArea() {
        return -1;
    }

}
