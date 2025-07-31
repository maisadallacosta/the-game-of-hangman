public class Display {
    private StringBuilder line = new StringBuilder(); // StringBuilder is used once Strings are imutables and to add a underscore each word's letter would be necesssary to create another String everytime

    public Display(String chosenWord) { // the constructor will use the chosenWord as a parameter to display the required number of underlines
        for (int i = 0; i < chosenWord.length(); i++){
            line.append("_ "); 
        }
    }

    public StringBuilder getLine() { // getter that allows access to the string with underscores of "this" time
        return this.line;
    }
}