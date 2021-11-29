package codewars;

public class SumOfAngles {
    public static int sumOfAngles(int n) {
        int sum = (n - 2) * 180;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAngles(3));//180
        System.out.println(sumOfAngles(4));//360
    }
}
