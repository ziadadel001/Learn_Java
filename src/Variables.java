public class Variables {

    // run() method to test variables examples
    public static void run() {

        /*
         * Primitive types:
         * - Stored directly in stack memory
         * - Hold actual values
         * - Java has 8 primitive types
         */

        int age = 25;                // integer number
        double price = 10.5;         // decimal number
        char grade = 'A';            // single character
        boolean isStudent = true;    // true or false
        byte smallNumber = 10;       // very small integer (-128 to 127)
        short mediumNumber = 1000;   // small integer
        long bigNumber = 1000000L;   // large integer
        float decimalNumber = 5.5f;  // floating point number

        // Printing primitive types
        System.out.println("age: " + age);
        System.out.println("price: " + price);
        System.out.println("grade: " + grade);
        System.out.println("isStudent: " + isStudent);
        System.out.println("smallNumber: " + smallNumber);
        System.out.println("mediumNumber: " + mediumNumber);
        System.out.println("bigNumber: " + bigNumber);
        System.out.println("decimalNumber: " + decimalNumber);
        System.out.println(); // empty line

        /*
         * Reference types:
         * - Stored in heap memory
         * - Stack stores a reference (pointer) to the actual object in heap
         * - Examples: String, Arrays, Objects
         */

        String name = "Ziad";                     // String object
        int[] numbers = {1, 2, 3};               // Array object

        // Example of a custom object (real class)
        Person person = new Person("Ziad");  // new object in heap

        // Printing reference types
        System.out.println("name: " + name);
        System.out.print("numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // newline

        System.out.println("person reference: " + person); // prints memory reference
    }
}

// Simple Person class to demonstrate reference type

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

