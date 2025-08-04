package utils;

public class WordVerification {
    private String wordToVerify; // variable that will be used in the constructor to store the chosenWord that needs to be checked

    public WordVerification(String wordToVerify) { // the constructor will receive the chosenWord stored in wordToVerify as a parameter.
        this.wordToVerify = wordToVerify;
    }

    public boolean isLetterInWord(char guessedLetter){ // boolean method that will check whether the user's character is present in the secret word or not (and return)
        for (int i = 0; i < wordToVerify.length(); i++){ 
            if (wordToVerify.charAt(i) == guessedLetter){ 
                return true;
            } 
        }
        return false; // returns false if the letter input was not find anywhere in the word
    }
}