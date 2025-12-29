public class TypeCastingExamples {

    public static void run() {
        // Implicit Casting (Widening)
        int a = 10;
        double b = a; // int -> double automatically
        System.out.println("Implicit Casting int to double: " + b);

        // Explicit Casting (Narrowing)
        double c = 9.78;
        int d = (int) c; // double -> int manually
        System.out.println("Explicit Casting double to int: " + d);

        // String to Number
        String str = "123";
        int number = Integer.parseInt(str); // String -> int
        System.out.println("String to int: " + number);

        // Number to String
        int x = 456;
        String str2 = String.valueOf(x); // int -> String
        System.out.println("Int to String: " + str2);
    }
}
