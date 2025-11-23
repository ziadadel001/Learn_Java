import java.util.Arrays;

public class ArraysExample {
    /*
     * Arrays in Java:
     * - Arrays store multiple values of the same type in a single variable
     * - Stored in heap memory (reference type)
     * - Can be primitive or reference type arrays
     * - Access elements using index: array[index] (0-based index)
     */

    public static void run() {

        System.out.println("----- 1. Primitive Array -----");
        int[] numbers = {10, 20, 30, 40, 50}; // integer array

        // Access elements by index
        System.out.println("First element: " + numbers[0]); // 10
        System.out.println("Third element: " + numbers[2]); // 30

        // Print full array
        System.out.println("Full array: " + Arrays.toString(numbers));
        System.out.println();

        System.out.println("----- 2. String Array -----");
        String[] names = {"Ziad", "Ali", "Mona"};

        // Access elements
        System.out.println("Second name: " + names[1]); // Ali
        System.out.println("Full array: " + Arrays.toString(names));
        System.out.println();

        System.out.println("----- 3. Multi-Dimensional Array -----");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Access element
        System.out.println("Element at row 2, col 3: " + matrix[1][2]); // 6

        // Print full 2D array
        System.out.println("Full matrix:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();

        System.out.println("----- 4. Array of Objects -----");
        PersonExample[] people = {
                new PersonExample("Ziad"),
                new PersonExample("Mona")
        };

        // Access object
        System.out.println("First person name: " + people[0].name);
        System.out.println("Second person name: " + people[1].name);
    }
}

// Simple Person class to demonstrate array of objects
class PersonExample {
    String name;

    PersonExample(String name) {
        this.name = name;
    }
}
