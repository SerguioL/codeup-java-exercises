package shapes;

    public class Rectangle {
    //protected properties
    protected double length;

    protected  double width;

    //constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    // getters and setters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //method
public double getArea(){
    System.out.println("This for a Rectangle");
    return (2 * length) + (2 * width);
}

public double getPerimeter(){
    System.out.println("This for a Rectangle");
    return length * width;
}

}
