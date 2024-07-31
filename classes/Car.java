package classes;

public class Car {
    String carName;
    String carModels;
    int carNumber=123;
    public void displayInfo(String carName,String carModels,int carNumber){
        this.carName=carName;
        this.carModels=carModels;
        this.carNumber=carNumber;
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.displayInfo("Mahindra", "md120d", 909882);
    }
    
}
