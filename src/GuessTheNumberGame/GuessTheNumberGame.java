package GuessTheNumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("=== Guess the Number Game ===");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);
        System.out.println("Try to guess it!");

        int guess = -1;
        int attempts = 0;

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }
        }

        System.out.println("Game over. Thanks for playing!");
        // scanner.close(); // optional
    }
}
