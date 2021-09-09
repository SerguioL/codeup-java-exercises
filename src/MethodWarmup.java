public class MethodWarmup {

//    TODO: create a class, MethodWarmup, and add an empty main method.
//    TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//            - If both integers are equal, the order of operands doesn’t matter in the calculation.
//          - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//          *** BONUS *** allow the method to accept two doubles and return a double output

    public static void main(String[] args) {
        System.out.println(getDifference(-6,2));
        System.out.println(getDifference(8));

    }

    public static int getDifference(int input1,int input2){
        return Math.abs(input1) - Math.abs(input2);
    }

    public static int getDifference(int input1){
        return Math.abs(input1);
    }

}
