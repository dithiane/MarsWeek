import java.util.Scanner;

// Create another Java file in src called MarsExpedition
public class MarsExpedition {
    // Within public class MarsExpedition create a public MarsExpedition constructor
    public MarsExpedition() {
        // Create a new Scanner variable named input to store the user’s input.
        Scanner input = new Scanner(System.in);
        // Then print a “bootup” message – it can say whatever you like. You can take multiple lines to do this,
        // you can use sleep to put some time between the logs, get creative.
        System.out.println("Mar expedition launching...");
        System.out.println("Booting up...");
        try {
            Thread.sleep(4000);
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Ready");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
