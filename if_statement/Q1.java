package if_statement;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}