package codewars;

import java.util.Arrays;

public class LargestPairSumInArray {

    public static int largestPairSum(int[] numbers){

        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];

        return max1 + max2;
    }

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));//42
        System.out.println(largestPairSum(new int[]{-100, -29, -24, -19, 19}));//0
        System.out.println(largestPairSum(new int[]{1, 2, 3, 4, 6, -1, 2}));//10
        System.out.println(largestPairSum(new int[]{-10, -8, -16, -18, -19}));//-18
    }

}
