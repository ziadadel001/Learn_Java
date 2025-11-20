public class Loops {

    /*
     * Loops in Java:
     * Loops allow you to repeat a block of code multiple times.
     *
     * Types of loops:
     * 1. for loop
     * 2. while loop
     * 3. do-while loop
     * 4. enhanced for loop (for-each)
     */

    public static void run() {

        System.out.println("----- FOR LOOP -----");
        /*
         * for loop:
         * - Used when you know how many times you want to repeat
         * Structure:
         * for (initialization; condition; update) { ... }
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop: " + i);
        }
        System.out.println();

        System.out.println("----- WHILE LOOP -----");
        /*
         * while loop:
         * - Used when you want to loop WHILE a condition is true
         */
        int count = 1;
        while (count <= 5) {
            System.out.println("While loop: " + count);
            count++;
        }
        System.out.println();

        System.out.println("----- DO-WHILE LOOP -----");
        /*
         * do-while loop:
         * - Always runs at least once
         * Structure:
         * do { ... } while(condition);
         */
        int num = 1;
        do {
            System.out.println("Do-While loop: " + num);
            num++;
        } while (num <= 5);
        System.out.println();

        System.out.println("----- ENHANCED FOR LOOP (FOR-EACH) -----");
        /*
         * Enhanced for loop:
         * - Best for looping through arrays or collections
         */
        int[] numbers = {10, 20, 30, 40};

        for (int n : numbers) {
            System.out.println("For-each loop: " + n);
        }
    }
}
