package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

//    You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
//
//    Return the max sliding window.

    //I got stuck and need help with this one

    //https://www.programcreek.com/2014/05/leetcode-sliding-window-maximum-java/

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if(nums==null||nums.length==0)
            return new int[0];

        int[] result = new int[nums.length-k+1];

        LinkedList<Integer> deque = new LinkedList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!deque.isEmpty()&&deque.peekFirst()==i-k)
                deque.poll();

            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }

            deque.offer(i);

            if(i+1>=k)
                result[i+1-k]=nums[deque.peek()];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));//[3,3,5,5,6,7
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1}, 1)));//[1]
    }

}
