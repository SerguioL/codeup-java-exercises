package shapes;

public class Square extends Rectangle{
    //properties
    protected double side;

    // constructor
    // double holds decimals
    public Square(double side){//argument
        super(side,side);//super = parent \super is referring to the Rectangle constructor because Square is a sub-class of Rectangle
        this.side = side;
        System.out.println("This is for a Square");
    }

    public double getArea(){
        return Math.pow(this.side , 2);
    }

    public double getPerimeter(){
        return 4 * this.side;
    }

}
