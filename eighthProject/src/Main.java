import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Quiz Game

        // Questions array
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};
        // Options array
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 20001", "2. 2004" , "3. 2006" , "4. 2008 "},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1.COBOL", "2. C", "3. Fortran", "4. Assembly"}
                            };
        // Declare variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("**************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("**************************");


        // Question loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("- " + questions[i]);

            // Listing all the options
            for (String option : options[i]) {
                System.out.println(option);
            }
            // Get guess from user
            System.out.print("Enter guess: ");
            guess = input.nextInt();

            // Check our guess
            if (guess == answers[i]) {
                score ++;
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
            }
            else {
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }
        }

        // Display final score
        System.out.printf("Your final score is: %d out of %d\n", score, questions.length);
        input.close();
    }
}
