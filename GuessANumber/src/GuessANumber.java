import java.util.Scanner;
import java.util.Random;
public class GuessANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to Guess A Number game! Try to guess the number between 1 and 100.");

        while( userGuess != secretNumber){
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < secretNumber) {
                System.out.println("Try again. The secret number is greater than your guess.");
            } else {
                System.out.println("Try again. The secret number is less than your guess.");
            }

        }
        scanner.close();
    }
}
