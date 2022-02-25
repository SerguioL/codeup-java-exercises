package leetcode;

public class FindMinimumInRotatedSortedArray {

//    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//            [4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//    Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//    You must write an algorithm that runs in O(log n) time.

    public static int findMin(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int left = 0;//left side of the  array
        int right = nums.length-1;//right side of the array

        while(left < right){

            int midpoint = left + ( right - left) / 2;

            if (midpoint > 0 && nums[midpoint] < nums[midpoint-1]){

                return nums[midpoint];

            } else if ( nums[left] <= nums[midpoint] && nums[midpoint] > nums[right]){

                left = midpoint +1;

            } else {
                right = midpoint -1;
            }


        }
        return nums[left];



    }

    public static void main(String[] args) {

        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));//1
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));//0
        System.out.println(findMin(new int[]{11, 13, 15, 17}));//11

    }

}
