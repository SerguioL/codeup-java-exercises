package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {

        String[] array = numbers.split(" ");//splits the string of numbers
        List<Integer> numbersList = new ArrayList<>();

        for(String i : array){
            numbersList.add(Integer.parseInt(i));//converts the sting number into Integer and adds it to the list
        }

        return Collections.max(numbersList) + " " + Collections.min(numbersList);

    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));//"42 -9"
    }

}
