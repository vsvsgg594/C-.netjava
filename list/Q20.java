package list;

import java.util.ArrayList;
import java.util.List;

public class Q20 {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> studentList = new ArrayList<>();

        // Add 10 Student objects to the list
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student("Student" + i, i));
        }

        // Clear all elements from the list
        studentList.clear();

        // Print the list after clearing
        System.out.println("List after clearing: " + studentList);
    }
}
