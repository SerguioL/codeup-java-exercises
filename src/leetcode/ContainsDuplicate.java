package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static boolean containsDuplicate(int[] nums) {

//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                int count = 0;
//                if(nums[j] == nums[i]){
//                    count++;
//                }
//                if(count >= 1){
//                    return true;
//                }
//            }
//        }
//
//        return false;

        //different solutions

        HashSet<Integer> numbers = new HashSet<>();
        //HashSet only have distinct elements in them
        //https://www.javatpoint.com/java-hashset#:~:text=Java%20HashSet%20class%20is%20used,class%20and%20implements%20Set%20interface.&text=HashSet%20stores%20the%20elements%20by,HashSet%20allows%20null%20value.

        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;

// ============================================

//        Arrays.sort(nums);
//        for(int i=0; i<nums.length-1; i++){
//            if(nums[i] == nums[i+1]){
//                return true;
//            }
//
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));//true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));//false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));//true
    }

}
