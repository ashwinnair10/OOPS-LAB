class Vehicle{
    String manufacturedin;
    Vehicle(String m){
        manufacturedin=m;
    }
    void start(){
        System.out.println("Starting vehicle manufactured in "+manufacturedin);
    }
}
class Car extends Vehicle{
    String type;
    Car(String m,String t){
        super(m);
        type=t;
    }
    @Override
    void start(){
        super.start();
        System.out.println("Starting car of type "+type);
    }
}
class ElectricCar extends Car{
    int battery;
    ElectricCar(String m,String t,int b){
        super(m,t);
        battery=b;
    }
    @Override
    void start(){
        super.start();
        System.out.println("Starting electric car of battery capacity "+battery);
    }
}
class Tesla extends ElectricCar{
    String model;
    Tesla(String m,String t,int b,String mo){
        super(m,t,b);
        model=mo;
    }
    @Override
    void start(){
        super.start();
        System.out.println("Starting Tesla model "+model);
    }
}
public class Q6{
    public static void main(String[] args) {
        Tesla t=new Tesla("USA", "Sedan", 300, "T");
        t.start();
    }
}