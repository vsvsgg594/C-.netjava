package forloop;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of terms");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i=+2){
            System.out.println("The odd numbers are :" + i);
            sum=sum+i;
         }
         System.out.println("The Sum of odd Natural Number upto"+num+"terms :"+sum);
    }
    
}
