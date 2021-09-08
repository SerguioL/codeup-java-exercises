import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean continueConversation;
        do {
            continueConversation = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ask Bob anything");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Do want to continue this conversation? If yes type yes or no to stop the conversation");
            String userDecisions = scanner.nextLine();
            if(userDecisions.equalsIgnoreCase("yes")){
                continueConversation = true;
            }
        }
        while(continueConversation);



    }
}
