import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaring variables
        double balance = 0;
        boolean isRunning = true;
        int choice;


        // Display menu
        while (isRunning) {
            System.out.println("==================================");
            System.out.println("Welcome to the Banking Application");
            System.out.println("==================================");
            System.out.println("Please enter your choice");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("==================================");

            System.out.print("Please enter a number between 1 and 4: ");
            choice = input.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("------- Invalid choice -------");
            }
        }

        // Exit message
        System.out.println("==================================");
        System.out.println("Thank you for using our Banking Application");
        System.out.println("Bye! 😊");
        System.out.println("==================================");
        input.close();
    }
    // Show balance
    static void showBalance(double bal) {
        System.out.println("==================================");
        System.out.printf("Your Balance is: $%.2f\n", bal);
    }

    // Deposit
    static double deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("------- Invalid amount -------");
            System.out.println("Deposit amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    // Withdraw
    static double withdraw(double bal) {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("------- Invalid amount -------");
            System.out.println("Withdraw amount cannot be negative");
            return 0;
        }
        else if (amount > bal) {
            System.out.println("------- Invalid amount -------");
            System.out.println("Withdraw amount cannot be greater than balance");
            return 0;
        }
        else {
            return amount;
        }
    }
}
