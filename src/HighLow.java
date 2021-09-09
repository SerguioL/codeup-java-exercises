import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a random number between 1 and 100");
        int userInput = sc.nextInt();
        gamefunction(userInput);
    }

    public static void gamefunction(int userGuess){
        int randomNumber = randomNumber100();
        if(userGuess == randomNumber){
            System.out.println("GOOD GUESS");
        } else if(userGuess > randomNumber){
            System.out.println("LOWER");
        }else if(userGuess < randomNumber){
            System.out.println("HIGHER");
        }else{
            System.out.println("Invalid input");
        }

    }

    static public int randomNumber100(){
        return (int) Math.floor((Math.random()*100)+1);
    }

}
