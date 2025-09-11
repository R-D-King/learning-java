import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hangman Game
        System.out.println("#######################");
        System.out.println("Welcome to Java Hangman");
        System.out.println("You get 6 Wrong Guesses");
        System.out.println("#######################");

        // Variables
        String word = "pizza";
        Scanner input = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        int triesLeft = 6;

        // Get the word state
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        while (triesLeft <= 6 && triesLeft > 0) {

            // Showing the Hangman
            System.out.print(getHangmanArt(triesLeft));

            System.out.printf("You got: %s tries left\n", triesLeft);

            // Formating the word
            System.out.print("Word:");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            // Taking user's input
            System.out.print("Guess a letter: ");
            char guess = input.next().toLowerCase().charAt(0);

            // Check the guess
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess!");

                // Remove the correctly guessed letter
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                // Win condition
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(triesLeft));
                    System.out.println("You WIN!!!!!!!!!!!!!");
                    System.out.printf("The word was: %s\n",word);
                    break;
                }
            } else {
                triesLeft--;
                System.out.println("Wrong Guess!");
            }

        }

        // Lose condition
        if(triesLeft <= 0){
            System.out.printf("%s tries left", triesLeft);
            System.out.println(getHangmanArt(triesLeft));
            System.out.println("Game Over!");
            System.out.printf("The word was: %s\n",word);
        }

        input.close();
    }
    static String getHangmanArt(int triesLeft) {
        return switch (triesLeft){
            case 6 -> """
                    
                    
                    
                    """;
            case 5 -> """
                       o
                    
                    
                    """;
            case 4 -> """
                       o
                       |
                    
                    """;
            case 3 -> """
                       o
                      /|
                    
                    """;
            case 2 -> """
                       o
                      /|\\
                    
                    """;
            case 1 -> """
                       o
                      /|\\
                      /
                    """;
            case 0 -> """
                       o
                      /|\\
                      / \\
                    """;
            default -> "";
        };
    }
}
