package list;

import java.util.ArrayList;
import java.util.List;

public class Q12
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

        // Check if "Kishore" is present in the list using stream().filter()
        boolean isPresent = stringList.stream().anyMatch(s -> s.equals("Kishore"));

        if (isPresent) {
            System.out.println("Kishore is present in the list.");
        } else {
            System.out.println("Kishore is not present in the list.");
        }
    }
}