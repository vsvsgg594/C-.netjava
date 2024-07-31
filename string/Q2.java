package string;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string :");
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.println("lenght is "+count);
    }
}
