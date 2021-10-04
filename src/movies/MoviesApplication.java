package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void mainMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n");
        int userInput = scanner.nextInt();
        if(userInput == 0){
            System.out.println("Enter your choice: " + userInput);
            System.out.println("Closing main menu");

        }else if(userInput == 1){
            System.out.println("Enter your choice: " + userInput);
            for (Movie m : MoviesArray.findAll()){
                System.out.println(m.getName() + " -- " + m.getCategory());
            }
            System.out.println("\n");
            mainMenu();
        }else if(userInput == 2){
            System.out.println("Enter your choice: " + userInput);
            Movie.filterMovies("animated");
            System.out.println("\n");
            mainMenu();
        }else if(userInput == 3){
            System.out.println("Enter your choice: " + userInput);
            Movie.filterMovies("drama");
            System.out.println("\n");
            mainMenu();
        }else if(userInput == 4){
            System.out.println("Enter your choice: " + userInput);
            Movie.filterMovies("horror");
            System.out.println("\n");
            mainMenu();
        }else if(userInput == 5){
            System.out.println("Enter your choice: " + userInput);
            Movie.filterMovies("scifi");
            System.out.println("\n");
            mainMenu();
        }

    }

    public static void main(String[] args) {

        mainMenu();
    }

}
