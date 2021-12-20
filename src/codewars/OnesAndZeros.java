package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//        Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//                Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
//
//        Examples:
//        Testing: [0, 0, 0, 1] ==> 1
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 0, 1] ==> 5
//        Testing: [1, 0, 0, 1] ==> 9
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 1, 0] ==> 6
//        Testing: [1, 1, 1, 1] ==> 15
//        Testing: [1, 0, 1, 1] ==> 11

        int output = 0;
        for (int bit : binary)
            output = output << 1 | bit;
        return output;

    }

    public static void main(String[] args) {

        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));//1
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));//15
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));//6
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));//9

    }

}
