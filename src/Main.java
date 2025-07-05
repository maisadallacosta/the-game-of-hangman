import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String[] secretWord;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of hangman!");

        String chosenWord = word();
        frame(chosenWord);
    }

    public static String word(){
        // declaration of the array which contains the words 
        secretWord = new String[] { 
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

    public static void frame(String word){
        String secretWord = word; // attributes the random word to a variable
        StringBuilder line = new StringBuilder(); // StringBuilder is used once Strings are imutables and to add a underscore each word's letter would be necesssary to create another String everytime

        for (int i = 0; i < secretWord.length(); i++){
            line.append("_ "); // will display an underscore for each letter in the word
        }

        System.out.println(line.toString()); 
    }
}