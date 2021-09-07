
import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {

        //==========================================================

//        int i = 5;
//        while(i < 15){
//            System.out.println("The current number is " + i);
//            i++;
//            System.out.println("Now the current number is " + i);
//        }

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


//        boolean continueA;
//        do{
//            continueA = false;
//            System.out.println("Enter a number");
//            int userNumber = Integer.parseInt(scanner.next());
////
//            for(int i =1; i<=userNumber; i++){
//                int numberSquared = i * i;
//                int numberCubed = i * i * i;
//                System.out.println(i + " " + numberSquared + " " + numberCubed);
//            }
//            System.out.println("Do you want to go again? (yes or no)");
//            String userA = scanner.next();
//            if(userA.equalsIgnoreCase("yes") || userA.equalsIgnoreCase("y")){
//                continueA = true;
////            } else {
////                continueA = false;
//            }
//
//        }
//        while (continueA);

        //==========================================================

        Scanner scanner = new Scanner(System.in);
//
        System.out.println("Enter your number grade");
        int userGrade = Integer.parseInt(scanner.nextLine());

        if(userGrade <= 100 && userGrade >= 88){
            System.out.println("A");
        } else if(userGrade <= 87 && userGrade >= 80){
            System.out.println("B");
        }else if(userGrade <= 79 && userGrade >= 67){
            System.out.println("C");
        }else if (userGrade <= 66 && userGrade >= 60){
            System.out.println("D");
        }else if (userGrade <= 59 && userGrade >= 0){
            System.out.println("F");
        }else {
            System.out.println("not a valid input");
        }


    }

}
