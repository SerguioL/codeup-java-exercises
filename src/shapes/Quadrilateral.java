package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    //protected properties
    protected double length;
    protected double width;

    //constructor
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){}

    //methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //abstract methods
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
