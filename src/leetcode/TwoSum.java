package leetcode;

import java.util.Arrays;

public class TwoSum {

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++){//gets first number
            for( int j=i+1; j<nums.length; j++){
                int secondNum = target - nums[i];//subtracts the current number in the array from the target exp 9 - 2 = 7
                if(nums[j] == secondNum){//loop to see if there is a number that matches ours secondNum
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no numbers combinations could make target number");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));//[0,1]
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));//[1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));//[0,1]
    }

}
