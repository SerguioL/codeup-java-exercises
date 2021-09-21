import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest {

    /*
    Create a class called CollectionsTest and include the following...
    TODO: create a static method, omit2s, that takes in an array list of integers.
      The method should return an arraylist of integers with the same values as the
      input arraylist but without 2s.
 */

//    public static List<Integer> omit2s(List<Integer> integers){
//        integers.removeAll(Arrays.asList(2));
//        return integers;
//
//    }

//    TODO: create a static method, createMap, that takes in two arraylists. The method should
//              return a hashmap where the keys are the elements of the first passed arraylist and are
//    connected to values of the second arraylist. Assume both input arraylists are lists of
//    strings. Assume the lengths of both input arraylists are the same


    public static HashMap createMap(List<String> list1,List<String> list2){
        HashMap<String,String> newMap = new HashMap<>();
        for(int i = 0;i< list1.size(); i++){
            newMap.put(list1.get(i), list2.get(i));
        }
        return newMap;
    }

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(2);
//        System.out.println(numbers);
//        System.out.println(omit2s(numbers));


        List<String> keys = new ArrayList<>(Arrays.asList(
                "first key",
                "second key",
                "third key",
                "fourth key"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
                "first value",
                "second value",
                "third value",
                "fourth value"
        ));

        System.out.println(createMap(keys,values));

    }


}
