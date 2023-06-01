public class Mars {
    // Create a public static void main(String[] args) function
    public static void main(String[] args) throws InterruptedException {

        // * 1. Variables & Data Types

        // Create a string variable named colonyName, and set it equal to your desired name
       String colonyName = "Asgards";
        // Create an int variable named shipPopulation, and set it equal to 300
       int shipPopulation = 300;
        // Create a double variable named meals, and set it equal to 4000.00
       double meals = 4000.0;
        // Create a boolean variable named landing, and set it equal to true
       boolean landing = true;

        // * 2. Mathematical Operators

        // Calculate how many meals are left after landing using mathematical operators
       meals = meals - (shipPopulation * 0.75);
        // Print the number of meals that are left.
       System.out.println(meals);
        // An extra crate of food is found increasing meals by 50%! Reassign the value of meals to be 50% higher than
        // it was using a mathematical expression.
       meals = meals + (meals * .5);
        // The births onboard are very perfectly timed and 5 more babies join the population during the 2 days it takes
        // to land. Reassign shipPopulation to reflect that.E
       shipPopulation = shipPopulation + 5;

        // * 3. Conditional Love

        // Now create a String value called landingLocation and set it equal to “The Hill” or “The Plain” or “The Ocean”.
       String landingLocation = "The Hill";
        // Create an if-else statement that checks to see if the landingLocation is equal to “The Plain” (ignoring case)
       if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
       } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
       }

        // * 5. Looping Function

        // Back inside the main method, reassign the value of landing to be the invocation of the landingCheck() method
        // passing in any integer for the number of minutes left until landing.
       landing = landingCheck(5);
        // Instantiate a GuessingGame objectEle
       new GuessingGame();
        // Instantiate a MarsExpedition object
       new MarsExpedition();
        // Instantiate a FindingsList object
       new FindingList();
    }

    // Outside the main method, create a public function called landingCheck that returns a boolean value and takes in
    // an int parameter called minutesLeft.
    // This method will print “directions” to the console based on minutes left until touchdown.
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        try {
            // Inside landingCheck, create a for loop that initializes an int variable called minute which is set to 0.
            // The loop should increment by 1 until it reaches the number of minutesLeft.
            for (int minute = 0; minute <= minutesLeft; minute ++) {
                // Inside the loop, create an if statement. If the number of minutes is even print “Right”,
                // if the number of minutes is divisible by 3 print “Left”, if the number is divisible by both 2 and 3
                // print “Keep Center”. If the number isn’t divisible by any of those factors, print “Calculating”.
                if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                    System.out.println("Keep Center");
                } else if ((minute % 2) == 0) {
                    System.out.println("Right");
                } else if ((minute % 3) == 0) {
                    System.out.println("Left");
                } else {
                    System.out.println("Calculating");
                }
                // Call Thread.sleep(250) after the conditional but before the end of the loop to slow down the
                // console on each loop – it will add to the game ambience.
                Thread.sleep(250);
            }
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        // Print “Landed” after the for loop. And then return the boolean false – we’ll save this to the landing
        // variable in the main method since landing will be complete once this function completes.
        System.out.println("Landed");
        return false;
    }
}
