// This is the main class of the project
// In Java, everything must be inside a class
public class Main {

    /*
     * This is the main method
     * The main method is the starting point of any Java program
     * When you run a Java program, the compiler looks for this method first
        *  Explanation of each part
               public  -> The method is accessible to everyone; required so the JVM can run it from anywhere
                static  -> The method can be executed without creating an object of the class
                void    -> The method does not return any value
                main    -> The fixed name that the JVM looks for as the program entry point
                String[] args -> An array of Strings that allows passing arguments from the command line
     */
    public static void main(String[] args){
    // Here we are calling a function (run) inside another class (Prints) from within the main method
        // Prints.run();       // print examples
        // Variables.run();    // variables examples
        Conditions.run();   // conditions examples
    }
}
