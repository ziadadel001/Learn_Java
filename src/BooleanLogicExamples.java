public class BooleanLogicExamples {

    public static void run() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // AND
        System.out.println("a || b: " + (a || b)); // OR
        System.out.println("!a: " + (!a));         // NOT

        // Short-circuit evaluation
        int x = 5;
        if (x > 0 && x / 5 == 1) {
            System.out.println("Short-circuit example passed!");
        }
    }
}
