package codewars;

public class KeepHydrated {

    public static int liters(double time)  {
        //Your code goes here! Hint: You should change that -1
        return (int) (time * .5);

    }

    public static void main(String[] args) {
        System.out.println(liters(3));//1
        System.out.println(liters(6.7));//3
        System.out.println(liters(11.8));//5

    }

}
