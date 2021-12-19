package codewars;

//The Stanton measure of an array is computed as follows: count the number of 1s in the array. Let this count be n. The Stanton measure is the number of times that n appears in the array.
//
//        Write a function which takes an integer array and returns its Stanton measure.
//
//        Example
//        The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3, because 1 occurs 2 times in the array and 2 occurs 3 times.

import java.util.stream.IntStream;

public class StantonMeasure {

    public static int stantonMeasure(int[] arr) {
//        return (int) IntStream.of(arr).filter(i -> i == (int) IntStream.of(arr).filter(j -> j == 1).count()).count();
//         found this one it looks cool I don't understand it too well I show do some research on IntStream

        int sum1 = 0;
        int sum2 = 0;
        for(int i : arr){
            if(i == 1)//checks to see how many 1s are in the array
                sum1++;//this keep count of how many times 1 appeared in the array
        }
        for(int i : arr){
            if (i == sum1)//this checks the array for a number that equals  sum1
                sum2++;//this keeps count of how many times the number of sum1 appeared in the array
        }
        return sum2;

    }

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));//3

    }

}
