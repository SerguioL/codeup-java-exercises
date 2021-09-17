package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side,side);
        this.side = length;
        this.side = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side , 2);
    }

    @Override
    public void setLength(double length) {
        this.length =length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
    //properties
    protected double side;
//
//    // constructor
//    // double holds decimals
//    public Square(double side){//argument
//        super(side,side);//super = parent \super is referring to the Rectangle constructor because Square is a sub-class of Rectangle
//        this.side = side;
//    }
//
//    public double getArea(){
//        System.out.println("This is for a Square");
//        return Math.pow(this.side , 2);
//    }
//
//    public double getPerimeter(){
//        System.out.println("This is for a Square");
//        return 4 * this.side;
//    }

}
