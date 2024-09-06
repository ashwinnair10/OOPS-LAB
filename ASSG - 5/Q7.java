import java.util.*;
interface TaxCalculatable{
    void calculateTax();
}
abstract class Vehicle implements TaxCalculatable{
    String modelNumber,fuelType;
    double rateBought,tax;
    int numberOfWheels;
    Vehicle(String m,String f,double r,int n){
        modelNumber=m;
        fuelType=f;
        rateBought=r;
        numberOfWheels=n;
        tax=0.0;
    }
    void displayDetails(){
        System.out.println(modelNumber+" "+fuelType+" "+tax);
    }
}
class Car extends Vehicle{
    int numberOfPassengers;
    Car(String m,String f,double r,int np){
        super(m,f,r,4);
        numberOfPassengers=np;
        calculateTax();
    }
    public void calculateTax(){
        if(fuelType.equals("petrol")){
            tax=rateBought*0.1*numberOfPassengers*0.5;
        }
        if(fuelType.equals("diesel")){
            tax=rateBought*0.1*numberOfPassengers*0.4;
        }
    }
}
class Truck extends Vehicle{
    double loadLimit;
    Truck(String m,String f,double r,double ll){
        super(m,f,r,6);
        loadLimit=ll;
        calculateTax();
    }
    public void calculateTax(){
        if(fuelType.equals("petrol")){
            tax=rateBought*0.1*loadLimit*0.002*0.5;
        }
        if(fuelType.equals("diesel")){
            tax=rateBought*0.1*loadLimit*0.002*0.4;
        }
    }
}
class VehicleSystem{
    ArrayList<Vehicle> vehicles=new ArrayList<>();
    void add(Vehicle v){
        vehicles.add(v);
    }
    void display(){
        Collections.sort(vehicles,new Comparator<Vehicle>() {
            public int compare(Vehicle v1,Vehicle v2){
                return v1.tax<v2.tax?1:-1;
            }
        });
        for(int i=0;i<vehicles.size();i++)
        vehicles.get(i).displayDetails();
    }
}
public class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VehicleSystem vs=new VehicleSystem();
        String ch,m,f;
        double r,x;
        int n;
        while(true){
            System.out.println("1.Add Vehicle\n2.Display Vehicles\n3.Exit");
            n=sc.nextInt();
            if(n==3)
            break;
            switch(n){
                case 1:System.out.println("a.Car\nb.Truck");
                       sc.nextLine();
                       System.out.println("Enter your choice");
                       ch=sc.nextLine();
                       System.out.println("ModelNumber:");
                       m=sc.nextLine();
                       System.out.println("Rate:");
                       r=sc.nextDouble();
                       sc.nextLine();
                       System.out.println("FuelType(petrol/diesel):");
                       f=sc.nextLine();
                       if(ch.equals("a")){
                            System.out.println("Passengers:");
                            x=sc.nextInt();
                            vs.add(new Car(m,f,r,(int)x));
                       }
                       if(ch.equals("b")){
                            System.out.println("Loadlimit:");
                            x=sc.nextDouble();
                            vs.add(new Truck(m,f,r,x));
                       }
                       break;
                case 2:vs.display();
                       break;
                default:System.out.println("Invalid choice");
                        break;
            }
        }
        sc.close();
    }
}