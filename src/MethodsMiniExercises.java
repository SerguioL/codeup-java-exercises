
import java.util.Scanner;
public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an input.");
//        String stringInput = sc.nextLine();
//
//        System.out.println("Please enter an integer.");
//        int intInput = sc.nextInt(); // assume the user will enter a valid integer
//
//
//        if (stringInput.length() == intInput) {
//            System.out.println("That matches the length of the input!");
//        } else {
//            System.out.println("That doesn't match the length of the input!");
//        }
        doesItMatch(StringInputMethod(),intInputMethod());



    }

    public static int intInputMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intInput = sc.nextInt(); // assume the user will enter a valid integer
        return intInput;
    }

    public static String StringInputMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }

    public static void doesItMatch(String stringInput,int intInput){
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }



}