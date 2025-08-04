# The Game of Hangman 🧠🚀
A simple Hangman game developed in Java, focused on practicing Object-Oriented Programming (OOP) and Graphical Interfaces.

## 🗃️ | Organization 
This project is organized in a modular and object-oriented way. Each class has a single responsibility, improving code readability, maintenance, and reusability. 

## 🕹️ | Classes and their functions
| Class | Responsability |
| ----- | -------------- |
| `Main` | Instantiates the game (entry point). |
| `SecretWord` | Randomly selects a word from the  ```secretWordsList```. |
| `Display` | Creates the underscore display for the secret word.|
| `InputValidation` | Validates user input to ensure it's a single character. | 
| `WordVerification` | Checks if the ```guessedLetter``` (user's input) exists in the word. |
| `Game` | Controls game flow and handles main loop. |

## ✒️ | Attributes
### SecretWord 
- ```String[] secretWordsList``` : vector that will store the possible words to be randomly chosen in ```chooseSecretWord()```.
- ```String chosenWord``` : will store the randomly chosen secret word to be guessed.
- ```Random ran``` : Random's class object used to select a random word.
- ```int ranIndex``` : will use the ran object (from `Random`) to choose and return an index from the vector ```secretWordsList```.

### Display
- ```StringBuilder line``` : will attribute the transformation of the ```chosenWord``` to chars to underscores and return.

### InputValidation 
- ```Scanner scan``` : Scanner's class object used to read user input.
- ```String guessedInput``` : The user's input that needs verification (must be only one character).

### WordVerification 
- ```String wordToVerify``` : will store the ```chosenWord``` that needs to be checked

### Game
- ```int error``` : tracks the number of incorrect guesses made by the user.
- ```int body``` : stores the maximum number of allowed errors and control the printing of body parts.
- ```String secretChosenWord``` : stores the secret word of each time that need to be guessed defined by the getter from ```SecretWord```.
- ```StringBuilder underscores``` : will store the needed unerscores for each secret word using the getter from ```Display```.
- ```WordVerification verifier``` : will store the object of the class ```WordVerification```.
- ```char guessedLetter``` : will store the ```guessedInput``` if the verification == true, and will be used in ```WordVerifycation```.
- ```boolean correctGuess``` : will use the ```verifier``` object to attribute value (if the guessed letter exists in the secret word).

## 📂 | Methods
The following methods are used in the project:
1. ```main``` Controls the game's flow, from start to end.
    - return ```void```

2. ```word``` Will randomly choose a word from the array ```String[] secretWord```
    - return ```secretWord[ranIndex]``` (index of one of the words contained in the array). 

3. ```frame``` Will use the randomly chosen word as a String and transforms it into chars and then underscores.
    - returns ```line``` (the word transformation).

4. ```wordVerification (String word, char guessedLetter)``` Verifies if the guessed letter exists in the word.
    - Parameters:
        - ```word```: the word to be guessed
        - ```guessedtLetter```: the letter entered by the user
    - return ```boolean```

5. ```DrawingMan (char correctLetter, int error)``` Controls when and which part of the body is drawn based on whether the guessed letter is correct and the current error count.
    - Parameters:
        - ```guessedLetter```: the letter entered by the user
        - ```error```: number of incorrect attempts
    - will probably return a graphic instruction

##### The man
As each part of the man appears after the user's error, an ```error``` variable is used to count the number of incorrect attempts and to control which part of the body should be added to the drawing until the word is guessed or the game ends. For example:
```java
if (correctLetter == false){
    if (error == 1){
        System.out.println("(will draw the head)");
    } else if (error == 2){
        System.out.println("(will draw the torso)");
    } (...)
}
```