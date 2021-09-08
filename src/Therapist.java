import java.util.Scanner;
public class Therapist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you having a good day or bad day?");

        String userInput = scanner.nextLine();

        if(userInput.equals("good day")){
            System.out.println("Good, keep having a good day!");
        } else if(userInput.equals("bad day")){
            System.out.println("Don't worry things will get better");
        } else if (userInput.equals("")){
            System.out.println("It's ok we can talk later");
        } else{
            System.out.println("I don't know what to say.");
        }

    }

}
