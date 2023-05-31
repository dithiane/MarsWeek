import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
// Create another Java file in src called GuessingGame
public class GuessingGame {
    // Within public class GuessingGame create a constructor
    public GuessingGame() {
        // In your file, add code that displays a greeting to the player
        System.out.println("Hi, How are you?");
        // Write code that gets the player’s name and save it to a variable
        System.out.println("(type in your name) ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi, " + name + ", Let's guessing number between 1 and 100!");

        int times = 0;
        int savedNumber = new Random().nextInt(100);

        while (true) {
            int userNumber;
            try {
                userNumber = input.nextInt();
            } catch (InputMismatchException e) {
                String next = input.next();
                System.out.println("Yor entered not an integer, try again");
                continue;
            }
            if (userNumber < 1 || userNumber > 100) {
                System.out.println(userNumber + " is not in the [0...100] range");
                continue;
            }
            times += 1;
            if (userNumber == savedNumber) {
                System.out.println("You win, " + name + ", in " + times + " tries!");
                break;
            } else if (userNumber < savedNumber) System.out.println("Your guess is too low, try again.");
            else System.out.println("Your guess is too high, try again.");
        }
    }
}
