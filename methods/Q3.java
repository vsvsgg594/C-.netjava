package methods;
import java.util.*;
public class Q3 {
    public void sumAndProduct(int a,int b){
        int add=a+b;
        int mul=a*b;
        System.out.println("addition : "+add);
        System.out.println("Multiplication :"+mul);
    }
    public static void main(String[] args) {
        Q3 q=new Q3();
        q.sumAndProduct(1, 3);
        
    }
}
