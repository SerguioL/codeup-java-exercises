package leetcode;

public class SumOfTwoIntegers {

//    Given two integers a and b, return the sum of the two integers without using the operators + and -.

//    https://www.programcreek.com/2015/07/leetcode-sum-of-two-integers-java/

    public static int getSum(int a, int b) {

        while( b != 0){
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        return a;

    }

    public static void main(String[] args) {

        System.out.println(getSum(1, 2));//3
        System.out.println(getSum(2, 3));//5

    }

}
