import java.util.InputMismatchException;
import java.util.Scanner;

// Create another Java file in src called MarsExpedition
public class MarsExpedition {
    // Within public class MarsExpedition create a public MarsExpedition constructor
    public MarsExpedition() {
        // Create a new Scanner variable named input to store the user’s input.
        Scanner input = new Scanner(System.in);
        int teamSize = 0;
        // Then print a “bootup” message – it can say whatever you like. You can take multiple lines to do this,
        // you can use sleep to put some time between the logs, get creative.
        System.out.println("Mar expedition launching...");
        System.out.println("Booting up...");
        try {
            Thread.sleep(2000);
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Ready");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Ask for the user’s name, welcome them, and ask if they’re ready to begin
        System.out.println("Hi, what is your name?");
        // Write code that gets the player’s name and save it to a variable
        System.out.println("(type in your name) ");
        String name = input.nextLine();
        System.out.println("Hi," + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String userAnswer = input.nextLine();
        // Save their input and check if they said yes or no. If they said “yes”, print: “I knew you would say that.
        // You are team leader for a reason.”
        if (userAnswer.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        // Otherwise, print “Too bad you are team leader. You have to go.”
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        // ask how many people they want on their team. Use an if statement to check if their answer is greater than 2.
        // If it is, print “That’s way to many people. We can only send 2 more members.” And set the team size to be 2 anyway.
        // Check for other cases as well. The team size always needs to be exactly 2 (there are only 3 seats in the pod)
        System.out.println("How many people they want on their team ?");
        try{
            teamSize = input.nextInt();
        } catch (InputMismatchException e) {
            String next = input.next();
            System.out.println("Yor entered not an integer, try again");
        }
        if (teamSize > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members. Team will be 3 people.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members. Team will be 3 people.");
            teamSize = 2;
        } else if (teamSize == 2) System.out.println("That's a perfect sized team. Good job.");

        // The program should then log: “You are allowed to bring one snack with you.
        // What do you want to bring?”
        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.next();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        // 5. Choose a vehicle

        // Present the user with a list of vehicles that are in a lettered or numbered list.
        System.out.println("Select the vehicle:" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = input.next();

        System.out.println(vehicleChoice);
    }

}
