package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//    You must write an algorithm that runs in O(n) time and without using the division operation.

    public static int[] productExceptSelf(int[] nums) {

//        int numsLength = nums.length;
//
//        int[] leftProducts = new int[numsLength];
//        int[] rightProducts = new int[numsLength];
//
//        int[] output = new int[numsLength];
//
//        leftProducts[0] = 1;
//        rightProducts[numsLength-1] = 1;
//
//        for (int i=1; i< numsLength; i++){
//            leftProducts[i] = nums[i-1] * leftProducts[i-1];
//        }
//
//        for (int i=numsLength-2; i>=0; i--){
//            rightProducts[i] = nums[i+1] * rightProducts[i+1];
//        }
//
//        for (int i=0; i<numsLength; i++){
//            output[i] = leftProducts[i] * rightProducts[i];
//        }
//
//        return output;

        int numsLength = nums.length;

        int[] output = new int[numsLength];

        output[0] = 1;

        for (int i=1; i< numsLength; i++){
            output[i]= nums[i-1] * output[i-1];
        }

        int right =1;
        for (int i=numsLength-1; i>=0; i--){
            output[i] = output[i] * right;
            right = right * nums[i];
        }

        return output;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));//[24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));//[0, 0, 9, 0, 0]

    }

}
