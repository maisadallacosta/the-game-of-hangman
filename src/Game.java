import utils.*;

public class Game {
    private int error = 0; // variable that tracks the number of incorrect guesses made by the user
    private int body = 6; // will control the maximum number of allowed errors
    private String chosenWord; // will store the word of each time that need to be guessed
    private StringBuilder display; // will store the needed unerscores for each secret word 
    private WordVerification verifier; // variable that will store the object of the class WordVerification (not its value/return)

    public Game() {
        System.out.println("Welcome to the game of hangman!");

        SecretWord word = new SecretWord(); // creation of a new object of the SecretWord class
        chosenWord = word.getWord(); // use the public method getWord() to access the random word and store it in the variable

        Display frame = new Display(chosenWord); // creation of a new object of the class Display and giving the parameter (chosenWord)
        display = frame.getLine(); // attrbiutes the Display's getLine() return to a variable

        verifier = new WordVerification(chosenWord); // creation of the object 

        startGame();
    }

    private void startGame(){
        while (true) { // while the game is still up to play: 
            System.out.println(display.toString()); // print the array in String way

            InputValidation validation = new InputValidation(); // creation of the object to handle user input
            char guessedLetter = validation.getValidInput(); // "getting" a validated character input from the user and storing at the variable

            boolean correctGuess = verifier.isLetterInWord(guessedLetter); // attributing value to the variable by checking if the guessed letter exists in the secret word 

            if (correctGuess){ // if the wordVerification class returns true:
                for (int i = 0; i < chosenWord.length(); i++){ // according to the word's length
                    if (chosenWord.charAt(i) == guessedLetter){ // if the user's char is equal to any char of the String, the underscore will be replaced by the matching letter
                        display.setCharAt(i * 2, guessedLetter); // since the display indices are even for spaces and odd for characters, i must be multiplied by 2
                    }
                }
                System.out.println("Good work guessing!"); // will print if the input was correct
            } else {
                if (error >= body){ // checks if the number of user errors is not already overflowing
                    System.out.println("You have lost all your attempts!");
                    break; // breaks the loop While when the player loses
                } else {
                    System.out.println("Wrong guess! Try again.");
                    error++; // adds to the variable so as to have a control
                }
            }

            if (display.indexOf("_ ") == -1){ // if the method does not find any underscore, it will return -1 (the word was fully guessed)
                System.out.println("You won! The guessed word was: " + chosenWord);
                break; // breaks the loop while when the player wons
            }
        }
    }
}