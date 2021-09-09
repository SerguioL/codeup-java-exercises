public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(addition(2,8));
        System.out.println(subtraction(8,2));
        System.out.println(multiplication(2,8));
        System.out.println(division(8,2));
    }

     public static int addition(int input1, int input2){
        return input1 + input2;
     }

    public static int subtraction(int input1, int input2){
        return input1 - input2;
    }

    public static int multiplication(int input1, int input2){
    return input1 * input2;
    }

    public static int division(int input1, int input2){
        return input1/input2;
    }

}
