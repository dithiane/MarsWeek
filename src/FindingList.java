    import java.util.*;

            // * 1. File Setup
    public class FindingList {
        // Within public class FindingsList create a public FindingsList constructor
        public FindingList() throws InterruptedException {

            // * 2. Storing samples

            // Use Thread.sleep(500) to stop the terminal for half a second while you’re on your expedition
            Thread.sleep(500);
            // Print a welcome back message
            System.out.println("Welcome back from your expedition. Time to catalog everything you found.");
            // Create an array that will store string s
            ArrayList<String> s = new ArrayList<>();
            // Add four rocks into your array - rock, weird rock, smooth rock, and not rock
            s.add("rock");
            s.add("weird rock");
            s.add("smooth rock");
            s.add("not rock");
            // Print a message confirming that everything downloaded and print the list of rocks
            System.out.println("Rock data downloaded.");
            System.out.println(s);
            // The computer realizes there’s a non-rock in the list – have it print a message about needing to delete it
            System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");
            // The remove “not rock” from the list
            s.remove("not rock");
            // Print the list again and then a message that says “Perfect”
            System.out.println(s);
            System.out.println("Perfect");

            // * 3. Fossils

            // Use Thread.sleep(1000) to stop the terminal for a second while it loads in fossil data
            Thread.sleep(1000);
            // Create a HashMap that stores elements with 2 attributes (these will be a name and a description),
            // both of which are strings
            HashMap<String, String> fossil = new HashMap<>();
            // Add 3 fossils and their description to the HashMap
            fossil.put("bird", "The fossil has wings implying it was capable of flight");
            fossil.put("fish", "The fossil is vaguely fish shaped implies there was once water");
            fossil.put("tooth", "The tooth from an unknown fossil");
            // Then print “Fossil data downloaded”
            System.out.println("Fossil data downloaded");
            // Ask “Which of the fossils would you like to learn more about? (Bird, fish, or tooth)”
            System.out.println("Which of the fossils would you like to learn more about? (bird, fish, or tooth)");
            Scanner input = new Scanner(System.in);
           // Save their choice and print information about which fossil they chose using the information stored in your HashMap
            String userChoice = input.nextLine();
            System.out.println("Fossil description: " + userChoice + " - " + fossil.get(userChoice));

            // * 4. Special supply lists

            // Use Thread.sleep(700) to stop the terminal while it figures out what special supplies have been used
            Thread.sleep(700);
            // Create an empty HashSet to store the special supplies that you brought on the expedition
            HashSet<String> supplies = new HashSet<>();
            // Use the add method to store at least 3 super important items
            supplies.add("Teleporter");
            supplies.add("Stun gun");
            supplies.add("Insta-Heal Capsules");
            // Print the contents of the set
            PrintSource("Supplies Before Expedition", supplies);
            // Now, use the remove method to remove one of your items
            supplies.remove("Stun gun");
            // Print the remaning supplies
            PrintSource("Supplies After Expedition", supplies);
        }
        public void PrintSource(String title, HashSet<String> source) {
            System.out.println(title);
            for (String val : source) {
                System.out.println(val);
            }
        }
}
