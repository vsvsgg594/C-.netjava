package polypurphismn;

public class Q1 {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Q1 q=new Q1();
        q.add(1, 2);
        q.add(1, 2, 3);
    }
}
