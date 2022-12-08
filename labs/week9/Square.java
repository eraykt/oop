package labs.week9;

public class Square extends Shape2D {

    public Square(double width) {
        super(width, width);
    }

    @Override
    public double getArea() {
        return width * width;
    }

}
