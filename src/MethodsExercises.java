

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(addition(2,8));
        System.out.println(subtraction(8,2));
        System.out.println(multiplication(2,8));
        System.out.println(division(8,2));
        System.out.println(modules(8,2));
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(userInput);
        System.out.println(factorial(userInput));
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

    public static int modules(int input1, int input2){
        return input1 % input2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        return getInteger(min,max);

    }

    public static int factorial(int input){
        if(input == 1) {
            return 1;
        } else {
            return input * factorial(input -1);
        }

    }

    public static void doYouWantLoopAgain(int input){
        Scanner sc = new Scanner(System.in);

        boolean continueLoop;
        do{
            continueLoop = false;

            input;

            System.out.println("Do you want to go again? (yes or no)");
            String userResponse = sc.next();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                continueLoop = true;
//            } else {
//                userContinue = false;
            }

        }
        while(continueLoop)
    }

}


