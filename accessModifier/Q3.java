package accessModifier;

public class Q3 {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Q3 q=new Q3();
        q.setId(1);
        q.setName("vikash");
        q.getId();
        q.getName();
    }

}
