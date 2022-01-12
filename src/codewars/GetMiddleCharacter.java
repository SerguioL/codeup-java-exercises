package codewars;

public class GetMiddleCharacter {

    public static String getMiddle(String word) {

//        You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
//
//        #Examples:

//        Kata.getMiddle("test") should return "es"
//
//        Kata.getMiddle("testing") should return "t"
//
//        Kata.getMiddle("middle") should return "dd"
//
//        Kata.getMiddle("A") should return "A"

//        #Input
//
//        A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
//
//        #Output
//
//        The middle character(s) of the word represented as a string.

        int index, length;
        if(word.length()%2==0){
            index = word.length() / 2 -1;
            length = 2;
        }
        else{
            index = word.length() / 2;
            length = 1;
        }
        return word.substring(index,index+length);

    }

    //Different solutions
//    public static String getMiddle(String word) {
//        return word.substring((int) Math.ceil(word.length() / 2.0) - 1, (int) Math.floor(word.length() / 2.0) + 1);
//    }

    public static void main(String[] args) {

        System.out.println(getMiddle("test"));//"es"
        System.out.println(getMiddle("middle"));//"dd"

    }

}
