package readandoutt;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print the entered name
        System.out.println("Hello, " + name + "!");
        
        scanner.close();
    }
}
