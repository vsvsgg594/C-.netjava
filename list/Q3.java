package list;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = new ArrayList<>();

        // Add 5 integers to the list
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        // Print the elements using a for loop
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }
}
