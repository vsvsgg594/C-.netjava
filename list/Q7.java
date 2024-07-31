package list;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add 5 integers as strings to the list
        stringList.add(String.valueOf(10));
        stringList.add(String.valueOf(20));
        stringList.add(String.valueOf(30));
        stringList.add(String.valueOf(40));
        stringList.add(String.valueOf(50));

        // Print the elements using a foreach loop
        for (String number : stringList) {
            System.out.println(number);
        }
    }
}
