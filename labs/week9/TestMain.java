package labs.week9;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(3, 4);

        Cylinder cylinder = new Cylinder(2, 5);
        Sphere sphere = new Sphere(2);
        Pyramid pyramid = new Pyramid(2, 3, 4);
        Cone cone = new Cone(2, 5);

        Shape2D[] shapes = { circle, square, rectangle, cylinder, sphere, pyramid, cone };

        for (Shape2D a : shapes)
            System.out.println(a);

    }
}
