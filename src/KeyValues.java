import java.util.HashMap;
import java.util.Map;

public class KeyValues {
    /*
     * Key-Value pairs in Java:
     * - Use Map interface (HashMap, TreeMap, LinkedHashMap)
     * - Key must be unique, value can be duplicate
     * - Stored in heap (reference type)
     */

    public static void run() {

        // Create a HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Add key-value pairs
        ages.put("Ziad", 24);
        ages.put("Ali", 30);
        ages.put("Mona", 28);

        // Access value by key
        System.out.println("Ziad's age: " + ages.get("Ziad"));
        System.out.println("Mona's age: " + ages.get("Mona"));

        // Print full map
        System.out.println("All entries: " + ages);

        // Iterate over map entries
        System.out.println("Iterating key-value pairs:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
