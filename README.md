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
| ```word```          | String | Randomly chosen word that the user has to guess. |
| ```guessedtLetter``` | char | The letter input by the user. |
| ```correctLetter``` | char | Will analyze and store the letters that the user has already discovered correctly. |
| ```error``` | int | Variable responsible for counting the user's failed attempts. |
| ```maxErrors```| int | Variable that will control the number of possible errors according to the word of the turn. |
| ```scan```| Scanner | Used to read user input. |
| ```random```| random | Used to select a random word. |

#### Methods
The following methods are likely to be used in the project:
1. ```main``` Controls the game's flow, from start to end.
    - return ```void```

2. ```ChooseWord``` will randomly choose a word from the available ```<ArrayList>```
    - return ```String``` (a random word from the list)

3. ```WordVerification (String word, char correctLetter)``` Verifies if the guessed letter exists in the word.
    - Parameters:
        - ```word```: the word to be guessed
        - ```guessedtLetter```: the letter entered by the user
    - return ```boolean```

4. ```DrawingMan (char correctLetter, int error)``` Controls when and which part of the body is drawn based on whether the guessed letter is correct and the current error count.
    - Parameters:
        - ```guessedLetter```: the letter entered by the user
        - ```error```: number of incorrect attempts
    - will probably return a graphic instruction