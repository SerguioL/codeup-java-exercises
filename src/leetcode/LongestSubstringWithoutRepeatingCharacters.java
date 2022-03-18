package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

//    Given a string s, find the length of the longest substring without repeating characters.

    public static int lengthOfLongestSubstring(String s) {

        int a_pointer = 0;//this is going to be at the beginning
        int b_pointer = 0;//this goes and make sure everything is distinct
        int max = 0;

        HashSet<Character> hash_set = new HashSet<>();//hashset can only hold 26 character

        while (b_pointer < s.length()){

            if(!hash_set.contains(s.charAt(b_pointer))){//if this a new character that has not appeared in yet then add it to the hash_set
                hash_set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hash_set.size(),max);
            } else {
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3

    }

}
