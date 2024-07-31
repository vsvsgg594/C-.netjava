package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q16 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add some strings to the list
        stringList.add("John");
        stringList.add("Kishore");
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.add("Charlie");

        // Reverse the list
        Collections.reverse(stringList);

        // Print the reversed list
        System.out.println(stringList);
    }
}
