public class Conditions {

    // run() method to test condition examples
    public static void run() {

        int age = 20;
        boolean hasTicket = true;

        // if statement
        System.out.println("if statement example:");
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        System.out.println(); // empty line

        // if-else statement
        System.out.println(" if-else statement example:");
        if (age >= 18) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        System.out.println();

        // if-else if-else ladder
        System.out.println(" if-else if-else example:");
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
        System.out.println();

        // Nested if
        System.out.println(" Nested if example:");
        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the concert.");
            } else {
                System.out.println("You need a ticket.");
            }
        }
        System.out.println();

        // switch statement
        System.out.println(" switch statement example:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Other day");
        }
        System.out.println();
    }
}
