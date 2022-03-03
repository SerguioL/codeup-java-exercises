package leetcode;

public class ContainerWithMostWater {

//    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//    Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//    Return the maximum amount of water a container can store.
//
//    Notice that you may not slant the container.

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int APointer = 0;
        int BPointer = height.length-1;

        while (APointer < BPointer){
            if(height[APointer] < height[BPointer]){
                maxArea = Math.max(maxArea, height[APointer] * (BPointer - APointer));
                APointer += 1;
            } else {
                maxArea = Math.max(maxArea, height[BPointer] * (BPointer - APointer));
                BPointer -= 1;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 3, 5, 4, 8, 3, 7}));//49
        System.out.println(maxArea(new int[]{1, 1}));//1
    }

}
