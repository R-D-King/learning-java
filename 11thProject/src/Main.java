import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Supported file types are : (.wav, .au, .aiff)
        String filePath = "src/Tame Impala - Let It Happen.wav";
        File myFile = new File(filePath);
        try (Scanner input = new Scanner(System.in); AudioInputStream audio = AudioSystem.getAudioInputStream(myFile)){

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            // Welcome message
            System.out.println("Audio file opened successfully! 👍");
            System.out.println("Now you just have to \"Let It Happen\" 😍");

            // Setting controls
            String userInput = "";
            while (!userInput.equals("Q")){

                System.out.println("Controls: P = Play, S = Stop (Pause), R = Reset, Q = Quit, Guitar part ❤ = G");
                System.out.print("Enter Your Choice: ");
                userInput = input.next().toUpperCase();

                switch (userInput) {
                    case "P" -> {
                        clip.start();
                        System.out.println("Yeaaaaaaaaaaaahhh!!! 🤩💃");
                    }
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    case "G" -> {
                        clip.setMicrosecondPosition(375000000);
                        System.out.println("************** Get Ready!!! **************");
                    }


                    default -> System.out.println("------- Invalid Choice -------");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio File");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio file");
        }
        catch (IOException e) {
        System.out.println("Error opening file");
        }
        finally {
            System.out.println("Bye Bye 😘");
        }
    }
}
