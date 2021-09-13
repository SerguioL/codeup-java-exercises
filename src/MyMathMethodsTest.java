import java.util.Scanner;

public class MyMathMethodsTest {
    public static void main(String[] args) {
        MyMathMethods mathMethods = new MyMathMethods();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a integer");
        int userNumInput1 = scanner.nextInt();
        System.out.println("Pick another integer");
        int userNumInput2 = scanner.nextInt();
        System.out.println(mathMethods.multiply(userNumInput1, userNumInput2));
    }
}
