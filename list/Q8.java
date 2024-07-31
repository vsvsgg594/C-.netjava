package list;

import java.util.ArrayList;
import java.util.List;

public class Q8
 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add 5 integers as strings to the list
        stringList.add(String.valueOf(10));
        stringList.add(String.valueOf(20));
        stringList.add(String.valueOf(30));
        stringList.add(String.valueOf(40));
        stringList.add(String.valueOf(50));

        // Count the elements in the list
        int count = stringList.size();

        // Print the count
        System.out.println("The number of elements in the list is: " + count);
    }
}

