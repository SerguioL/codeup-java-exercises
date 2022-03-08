package leetcode;

public class NumberOfOneBits {

//    Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

    // you need to treat n as an unsigned value
    //this solution works on Leetcode
    public static int hammingWeight(int n) {

        int counter = 0;//this will keep track of how many times one shows up

        while(n != 0){ //while n is positive  loop
            counter += (n%2) & 1;
            n>>>= 1;//right shift
        }
        return counter;

    }

    public static void main(String[] args) {

//        System.out.println(hammingWeight(00000000000000000000000000001011));//3
//        System.out.println(hammingWeight(00000000000000000000000010000000));//1
//        System.out.println(hammingWeight(11111111111111111111111111111101));//31

    }

}
