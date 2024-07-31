package if_statement;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String str=sc.next();
        if(str=="A"||str=="a"||str=="i"||str=="I"||str=="E"||str=="e"||str=="U"||str=="u"||str=="O"||str=="o"){
            System.out.println("vowels");
        }else{
            System.out.println("constant");
        }
      
        
    }
    
}
