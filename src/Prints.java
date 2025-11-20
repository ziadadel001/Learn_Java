public class Prints {

    // run() method to test all print examples
    public static void run() {

        // println() -> prints text AND moves to a new line
        // Shortcut in IntelliJ: type 'sout' + Tab to auto-generate System.out.println()
        System.out.println("Hello, World!"); // Output: Hello, World! (cursor moves to next line)

        //print() -> prints text WITHOUT moving to a new line
        System.out.print("Hello ");          // Output: Hello (cursor stays on the same line)
        System.out.print("World!");          // Output: World! (printed on the same line as "Hello")
        System.out.println();                // prints an empty line to separate examples

        //print() with "\n" -> manually create a new line
        System.out.print("Line 1\n");        // Output: Line 1 (cursor moves to next line because of \n)
        System.out.print("Line 2\n");        // Output: Line 2
        System.out.println();                // empty line for spacing

        //println() with no text -> prints a blank line
        System.out.println();                // Output: (just a blank line)

        //Combining text and variables
        int age = 25;
        System.out.println("My age is " + age); // Output: My age is 25

    }
}
