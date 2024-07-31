package list;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add 5 integers as strings to the list
        stringList.add(String.valueOf(10));
        stringList.add(String.valueOf(20));
        stringList.add(String.valueOf(30));
        stringList.add(String.valueOf(40));
        stringList.add(String.valueOf(50));

        // Print the elements using a for loop
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
