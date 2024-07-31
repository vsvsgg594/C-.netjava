package methods;
import java.util.*;
public class Q2 {
    public void displayName(){
        System.out.println("this is instance methods");
    }
    public static void display(){
        System.out.println("this is static methods");
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
        q.displayName();
        display();
    }
    
}
