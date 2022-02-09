package codewars;

public class Multiples3Or5 {

//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
//
//    Note: If the number is a multiple of both 3 and 5, only count it once.

    public static int solution(int number) {

        int multsOf3Sum = 0;
        int multsOf5Sum = 0;
        int multsOf3And5Sum = 0;

        if(number < 1){
            return 0;
        }

        for (int i=1; i<number; i++){

            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(i);
                multsOf3And5Sum += i;
            }else if (i % 3 == 0){
                System.out.println(i);
                multsOf3Sum += i;
            } else if(i % 5 == 0){
                System.out.println(i);
                multsOf5Sum += i;
            }

        }

        System.out.println(multsOf3Sum);
        System.out.println(multsOf5Sum);
        System.out.println(multsOf3And5Sum);

        return (multsOf3Sum + multsOf5Sum) - multsOf3And5Sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(10));//23
        System.out.println(solution(-5));//0

    }

}
