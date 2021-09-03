public class JavaMini2 {
    public static void main(String[] args) {
        //if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user

//==========================================================================

        int num = -200;
        num = num * 2;
        if (num > 100){
            System.out.printf("The number %s is greater then 100", num);
        } else if (num < -100){
            System.out.printf("The number %s is less then -100", num);
        } else {
            System.out.printf("The number %s is between -100 and 100", num);
        }

    }
}
