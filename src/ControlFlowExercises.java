
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

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number");
//        int userNumber = Integer.parseInt(scanner.next());
//        System.out.printf("%s%n",userNumber);
//        int userNumberSquared = userNumber * userNumber;
//        System.out.printf("%s%n",userNumberSquared);
//        int userNumberCubed = userNumber *userNumber * userNumber;
//        System.out.printf("%s%n",userNumberCubed);

        System.out.println("Enter a number");
        int userNumber = Integer.parseInt(scanner.next());

        for(int i =1; i<=userNumber; i++){
            int numberSquared = i * i;
            int numberCubed = i * i * i;
            System.out.println(i + " " + numberSquared + " " + numberCubed);
        }
//        System.out.println("To continue type yes, to stop type no");
//        String userChoice = scanner.next();
//        if(userChoice == "yes"){
//            System.out.println("Enter a number");
//        }else if (userChoice == "no"){
//            System.out.println("ok");
//        }





    }

}
