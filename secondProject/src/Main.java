import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int option;
        double conversionFactor;
        conversionFactor = 0.45359237;

        // Welcome message
        System.out.println("Welcome to the Java Weight Conversion Program!");

        // User choice
        System.out.println("Choose an Option:");
        System.out.println("1. Convert From lbs to kgs");
        System.out.println("2. Convert From kgs to lbs");
        option = input.nextInt();

        // Converting
        if (option == 1) {
            System.out.print("Enter Weight in lbs: ");
            weight = input.nextDouble();
            convertedWeight = weight * conversionFactor;
            System.out.printf("%.2f kgs", convertedWeight);
        } else if (option == 2) {
            System.out.print("Enter Weight in kgs: ");
            weight = input.nextDouble();
            convertedWeight = weight / conversionFactor ;
            System.out.printf("%.2f lbs", convertedWeight);
        }else{
            System.out.println("Invalid Option");
        }
        // Closing the Scanner Object
        input.close();
    }
}
