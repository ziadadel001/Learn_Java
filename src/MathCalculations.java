public class MathCalculations {

    public static void run() {

        int a = 10;
        int b = 3;

        //  Basic Arithmetic Operations

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division (int): " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //  Floating Point Calculations

        double x = 10;
        double y = 3;
        System.out.println("Exact Division: " + (x / y));

        //  Math Constants

        System.out.println("PI value: " + Math.PI); // π
        System.out.println("Euler's Number (e): " + Math.E);

        //  Power, Roots & Logs

        System.out.println("2^3: " + Math.pow(2, 3));
        System.out.println("Square Root of 16: " + Math.sqrt(16));
        System.out.println("Cube Root of 27: " + Math.cbrt(27));
        System.out.println("Natural Log (ln 10): " + Math.log(10));
        System.out.println("Base 10 Log: " + Math.log10(100));

        //  Absolute, Min & Max

        System.out.println("Absolute of -20: " + Math.abs(-20));
        System.out.println("Max value: " + Math.max(a, b));
        System.out.println("Min value: " + Math.min(a, b));

        //  Rounding Methods

        double num = 4.5;

        System.out.println("Round: " + Math.round(num));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));

        // Random Numbers

        double random01 = Math.random();
        System.out.println("Random (0 - 1): " + random01);

        int random1to100 = (int) (Math.random() * 100) + 1;
        System.out.println("Random (1 - 100): " + random1to100);

        //  Trigonometry (Radians)

        double angleDegrees = 45;
        double angleRadians = Math.toRadians(angleDegrees);

        System.out.println("Sin 45: " + Math.sin(angleRadians));
        System.out.println("Cos 45: " + Math.cos(angleRadians));
        System.out.println("Tan 45: " + Math.tan(angleRadians));

        //  Geometry Calculations

        double radius = 7;

        double circleArea = Math.PI * Math.pow(radius, 2);
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circlePerimeter);

        //  Exponential & Sign Methods

        System.out.println("exp(1): " + Math.exp(1)); // e^1
        System.out.println("Sign of -10: " + Math.signum(-10));
        System.out.println("Sign of 0: " + Math.signum(0));
        System.out.println("Sign of 5: " + Math.signum(5));

        //  Hypotenuse (Pythagoras)

        double sideA = 3;
        double sideB = 4;

        double hypotenuse = Math.hypot(sideA, sideB);
        System.out.println("Hypotenuse: " + hypotenuse);

        //  Angle Conversions

        System.out.println("180 degrees in radians: " + Math.toRadians(180));
        System.out.println("PI radians in degrees: " + Math.toDegrees(Math.PI));
    }
}
