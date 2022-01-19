package codewars;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

//        Let's play! You have to return which player won! In case of a draw return Draw!.
//
//        Examples:
//
//        rps('scissors','paper') // Player 1 won!
//        rps('scissors','rock') // Player 2 won!
//        rps('paper','paper') // Draw!

        if (p1.equalsIgnoreCase(p2)) {
            return "Draw!";
        } else if(p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors")){
            return "Player 1 won!";
        } else if(p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper")){
            return "Player 1 won!";
        } else if(p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock")){
            return "Player 1 won!";
        } else if(p2.equalsIgnoreCase("rock") && p1.equalsIgnoreCase("scissors")){
            return "Player 2 won!";
        } else if(p2.equalsIgnoreCase("scissors") && p1.equalsIgnoreCase("paper")){
            return "Player 2 won!";
        } else if(p2.equalsIgnoreCase("paper") && p1.equalsIgnoreCase("rock")){
            return "Player 2 won!";
        } else {
            return "?";
        }

    }

    // different solutions (NOY M SOLUTION)
//    public static String rps(String p1, String p2) {
//        if(p1 == p2) return "Draw!";
//        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
//        return "Player " + p + " won!";
//    }

    public static void main(String[] args) {

        System.out.println(rps("rock", "scissors"));//"Player 1 won!"
        System.out.println(rps("scissors", "paper"));//"Player 1 won!"
        System.out.println(rps("paper", "rock"));//"Player 1 won!"
        System.out.println(rps("scissors", "rock"));//"Player 2 won!"
        System.out.println(rps("paper", "scissors"));//"Player 2 won!"
        System.out.println(rps("rock", "paper"));//"Player 2 won!"
        System.out.println(rps("scissors", "scissors"));//"Draw!"
        System.out.println(rps("paper", "paper"));//"Draw!"
        System.out.println(rps("rock", "rock"));//"Draw!"
    }

    }


