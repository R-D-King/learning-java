import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initializing a Scanner
        Scanner input = new Scanner(System.in);

        // Declare Variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;


        // Taking user's input
        System.out.print("Enter principal: ");
        principal = input.nextDouble();

        System.out.print("Enter rate (%): ");
        rate = input.nextDouble() / 100;

        System.out.print("Enter the Number of Times Compounded Per Year: ");
        timesCompounded = input.nextInt();

        System.out.print("Enter the Number of Years: ");
        years = input.nextInt();


        // Calculating the interest
        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);
        System.out.printf("Your amount after %d year/s is $%.2f\n", years, amount);

        
        // Closing the Scanner
        input.close();
    }
}
