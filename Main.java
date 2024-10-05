import java.util.Random;
import java.util.Scanner;
class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        while (true) {
            System.out.println("enter your guess(1-100): ");

            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println(("correct you win"));

            } else if (randomNumber > playerGuess) {
                System.out.println("nope the number is higher . try again...");
            } else {
                System.out.println("nope the number is lower" +
                        " . try again...");
            }
        }
    }
}