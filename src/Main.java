import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int error = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of hangman!");

        String chosenWord = word(); // attributes the random word to a variable
        StringBuilder display = frame(chosenWord);

        while (true) { // while the game is still up to play: 
            System.out.println(display.toString());

            System.out.print("Enter a character: ");
            char guessedLetter = scan.next().charAt(0); // will read the user's input as a String and then use the char at index: 0 (supossed to be the only input)

            if (wordVerification(chosenWord, guessedLetter)){ // if the function returns true:
                for (int i = 0; i < chosenWord.length(); i++){ // according to the word's length
                    if (chosenWord.charAt(i) == guessedLetter){ // if the user's char is equal to any char of the String, the underscore will be replaced by the matching letter
                        display.setCharAt(i * 2, guessedLetter); // since the display indices are even for spaces and odd for characters, i must be multiplied by 2
                    }
                }
                System.out.println("Good work guessing!"); // will print if the input was correct
            } else {
                if (error > chosenWord.length()){ // checks if the number of user errors is not already overflowing
                    System.out.println("You have lost all your attempts!");
                } else {
                    System.out.println("Wrong guess! Try again.");
                    error++; // adds to the variable so as to have a control
                }
            }
        }
    }

    public static String word(){
        // declaration of the array which contains the words 
        String[] secretWord = new String[] { 
            "algorithm", 
            "recursion", 
            "variable", 
            "function", 
            "object", 
            "class", 
            "inheritance", 
            "polymorphism", 
            "encapsulation"
        };

        Random ran = new Random(); // object that will be responsable for choosing a word randomly from the array
        int ranIndex = ran.nextInt(secretWord.length); // variable that will use the ran object to choose a index from the array 

        return secretWord[ranIndex]; // will return a random index of the array (a random word) each play
    }

    public static StringBuilder frame(String word){
        String chosenWord = word; // attributes the random word to a variable
        StringBuilder line = new StringBuilder(); // StringBuilder is used once Strings are imutables and to add a underscore each word's letter would be necesssary to create another String everytime

        for (int i = 0; i < chosenWord.length(); i++){
            line.append("_ "); // will display an underscore for each letter in the word
        }

        return line;
    }

    public static boolean wordVerification(String word, char guessedLetter){
        String chosenWord = word;  // attributes the random word to a variable 

        for (int i = 0; i < chosenWord.length(); i++){ 
            if (chosenWord.charAt(i) == guessedLetter){ // checks if the character the user typed is present in the word
                return true;
            } 
        }

        return false; // if the letter input was not find anywhere in the word
    }
}