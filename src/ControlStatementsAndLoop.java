public class ControlStatementsAndLoop {
    public static void main(String[] args) {
        // You can solve any programing problem with just
        //Statements
        //Decisions
        //Loops

        //You can
        //Do something
        //Do something under a certain condition
        //Do something again and again

        //Key differences about Java statements with respect to JavaScript statements
        //no Automatic Semicolon Insertion
        //all variables need a type

        // Conditional

//        int x=5;
//        if(x == 5){
//            System.out.println("x = 5");
//        } else {
//            System.out.println("x doesn't = 5");
//        }
//        System.out.println(x==5);

        //============================================================================================

//        short y = -5;
//        y = 12;
//        y = 32450;
//        // y = 33000; //incompatible types: possible lossy conversion from int to short
//
//        if (y < 0 ) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >=0 && y < 30000){
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

        //============================================================================================

        String customerChoice = "vanilla";

        switch (customerChoice) {
            case "vanilla":
                System.out.println("One vanilla coming right up");
                break;
            case "chocolate":
                System.out.println("chocolate coming right up");
                break;
            case "strawberry":
                System.out.println("strawberry coming right up");
                break;
            default:
                System.out.println("We don't have that");
                break;
        }

    }
}
