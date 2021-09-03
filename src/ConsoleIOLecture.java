import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        String myCohort ="Draco";
//        String timeOfDay = "moring";
////        System.out.println(myCohort);
//        System.out.printf("Good %s, %s!%n", timeOfDay, myCohort);
//        System.out.printf("Hello, !");

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String userInput =scanner.nextLine();
//        System.out.println("Your work was " + userInput);
//        System.out.printf("Your sting was %S", userInput);
        System.out.println("Enter a integer: ");
//        int userInput = scanner.nextInt();
        int userInputInt = Integer.parseInt(scanner.nextLine());
//        String userInput = Integer.parseInt(scanner.next());
//        System.out.printf("You Entered %d%n", userInput);
        //Option 1 : an extra nextLine();
//        String ghostString = scanner.nextLine();
        //Option 2 concatenate a .next() and a .nextLine()
        //String firstString = scanner.next() + scanner.nextLine();
        //Option 3: use all .nextLine - parse the input int userInputInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a string: ");
        String firstString = scanner.next() + scanner.nextLine();
        System.out.println("Enter another string: ");
        String secondString = scanner.nextLine();
        System.out.println("First sentence: " +  firstString + "\n Second string" + secondString);


    }
}
