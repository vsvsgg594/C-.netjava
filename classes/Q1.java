package classes;

public class Q1 {
    String name="vikash";
    String loc="Bihar";
    int age=23;
    public void displayEmpDetails(){
        System.out.println("emp info "+name+" "+loc+" "+" "+age);
    }
    public static void main(String[] args) {
        Q1 q=new Q1();
        q.displayEmpDetails();
    }
}
