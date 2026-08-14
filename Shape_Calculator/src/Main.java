import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(15,20));
        shapes.add(new Triangle(10,15,10,11));

        for (Shape shape : shapes) {
            System.out.println("\n" + shape.getClass().getSimpleName());
            System.out.printf("Area      : %.3f%n", shape.area());
            System.out.printf("Perimeter : %.3f%n", shape.perimeter());
            System.out.println("--------------------------");
        }
    }
}
