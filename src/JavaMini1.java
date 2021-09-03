public class JavaMini1 {
    public static void main(String[] args) {
//        write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.

// =============================================================

        int[] input ={1, 1, 4, -64, 36, -5};

        for(int i =0; i < input.length; i++) {

            if (input[i] > 0) {
                System.out.printf("The number %s is positive %n", input[i]);
            } else {
                System.out.printf("The number %s is negative %n", input[i]);
            }
        }



    }
}
