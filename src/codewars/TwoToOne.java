package codewars;

public class TwoToOne {

//    Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
//
//            Examples:
//    a = "xyaabbbccccdefww"
//    b = "xxxxyyyyabklmopq"
//    longest(a, b) -> "abcdefklmopqwxy"
//
//    a = "abcdefghijklmnopqrstuvwxyz"
//    longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

    public static String twoToOne (String s1, String s2) {
        //https://www.geeksforgeeks.org/stream-distinct-java/#:~:text=distinct()%20in%20Java,-Difficulty%20Level%20%3A%20Medium&text=distinct()%20returns%20a%20stream,methods%20to%20get%20distinct%20elements.
        //works with chars
        String str = s1 + s2;
        StringBuilder strB = new StringBuilder();
        str.chars().distinct().forEach(c -> strB.append((char) c));
        return strB.toString();
    }

    public static void main(String[] args) {
        System.out.println(twoToOne("aretheyhere", "yestheyarehere"));//"aehrsty"
        System.out.println(twoToOne("loopingisfunbutdangerous", "lessdangerousthancoding"));//"abcdefghilnoprstu"
        System.out.println(twoToOne("inmanylanguages", "theresapairoffunctions"));///"acefghilmnoprstuy"
    }

}
