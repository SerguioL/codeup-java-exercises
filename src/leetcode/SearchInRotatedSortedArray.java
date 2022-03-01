package leetcode;

public class SearchInRotatedSortedArray {

//    There is an integer array nums sorted in ascending order (with distinct values).
//
//    Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//    Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//    You must write an algorithm with O(log n) runtime complexity.

    public static int search(int[] nums, int target) {

        if (nums == null || nums.length == 0){
            return -1;
        }

        int left = 0; //left side of the array
        int right = nums.length-1; //right side of the array

        while (left < right){//the loop will break when it finds the smallest number in the array

            int midpoint = left + (right - left) / 2;// this calculates the midpoint of the array

            if (nums[midpoint] > nums[right]){// is the middle element in the array greater then the element all the way to the right
                left = midpoint + 1;
            } else {
                right = midpoint;
            }

        }

        int start = left;
        left = 0;
        right = nums.length-1;

        if (target >= nums[start] && target <= nums[right]){
            left = start;
        } else {
            right = start;
        }

        while (left <= right){
            int midpoint = left + (right - left) / 2;
            if(nums[midpoint] == target){
                return midpoint;
            }else if (nums[midpoint] < target) {
                left = midpoint+1;
            } else {
                right = midpoint-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));//4
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));//-1
        System.out.println(search(new int[]{1}, 0));//-1

    }

}
