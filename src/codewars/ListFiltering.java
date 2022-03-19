package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltering {

//        In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//
//        Example
//        Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
//        Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
//        Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)

    public static List filterList(final List list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {//instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not https://www.geeksforgeeks.org/instanceof-keyword-in-java/
                result.add(list.get(i));
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(filterList(Arrays.asList(1, 2, "a", "b")));//[1, 2]
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b", 0, 15)));//[1, 2, 0, 15]
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));//[1, 2, 231]

//        assertEquals(Arrays.asList(new Object[]{1,2}), Kata.filterList(Arrays.asList(new Object[]{1,2,"a","b"})));
//        assertEquals(Arrays.asList(new Object[]{1,0,15}), Kata.filterList(Arrays.asList(new Object[]{1,"a","b",0,15})));
//        assertEquals(Arrays.asList(new Object[]{1,2,123}), Kata.filterList(Arrays.asList(new Object[]{1,2,"aasf","1","123",123})));


    }

}
