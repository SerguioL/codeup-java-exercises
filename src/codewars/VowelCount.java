package codewars;

public class VowelCount {

    public static int getCount(String str) {

//        Return the number (count) of vowels in the given string.
//
//        We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//                The input string will only consist of lower case letters and/or spaces.

        int vowelsCount = 0;

        for (char c : str.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelsCount += 1;
            }
        }
        return vowelsCount;
    }

    //different solutions

//        public static int getCount(String str) {
//            return str.replaceAll("(?i)[^aeiou]", "").length();
//        }

//        public static int getCount(String str) {
//            return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
//        }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));//5
    }


}
