package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String getSting(){
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Enter yes");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("you a need a number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        return getInt(min,max);
    }

//    public int getInt(){
//
//    }

    public double getDouble(double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.println("you a need a number between " + min + " and " + max);
        double userInput = sc.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        return getDouble(min,max);
    }

//    public double getDouble(){
//
//    }




    //When an instance of this object is created, the scanner property should be set to anew instance of the Scanner class
    public Input(){
        this.scanner = new Scanner(System.in);
    }

}
