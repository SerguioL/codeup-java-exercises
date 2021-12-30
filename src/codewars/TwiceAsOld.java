package codewars;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){

        int sonTearsTwice = sonYears * 2;

        return Math.abs(dadYears - sonTearsTwice);

    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30, 0));//30
        System.out.println(TwiceAsOld(30, 7));//16
        System.out.println(TwiceAsOld(45, 30));//15
    }

}
