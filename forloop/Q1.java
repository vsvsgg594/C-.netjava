package forloop;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of natural terms do you want ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.println(i +" ");
            sum=sum+i;
        }
        System.out.println("The Sum of Natural Number upto 7 terms :"+sum);
    }
    
}
