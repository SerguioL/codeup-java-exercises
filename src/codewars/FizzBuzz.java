package codewars;

public class FizzBuzz {

    public static String fizzbuzz(int num){
        if((num % 3 == 0 )&& (num % 5 == 0)){
            return "fizzbuzz";
        } else if(num % 3 == 0){
            return "fizz";
        } else if(num % 5 == 0){
            return "buzz";
        }
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(3));//"fizz"
        System.out.println(fizzbuzz(5));//"buzz"
        System.out.println(fizzbuzz(15));//"fizzbuzz"
        System.out.println(fizzbuzz(2));//"2"
    }

}
