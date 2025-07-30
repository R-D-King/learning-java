import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        // Initializing scanner, random numbers, and variables
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min, max + 1);

        // Initial message
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        // Checking the number in a loop
        do{
            System.out.print("Enter a Guess: ");
            guess = input.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("You guessed too low, Try again");
            }
            else if(guess > randomNumber){
                System.out.println("You guessed too high, Try again");
            }else{
                System.out.printf("You guessed correctly! The number was: %d\n", randomNumber);
                System.out.printf("Number of attempts: %d\n", attempts);
            }
        }while(guess != randomNumber);
        input.close();
    }
}
