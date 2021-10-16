import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaDrills {
//working progress
//    public static String flipOuterCase(String input){

//        for(int i= 0;i<input.length();i++){
//            if()
//        }
//        String fistLetter = input.substring(0,1).toUpperCase();
//        String lastLetter = input.substring(0,input.length()-1).toUpperCase();
//        return lastLetter;

//    }

    public static int returnTotalDifference(List<Integer> list1, List<Integer> list2) {
        int sum = 0;
        int sum2 = 0;
        for (Integer integer : list1) {
            sum += integer;
        }

        for (Integer integer : list2) {
            sum2 += integer;
        }
        return sum - sum2;
    }


    public static void main(String[] args) {
//        System.out.println(flipOuterCase('cat')); // CaT
//        System.out.println(flipOuterCase('CaT')); // cat
//        System.out.println(flipOuterCase('caT')); // Cat
//        System.out.println(flipOuterCase('cAt')); // CAT
//        System.out.println(flipOuterCase("cat"));

        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));

    }

}
