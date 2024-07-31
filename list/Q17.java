package list;

import java.util.ArrayList;
import java.util.List;

public class Q17
 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add some strings to the list
        stringList.add("John");
        stringList.add("Kishore");
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.add("Charlie");

        // Remove the element at index 3
        stringList.remove(3);

        // Print the list after removal
        System.out.println(stringList);
    }
}

