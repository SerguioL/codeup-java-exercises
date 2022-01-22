package codewars;

public class palindrome {

    public static boolean isAPalindrome (String str){

        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isAPalindrome("racecar"));//ture
        System.out.println(isAPalindrome("stats"));//true
        System.out.println(isAPalindrome("wow"));//true
        System.out.println(isAPalindrome("dog"));//false
    }

}
