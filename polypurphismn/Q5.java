package polypurphismn;

public class Q5 {
    public void display(int a,String name){
        System.out.println("age "+a+" name"+name);
    }
    public void display(String name,int a){
        System.out.println("name is"+name+" "+"age"+a);
    }
    public static void main(String[] args) {
        Q5 q=new Q5();
        q.display("vikash", 23);
        q.display(23, "vikash");
    }
}
