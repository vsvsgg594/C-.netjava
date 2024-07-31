package classes;
import java.util.*;
public class Q2 {
    String name;
    String sirName;
    public void display(String name){
        this.name=name;
        System.out.println(name);
    }
    public void display(String name,String sirName){
        this.name=name;
        this.sirName=sirName;
        System.out.println(name+" "+sirName);

    }
    public static void main(String[] args) {
        Q2 q=new Q2();
        q.display("vikash");
        q.display("vikash", "sharma");
    }
    
}
