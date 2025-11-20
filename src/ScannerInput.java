import java.util.Scanner;

public class ScannerInput {

    // Scanner's role is to receive inputs from the user and bring them into the program
    public static void run() {

        // Create a Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // read full line as String

        System.out.println("Enter your age:");
        int age = scanner.nextInt();      // read integer value

        System.out.println("Enter your height in meters (e.g., 1.75):");
        double height = scanner.nextDouble(); // read decimal value

        // Printing the input values
        System.out.println("\nYou entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // Always close the scanner to avoid resource leak
        scanner.close();
    }
}
