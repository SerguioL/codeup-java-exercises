package codewars;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MostFrequentWeekdays {

//    Output: The list of most frequent days sorted by the order of days in week (from Monday to Sunday).
//
//    Preconditions:
//
//    Week starts on Monday.
//    Year is between 1583 and 4000.
//    Calendar is Gregorian.
//            Examples (input -> output):
//            * 2427 -> ['Friday']
//            * 2185 -> ['Saturday']
//            * 2860 -> ['Thursday', 'Friday']


    public static String[] mostFrequentDays(int year) {

        List<String> days = new ArrayList<>();
        int nextIndex = 0;

        for (LocalDate date = LocalDate.of(year, 12, 31);
             date.getDayOfWeek() != LocalDate.of(year - 1, 12, 31).getDayOfWeek();
             date = date.minusDays(1)) {

            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) nextIndex = days.size();//https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
            days.add(nextIndex, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        }
        return days.toArray(new String[days.size()]);
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(mostFrequentDays(1770)));

        System.out.println(Arrays.toString(mostFrequentDays(1770)));//{"Monday"}
        System.out.println(Arrays.toString(mostFrequentDays(1785)));//{"Saturday"}
        System.out.println(Arrays.toString(mostFrequentDays(1901)));//{"Tuesday"}
        System.out.println(Arrays.toString(mostFrequentDays(2135)));//{"Saturday"}
        System.out.println(Arrays.toString(mostFrequentDays(3043)));//{"Sunday"}
        System.out.println(Arrays.toString(mostFrequentDays(2001)));//{"Monday"}
        System.out.println(Arrays.toString(mostFrequentDays(3150)));//{"Sunday"}
        System.out.println(Arrays.toString(mostFrequentDays(3230)));//{"Tuesday"}
        System.out.println(Arrays.toString(mostFrequentDays(2016)));//{"Friday", "Saturday"}
        System.out.println(Arrays.toString(mostFrequentDays(1986)));//{"Wednesday"}
        System.out.println(Arrays.toString(mostFrequentDays(3361)));//{"Thursday"}
        System.out.println(Arrays.toString(mostFrequentDays(1910)));//{"Saturday"}
        System.out.println(Arrays.toString(mostFrequentDays(1968)));//{"Monday", "Tuesday"}
        System.out.println(Arrays.toString(mostFrequentDays(1794)));//{"Wednesday"}
        System.out.println(Arrays.toString(mostFrequentDays(1984)));//{"Monday", "Sunday"}
        System.out.println(Arrays.toString(mostFrequentDays(2000)));//{"Saturday", "Sunday"}
    }



}
