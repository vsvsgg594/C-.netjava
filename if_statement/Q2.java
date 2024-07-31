package if_statement;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year ");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("year is leap year");
                }

            }
        }
        
    }
}
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Prompt the user to enter a year
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();
        
//         // Check if the year is a leap year
//         boolean isLeapYear = false;
        
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     isLeapYear = true;
//                 }
//             } else {
//                 isLeapYear = true;
//             }
//         }
        
//         // Print the result
//         if (isLeapYear) {
//             System.out.println(year + " is a leap year.");
