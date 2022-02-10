package codewars;

import java.util.stream.IntStream;

public class CreatePhoneNumber {

//    Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//
//    Example
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//    The returned format must be correct in order to complete this challenge.
//            Don't forget the space after the closing parentheses!

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumberStr = String.join("", IntStream.of(numbers).mapToObj(String::valueOf).toArray(String[]::new));
//        System.out.println(phoneNumberStr);
        //String formattedPhoneNumber = "(" + phoneNumberStr.substring(0,3) + ") " + phoneNumberStr.substring(3,6) + "-" + phoneNumberStr.substring(6);
        //System.out.println(formattedPhoneNumber);
        return "(" + phoneNumberStr.substring(0,3) + ") " + phoneNumberStr.substring(3,6) + "-" + phoneNumberStr.substring(6);
    }

    //DIFFERENT SOLUTION (NOT MY SOLUTION)

//    public static String createPhoneNumber(int[] numbers) {
//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
//    }



    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));//"(123) 456-7890"

    }


}
