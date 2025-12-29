public class Prints {

    // run() method to test all print examples
    public static void run() {

        // println() -> prints text AND moves to a new line
        // Shortcut in IntelliJ: type 'sout' + Tab to auto-generate System.out.println()
        System.out.println("Hello, World!");

        // print() -> prints text WITHOUT moving to a new line
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println(); // empty line

        // print() with "\n" -> manually create a new line
        System.out.print("Line 1\n");
        System.out.print("Line 2\n");
        System.out.println(); // empty line

        // println() with no text -> prints a blank line
        System.out.println();

        // Combining text and variables using +
        int age = 25;
        System.out.println("My age is " + age);

        // ===============================
        // printf() Examples
        // ===============================

        /*
         * printf() -> prints formatted text
         * Does NOT add a new line automatically (unless you use %n or \n)
         * Similar to printf in C
         */

        String name = "Ziad";
        double salary = 12345.75;
        int year = 2025;

        // Basic formatted printing
        System.out.printf("Name: %s, Year: %d%n", name, year);

        // Formatting numbers
        System.out.printf("Salary: %.2f%n", salary); // 2 decimal places

        // Multiple values
        System.out.printf("Name: %s | Age: %d | Salary: %.1f%n", name, age, salary);

        // New line using %n (recommended over \n)
        System.out.printf("This is line one%nThis is line two%n");

        // Integer formatting
        int number = 42;
        System.out.printf("Number: %d%n", number);

        // Width and alignment
        System.out.printf("Right aligned: %10d%n", number);
        System.out.printf("Left aligned: %-10d%n", number);

        // Percent sign
        System.out.printf("Progress: %d%%%n", 85); // prints 85%

        // Boolean formatting
        boolean isActive = true;
        System.out.printf("Active: %b%n", isActive);
    }
}
