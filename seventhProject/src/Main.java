import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables Declaration
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int dice;
        int total = 0;


        // Welcome Message
        System.out.println("==================================");
        System.out.println("Welcome to my Dice Roller Program!");
        System.out.println("==================================");

        // Taking the number of Dice from the user
        System.out.print("Enter the number of dice you want to roll: ");
        dice = input.nextInt();

        // Checking the number of Dice
        if (dice > 0){
            for (int i = 1; i <= dice; i++) {
                int roll = rand.nextInt(1, 7);
                showDie(roll);
                System.out.printf("You rolled %d\n", roll);
                System.out.println("----------------------------------");
                // Calculating the sum
                total += roll;
            }
            System.out.printf("Total is: %d", total);
        }
        else {
            System.out.println("Number must be Greater than Zero");
        }



        input.close();
    }

    // Method to print the dice's face
    static void showDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
