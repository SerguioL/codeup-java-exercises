import java.util.Scanner;

public class myIOExperiment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameInput = scanner.nextLine();
//        System.out.println("Your name is " + nameInput);
        System.out.printf("Your name is %s", nameInput);

    }

}
