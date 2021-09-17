package shapes;

    public class Rectangle extends Quadrilateral implements Measurable{


        public Rectangle(double length, double width){
            super(length,width);
        }

//        public double getLength() {
//            return length;
//        }
//
//        public double getWidth() {
//            return width;
//        }

        @Override
        public double getPerimeter() {
            return (2 * this.length) + (2 * this.width);
        }

        @Override
        public double getArea() {
            return this.length * this.width;
        }

        @Override
        public void setLength( double length) {
            this.length =length;

        }

        @Override
        public void setWidth(double width) {
            this.width = width;

        }
//    //protected properties
//    protected double length;
//
//    protected  double width;
//
//    //constructor
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//
//    }
//        public Rectangle(){
//    }
//    // getters and setters
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    //method
//public double getPerimeter(){
//    System.out.println("This is for a Rectangle");
//    return (2 * this.length) + (2 * this.width);
//}
//
//public double getArea(){
//    System.out.println("This is for a Rectangle");
//    return this.length * this.width;
//}

}
