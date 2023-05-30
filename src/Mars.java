public class Mars {
    public static void main(String[] args) throws InterruptedException {
       String colonyName = "Asgards";
       int shipPopulation = 300;
       double meals = 4000.0;
       boolean landing = true;

       meals = meals - (shipPopulation * 0.75);
       System.out.println(meals);
       meals = meals + (meals * .5);
       shipPopulation = shipPopulation + 5;

       String landingLocation = "The Hill";

       if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
       } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
       }
       landingCheck(1);

    }
    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        try {
            for (int minute = 0; minute <= minutesLeft; minute ++) {
                if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                    System.out.println("Keep Center");
                } else if ((minute % 2) == 0) {
                    System.out.println("Right");
                } else if ((minute % 3) == 0) {
                    System.out.println("Left");
                } else {
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        System.out.println("Landed");
        return false;
    }
}
