package polypurphismn;

public class Main1 {
    // Method with no parameters
    public void display() {
        System.out.println("Display method with no parameters");
    }

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Display method with one integer parameter: " + a);
    }

    // Method with two parameters (integer and string)
    public void display(int a, String b) {
        System.out.println("Display method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Main1 obj = new Main1();
        
        // Calling the method with different signatures
        obj.display();
        obj.display(10);
        obj.display(20, "Hello");
    }
}
