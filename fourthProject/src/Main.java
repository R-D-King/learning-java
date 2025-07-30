import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initializing a scanner and variables
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;
        boolean validOperation = true;

        // Taking user's input
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /, ^): ");
        operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        // Determining the operator
        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0){
                    System.out.println("Cannot divide by zero");
                    validOperation = false;
                }
                else{
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        // Giving the result to the user
        if (validOperation){
            System.out.println(result);
        }

        // Closing the scanner
        input.close();
    }
}
