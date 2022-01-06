package codewars;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {

//        You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.
//
//                You can assume all values in the array are numbers.

        for (int i : a) {//int i = index //a = the array
            if (i > limit) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{66, 101}, 200));//true
        System.out.println(smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));//false
        System.out.println(smallEnough(new int[]{101, 45, 75, 105, 99, 107}, 107));//true
        System.out.println(smallEnough(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120));//true

    }

}
