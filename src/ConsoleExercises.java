//import java.util.Scanner;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        //===========================================================================

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a integer: ");
//        int userInputNumber = scanner.nextInt();
//        System.out.println("Your number was: " + userInputNumber);

//        System.out.println("Enter a word:");
//        String word1 = scanner.nextLine();
//        System.out.println("Enter a word:");
//        String word2 = scanner.nextLine();
//        System.out.println("Enter a word:");
//        String word3 = scanner.nextLine();

//        System.out.printf("Your Three words are %s, %s, %s", word1,word2,word3);

        //===========================================================================

//        System.out.println("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//
//        System.out.printf("Your Three words are %s%n, %s%n, %s%n", word1,word2,word3);

        //===========================================================================

//        for (int i = 0; i < 3; i++){
//            String userInput = scanner.next();
//            System.out.printf("%s%n", userInput);
//        }


        //===========================================================================

//        System.out.println("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

        //===========================================================================

        System.out.println("What is the length");
        int lengthInFeet = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width");
        int widthInFeet = Integer.parseInt(scanner.nextLine());
        System.out.println("The area is " + (widthInFeet * lengthInFeet) + " feet" + " and the perimeter " + (2*(widthInFeet + lengthInFeet)) + " feet");


        //===========================================================================

//        System.out.println("What is the Width");
//        int width = scanner.nextInt();
//        System.out.println("What is the length");
//        int length = scanner.nextInt();
//        int perimeter = (width*2) + (length*2);
//        int area = width * length;
//        System.out.println("The perimeter is " + perimeter + "\nThe area is " + area);

    }
}
