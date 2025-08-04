import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Slot Machine

        // Declare variables
        Scanner input = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;


        // Welcome message
        System.out.println("=========================");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🔔 🍒 🍉 ⭐ 🦄 ");
        System.out.println("=========================");

        // play if balance > 0
        while (balance > 0){
            System.out.println("Current balance: $" + balance);

            // Enter bet amount
            System.out.print("Place Your Bet Amount: ");
            bet = input.nextInt();
            input.nextLine();

            // Check balance and subtract chosen amount
            if (bet > balance){
                System.out.println("Insufficient balance");
                continue;
            }
            else if (bet <=0) {
                System.out.println("Bet must be greater than zero");
                continue;
            }
            else  {
                balance -= bet;
            }

            // Spin row
            System.out.println("----- Spinning... -----");
            row = spinRow();

            // Show row
            printRow(row);

            // Payout
            payout = getPayout(row, bet);
            if (payout > 0){
                System.out.printf("You Won $%d\n", payout);
                balance += payout;
            }
            else {
                System.out.println("You Lost!!!");
            }
            // Play again
            System.out.print("Do You Want to Play Again, You Gambling Addict? (y/N)?: ");
            playAgain = input.nextLine().toUpperCase();
            if (!playAgain.equals("Y")){
                break;
            }
        }
        // Display exit message
        System.out.println("*********************************");
        System.out.println("Your Final balance is: $" + balance);
        System.out.println("*********************************");
        System.out.println("Thanks for Your Patronage, Dumbass");
        System.out.println("BYE!!!");

        input.close();
    }
    // spinRow used to spin the row (Obviously)
    static String[] spinRow(){

        String[] symbols = {"🔔", "🍒", "🍉", "⭐", "🦄"};
        String[] row = new String[3];
        Random rand = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }

        return row;
    }
    // printRow outputs the row to the user
    static void printRow(String[] row){
        System.out.println("****************");
        System.out.println("| " + String.join(" | ", row) + " |");
        System.out.println("****************");
    }
    // getPayout gives money to the user when the symbols match
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                case "🦄" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🦄" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🦄" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
