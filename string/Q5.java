package string;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
       System.out.println("The highest frequency of the character 'a' appear as "+ count+"time\r");
      
    }
}
