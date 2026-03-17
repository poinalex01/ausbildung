import org.example.Circle;
import org.example.Rectangle;
import org.example.Shape;
import org.example.Square;

void main() {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Rectangle(4.0, 4.5);
    shapes[1] = new Square(5.0);
    shapes[2] = new Circle(3.0);
    shapes[3] = new Rectangle(2.5, 6.0);

    for (Shape s : shapes) {
        System.out.println(s.getClass());
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("----------------------");
    }
}