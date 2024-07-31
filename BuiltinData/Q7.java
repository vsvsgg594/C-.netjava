package BuiltinData;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='U'||str.charAt(i)=='u'){
                System.out.println(str.charAt(i));
            }
        }
    }
}
