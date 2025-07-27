import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaring variables
        Scanner input = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        // Taking user's input
        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = input.next().toUpperCase();

        // Checking conditions & Performing the conversion
        // the conversion formula was wrong in the video
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        // giving out to the user
        System.out.printf("New temperature: %.2f°%s%n", newTemp, unit);

        // finally closing the scanner
        input.close();
    }
}
