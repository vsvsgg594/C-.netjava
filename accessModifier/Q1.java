package accessModifier;

public class Q1 {
    public int Studentid ;
    public String StudentName;
    public void displayStudentInfo(int Studentid,String StudentName){
        this.StudentName=StudentName;
        this.Studentid=Studentid;
        System.out.println("Studentid   :" +Studentid);
        System.out.println("StudentName :"+StudentName);
    }
    public static void main(String[] args) {
        Q1 q=new Q1();
        q.displayStudentInfo(101, "vikash");
    }
}
