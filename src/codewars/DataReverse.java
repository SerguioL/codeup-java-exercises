package codewars;

import java.util.Arrays;
import java.util.Collections;

public class DataReverse {

//    A stream of data is received and needs to be reversed.
//
//    Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:
//
//            11111111  00000000  00001111  10101010
//            (byte1)   (byte2)   (byte3)   (byte4)
//    should become:
//
//            10101010  00001111  00000000  11111111
//            (byte4)   (byte3)   (byte2)   (byte1)
//    The total number of bits will always be a multiple of 8.
//
//    The data is given in an array as such:
//
//            [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
//    Note: In the C and NASM languages you are given the third parameter which is the number of segment blocks.


    //https://www.geeksforgeeks.org/system-arraycopy-in-java/
    public static int[] DataReverse(int[] data) {

        int[] reversed = new int[data.length];
        for (int i = 0; i < data.length; i += 8) {
            System.arraycopy(data, i, reversed, data.length - 8 - i, 8);
        }
        return reversed;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(DataReverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0})));
    }

}
