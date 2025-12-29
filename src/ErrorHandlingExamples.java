public class ErrorHandlingExamples {

    public static void run() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("This block always executes.");
        }

        // NullPointerException example
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null!");
        }
    }
}
