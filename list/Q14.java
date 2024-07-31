package list;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add some strings to the list
        stringList.add("John");
        stringList.add("Alice");
        stringList.add("Bob");

        // Insert an element at a specific position
        stringList.add(1, "Kishore");

        // Print the list after insertion
        System.out.println(stringList);
    }
}

