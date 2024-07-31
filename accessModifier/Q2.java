package accessModifier;

public class Q2 {
    protected int age;
    protected String name;
    public void display(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(age+name);
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
        q.display(1, "vikash");
    }
}
