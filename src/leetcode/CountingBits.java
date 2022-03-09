package leetcode;

import java.util.Arrays;

public class CountingBits {

//    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

    // 000000 = 0
    // 000001 = 1
    // 000010 = 2
    // 000011 = 3
    // 000100 = 4
    // 000101 = 5

    public static int[] countBits(int n) {

        int[] output = new int[n+1];//so it starts at zero
        for(int i=1; i< output.length; i++){
            output[i] = output[i>>1] + i % 2;//output will equal the last number and will check to see if its odd or even
//            >> means right shift
        }
        return output;


    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(2)));//[0,1,1]
        System.out.println(Arrays.toString(countBits(5)));//[0,1,1,2,1,2]

    }

}
