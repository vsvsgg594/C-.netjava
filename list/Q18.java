package list;
import java.util.*;
 class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}


public class Q18
 {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> studentList = new ArrayList<>();

        // Add 10 Student objects to the list
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student("Student" + i, i));
        }

        // Print the list of students
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
