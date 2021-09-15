package shapes;

public class ShapesTest {
    public static void main(String[] args) {
// variable type name       instance
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter() + " " + box1.getArea());

// variable type name       instance
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea() + " " + box2.getPerimeter());


    }
}
