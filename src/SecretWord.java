import java.util.Random;

public class SecretWord {
    // class attributes
    private String[] secretWordsList; // vector that will store the possible words to be randomly chosen in the secretWord method
    private String chosenWord; // variable that will store The randomly chosen secret word to be guessed 

    public SecretWord() { // constructor that initialises the class attributes when the object is created
        this.secretWordsList = new String[] { // creation and storage of a vector with words that will be chosen randomly in each game ("this")
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

        this.chosenWord = chooseSecretWord(); // the chosenWord of "this" time will store the randomly chosen word at chooseSecretWord
    }

    private String chooseSecretWord() {
        Random ran = new Random(); // object that will be responsable for randomly choose a word from the vector secretWordsList
        
        int ranIndex = ran.nextInt(secretWordsList.length); // variable that will use the ran object to choose a index from the vector secretWordsList

        return secretWordsList[ranIndex]; // will return a random index of the vector (consequently a random word) each play
    } 

    public String getWord() { // getter that allows access to the secret word stored in the chosenWord attribute.
        return this.chosenWord;
    }
}