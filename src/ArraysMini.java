import java.util.Arrays;

public class ArraysMini {

    public static void main(String[] args) {
//        TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
//        Find the sum of all five double values using an enhanced for loop

//        double [] number = {32.1, 98.2, 67.7, 9.5, 84.1};

        double [] numbers = new double[5];
        numbers[0]=32.1;
        numbers[1]=98.2;
        numbers[2]=67.7;
        numbers[3]=9.5;
        numbers[4]=84.1;

        System.out.println(Arrays.toString(numbers));

        double sum = 0;

        for(double number : numbers){
            sum += number;
        }
        System.out.println(sum);

    }

}
