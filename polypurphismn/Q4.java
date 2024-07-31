package polypurphismn;

public class Q4 {
    public void displayNumber(int a,int b){
        System.out.println(a+" "+b);
    }
    public void displayNumber(String a,String b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Q4 q=new Q4();
        q.displayNumber("vikash", "sharma");
        q.displayNumber(2, 4);
        
    }
}
