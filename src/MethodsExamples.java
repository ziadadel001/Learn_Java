public class MethodsExamples {

    // run() method to test all examples
    public static void run() {

        //  Simple Method (no parameters, no return)
        sayHello(); // calling method

        //  Method with Parameters (no return)
        greet("Ziad"); // passing argument

        //  Method with Return Value
        int sumResult = add(5, 10);
        System.out.println("Sum: " + sumResult);

        //  Method Overloading (same name, different parameters)
        System.out.println("Multiply 2 numbers: " + multiply(3, 4));
        System.out.println("Multiply 3 numbers: " + multiply(2, 3, 4));

        // Static vs Non-Static Methods
        // static method can be called directly without object (we already did that)
        // non-static method requires object
        MethodsExamples obj = new MethodsExamples();
        obj.nonStaticExample();

        //  Returning Different Data Types
        double area = rectangleArea(5.0, 3.0);
        System.out.println("Rectangle Area: " + area);

        // Using Methods Inside Methods
        System.out.println("Square of 7: " + square(add(3, 4))); // add -> square
    }

    // Methods Definitions

    //  Simple method
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    //  Method with parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    //  Method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    //  Method overloading
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //  Non-static method
    public void nonStaticExample() {
        System.out.println("This is a non-static method, needs object to call.");
    }

    //  Method returning double
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    //Method calling another method
    public static int square(int number) {
        return number * number;
    }
}
