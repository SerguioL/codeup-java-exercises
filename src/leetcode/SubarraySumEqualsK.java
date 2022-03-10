package leetcode;

import java.util.HashMap;

public class SubarraySumEqualsK {

//    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> arr_sums = new HashMap<>();//HashMap<the current total sum, how many times it has benn seen >
        arr_sums.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(arr_sums.containsKey(sum-k)){//is the current sum - k
                result += arr_sums.get(sum-k);//if yes then add it to result
            }

            arr_sums.put(sum, arr_sums.getOrDefault(sum, 0)+1);// if it's the first time the array appears then we will add one and if it's not then just add one every time it appears
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(subarraySum(new int[]{1, 1, 1},2));//2
        System.out.println(subarraySum(new int[]{1, 2, 3}, 3));//2

    }

}
