## The game of hangman

#### Organization
The algorithm is organized in a modular way, where each procedure/function is responsible for carrying out a specific task in the program.

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

#### Attributes
Essential basic variables used in the program:

| Variable's name | Type | Description |
|------------------|------|-----------|
| ```error``` | int | Variable responsible for counting the user's failed attempts. |
| ```ranIndex``` | int | Variable that will contain the index of the array ```secretWord``` chose randomly. |
| ```guessedtLetter``` | char | The user's letter input. |
| ```correctLetter``` | char | Will analyze and store the letters that the user has already discovered correctly. |
| ```word```          | String | Randomly chosen word that the user has to guess. |
| ```chosenWord``` | String | Will attribute the random word (return of the function ```String word```). |
| ```secretWord``` | String[] | Array that conatins all the possible words. |
| ```line``` | StringBuilder | Will attribute the transformation of the word to char to underscores and return a value. |
| ```display``` | StringBuilder | Will atribute the return of the function ```frame``` (where ```line``` is located). |
| ```scan```| Scanner | Used to read user input. |
| ```ran```| Random | Used to select a random word. |

#### Methods
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