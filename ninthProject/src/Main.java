import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Rock Paper Scissors Game

        // Declare variable
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // Welcome message
            System.out.println("==========================================");
            System.out.println("Welcome to the Rock, Paper, Scissors GAME!");
            System.out.println("==========================================");

            // Get choice from user
            System.out.print("Enter your choice (rock, paper, scissors): ");
            playerChoice = input.nextLine().toLowerCase();

            // Check user input
            if (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")) {
                System.out.println("-------- Invalid choice --------");
                continue;
            }

            // Get random choice for the computer
            computerChoice = choices[rand.nextInt(choices.length)];
            System.out.printf("Computer choice: %s\n", computerChoice);

            // Check win condition
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            // Ask to play again
            System.out.println("************************************");
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // Goodbye message
        System.out.println("Thanks for playing!");
        input.close();
    }
}
