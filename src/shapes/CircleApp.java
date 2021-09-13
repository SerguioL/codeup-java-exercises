package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        String prompt = "Enter the radius of a circle:";
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of your circle id %.2f and its circumference is ", area,circumference );

    }

}
