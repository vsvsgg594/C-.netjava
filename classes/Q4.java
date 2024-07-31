package classes;

public class Q4 {
    String name;
    public void display(String name){
        this.name=name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        Q4 q=new Q4();
        q.display("vikash");
        Q4 q1=new Q4();
        q1.display("sharma");
    }
}
