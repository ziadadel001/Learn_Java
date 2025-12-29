public class StringsExamples {

    // run() method to test all String examples
    public static void run() {

        //  Creating Strings

        String name = "Ziad";
        String message = new String("Hello Java");

        System.out.println("Name: " + name);
        System.out.println("Message: " + message);

        // String Length

        // length() returns the number of characters in the string
        System.out.println("Name length: " + name.length());

        // Access Characters

        // charAt(index) gets a character at a specific index (0-based)
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));

        // String Comparison

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        // == compares memory references (NOT content)
        System.out.println(s1 == s3); // false

        // equals() compares actual content
        System.out.println(s1.equals(s3)); // true

        // equalsIgnoreCase() ignores case sensitivity
        System.out.println(s1.equalsIgnoreCase("java")); // true

        // Changing Case

        String text = "Hello World";

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // Substring

        // substring(startIndex, endIndex)
        // endIndex is NOT included
        System.out.println(text.substring(0, 5)); // Hello

        // Checking Content

        System.out.println(text.contains("World")); // true
        System.out.println(text.startsWith("Hello")); // true
        System.out.println(text.endsWith("ld")); // true

        // Replace Text

        String replaced = text.replace("World", "Java");
        System.out.println(replaced);

        //  Trim Spaces

        String spaced = "   Java Programming   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        //  Split String

        String data = "apple,banana,orange";
        String[] fruits = data.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //  Convert Number to String

        int age = 25;
        String ageStr = String.valueOf(age);
        System.out.println("Age as String: " + ageStr);

        // Convert String to Number

        String price = "150";
        int priceInt = Integer.parseInt(price);
        System.out.println("Price + 50 = " + (priceInt + 50));

        // String Concatenation

        String firstName = "Ziad";
        String lastName = "Adel";

        // Using +
        System.out.println(firstName + " " + lastName);

        // Using concat()
        System.out.println(firstName.concat(" ").concat(lastName));

        //  Empty vs Null

        String empty = "";
        String nullString = null;

        System.out.println(empty.isEmpty()); // true
        // nullString.isEmpty();  will cause NullPointerException
    }
}
