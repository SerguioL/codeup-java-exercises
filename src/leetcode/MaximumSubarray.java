package leetcode;

public class MaximumSubarray {

//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//    A subarray is a contiguous part of an array.

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];//this is the first element in the array. exp 5
        int currentSum = maxSum;//this keeps track of the current sum. exp 5

        for(int i=1; i < nums.length; i++){//we start at the second element
            currentSum = Math .max(nums[i] + currentSum, nums[i]);//Math.max() checks to see which number is bigger. This checks to see if the current sum + the current index together are greater then just the index by its self. exp Math.max(4+5=9,4); currentSum = 9
            maxSum = Math.max(currentSum,maxSum);//Math.max() checks to see which number is bigger. If the current sum is greater then the max sum then it will get replaced. exp Math.max(9,5) maxSum = 9
            //it will continue  until it finds the max sum of the array.
        }

        return maxSum;
    }

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));//6
        System.out.println(maxSubArray(new int[]{1}));//1
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));//23

    }

}
