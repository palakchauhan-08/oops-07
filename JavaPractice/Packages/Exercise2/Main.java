import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle area: " + c.area(5));
        System.out.println("Rectangle area: " + r.area(4, 6));
    }
}