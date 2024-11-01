import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a list of strings using ArrayList
        List<String> names = new ArrayList<>();

        // Adding elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // Display the elements in the list
        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Accessing an element by index
        System.out.println("\nName at index 2: " + names.get(2));

        // Removing an element from the list
        names.remove("Bob");
        System.out.println("\nList after removing 'Bob': " + names);
    }
}
