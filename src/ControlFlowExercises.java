
import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {

        //==========================================================

        int i = 5;
        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }

        //==========================================================

//        int i = 0;
//        do{
//            System.out.println(i);
//            i= i+2;
//        }
//        while (i<100);
//        System.out.println(i);

        //==========================================================

//        int i = 100;
//        do{
//            System.out.println(i);
//            i= i-5;
//        }
//        while (i > -10);
//        System.out.println(i);

        //==========================================================

//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        }
//        while (i <1000000);

        //==========================================================

//        int i;
//        for (i=5; i<15;i++){
//            System.out.println("The current number is " + i);
//        }
//        System.out.println("The last number is "+ i);

        //==========================================================

//        int i;
//        for(i=0; i<100; i+=2){
//            System.out.println(i);
//        }
//        System.out.println(i);
//
        //==========================================================

//        int i;
//        for(i =100; i> -10; i-=5){
//            System.out.println(i);
//        }
//        System.out.println(i);

        //==========================================================

//        long i;
//        for(i=2; i<1000000; i*=i){
//            System.out.println(i);
//
//        }

        //==========================================================

//        for(int i = 1;i<100;i++){
//            if(i % 3 == 0 && i % 5 ==0){
//                System.out.println("FizzBuzz");
//            }else if (i % 3 == 0 ){
//                System.out.println("Fizz");
//            } else if(i % 5 ==0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //==========================================================

 //       Scanner scanner = new Scanner(System.in);


//        boolean userContinue;
//        do{
//            userContinue = false;
//            System.out.println("Enter a number");
//            int userNumber = Integer.parseInt(scanner.next());
////
//            for(int i =1; i<=userNumber; i++){
//                int numberSquared = i * i;
//                int numberCubed = i * i * i;
//                System.out.println(i + " " + numberSquared + " " + numberCubed);
//            }
//            System.out.println("Do you want to go again? (yes or no)");
//            String userResponse = scanner.next();
//            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
//                userContinue = true;
////            } else {
////                userContinue = false;
//            }
//
//        }
//        while (userContinue);

        //==========================================================
//
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your number grade");
//        int userGrade = Integer.parseInt(scanner.nextLine());
//
//        if(userGrade <= 100 && userGrade >= 88){
//            System.out.println("A");
//        } else if(userGrade <= 87 && userGrade >= 80){
//            System.out.println("B");
//        }else if(userGrade <= 79 && userGrade >= 67){
//            System.out.println("C");
//        }else if (userGrade <= 66 && userGrade >= 60){
//            System.out.println("D");
//        }else if (userGrade <= 59 && userGrade >= 0){
//            System.out.println("F");
//        }else {
//            System.out.println("not a valid input");
//        }

        //==========================================================

//        Bonus exercise -- the PIN code (may require a break statement)
//
//        You have to design the code such that the user has only three tries to guess the correct pin of the account.
//        You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When ran out of tries display "Sorry but you have been locked out."
//        program Starts:
//```
//        Please enter pin:
//        22132
//        Output:
//        Incorrect, try again.
//                Please enter pin:
//        23412
//        Output:
//        Incorrect, try again.
//                Please enter pin:
//        12345
//        Output:
//        Correct, welcome back.

//        Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Please enter pin:");
//            int userPinTry = Integer.parseInt(scanner.next());
//            int pin = 12345;
//            for(int i = 0; i < 3; i++)
//            if(userPinTry == pin){
//                System.out.println("correct welcome back");
//            } else if (userPinTry != pin){
//                System.out.println("Incorrect, try again.");
//                System.out.println("Please enter pin:");
//            }


    }

}
