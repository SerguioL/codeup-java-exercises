package shapes;
//
public class ShapesTest {
    public static void main(String[] args) {
//// variable type name       instance
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        //this is Polymorphism
//// variable type name       instance
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//

        Measurable myShape1 = new Rectangle(4,5);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
//        System.out.println(myShape1.ge);
        Measurable myShape2 = new Square(5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());


    }
}
