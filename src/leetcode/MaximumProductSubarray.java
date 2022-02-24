package leetcode;

public class MaximumProductSubarray {

//    Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
//
//    The test cases are generated so that the answer will fit in a 32-bit integer.
//
//    A subarray is a contiguous subsequence of the array.

    public static int maxProduct(int[] nums) {

        int numsLength = nums.length;

        int min = nums[0];
        int max = nums[0];
        int result = nums[0];

        for(int i=1;i<numsLength;i++){

            int tempMax = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));

            max = tempMax;
            result = Math.max(result, max);

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));//6
        System.out.println(maxProduct(new int[]{-2, 0, -1}));//0

    }

}
