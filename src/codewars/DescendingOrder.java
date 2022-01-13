package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrder {

    public static int sortDesc(final int num) {

//        Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//        Examples:
//        Input: 42145 Output: 54421
//
//        Input: 145263 Output: 654321
//
//        Input: 123456789 Output: 987654321

        //converts the int into an Integer array
        String temp = Integer.toString(num);
        Integer[] nums = new Integer[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
        }

        Arrays.sort(nums, Collections.reverseOrder());//orders the numbers in reverseOrder
        String newNumberOrder = Stream.of(nums).map(String::valueOf).collect(Collectors.joining(""));//joins the Integer array into a string

        return Integer.parseInt(newNumberOrder);
    }

    //Different solution(NOT MY Solution)
//    import java.util.Comparator;
//import java.util.stream.Collectors;
//
//    public class DescendingOrder {
//        public static int sortDesc(final int num) {
//            return Integer.parseInt(String.valueOf(num)
//                    .chars()
//                    .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                    .sorted(Comparator.reverseOrder())
//                    .collect(Collectors.joining()));
//        }
//    }

    public static void main(String[] args) {

        System.out.println(sortDesc(0));//0

        System.out.println(sortDesc(15));//51

        System.out.println(sortDesc(123456789));//987654321

    }

}
