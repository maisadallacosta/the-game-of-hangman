package utils;

import java.util.Scanner;

public class InputValidation {
    private Scanner scan = new Scanner(System.in);

    public char getValidInput(){
        while(true){
            System.out.print("Enter a character: ");
            String guessedInput = scan.next(); // will read the user's input firstly as a string to be verified 
            if (guessedInput.length() == 1){ // if the input is valid (just one character) it will return the char at index: 0
                return guessedInput.charAt(0);
            } else {
                System.out.println("Error. Please enter only one character.");
            }
        }
    }
}