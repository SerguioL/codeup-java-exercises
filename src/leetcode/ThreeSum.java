package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

//    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//    Notice that the solution set must not contain duplicate triplets.

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
//        In Java, the linked list class is an ordered collection that contains many objects of the same type. Data in a Linked List is stored in a sequence of containers. The list holds a reference to the first container and each container has a link to the next one in the sequence
        //https://www.educative.io/blog/data-structures-linked-list-java-tutorial
        List<List<Integer>> outputArr =  new LinkedList<>();

        for(int i=0; i< nums.length-2; i++){//num.length-2 because we are going to need to look at the last 2 numbers and be able to compare them

             if(i == 0 || (i > 0 && nums[i] != nums[i-1])){//if you find a duplicate then skip it

                 int low = i+1;//the next number in the array
                 int high = nums.length-1;//the last number int the array
                 int sum = 0 - nums[i];//the number that we are going to need to get the sum of 0

                 while(low < high){
                     if(nums[low] + nums[high] == sum){
                         outputArr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                         while(low < high && nums[low] == nums[low + 1]){
                             low++;
                         }
                         while(low < high && nums[high] == nums[high - 1]){
                             high--;
                         }
                         low++;
                         high--;
                     } else if(nums[low] + nums[high] > sum){
                         high--;
                     } else {
                         low++;
                     }
                 }

             }

        }

        return outputArr;

    }

    public static void main(String[] args) {

        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));//[[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(new int[]{}));//[]
        System.out.println(threeSum(new int[]{0}));//[]

    }

}
