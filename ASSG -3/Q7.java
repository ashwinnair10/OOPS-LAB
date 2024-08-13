class Vehicle{
    String make,model,color;
    int year,currentSpeed;
    Vehicle(String mk,String ml,String cl,int y,int cs){
        make=mk;
        model=ml;
        color=cl;
        year=y;
        currentSpeed=cs;
    }
    void accelerate(){
        currentSpeed++;        
    }
    void brake(){
        currentSpeed=0;
    }
    void turnLeft(){
        System.out.println("Turning left");
    }
    void turnRight(){
        System.out.println("Turning right");
    }
}
class Car extends Vehicle{
    int numDoors;
    double trunkCapacity;
    Car(String mk,String ml,String cl,int y,int cs,int nd,double tc){
        super(mk,ml,cl,y,cs);
        numDoors=nd;
        trunkCapacity=tc;
    }
    void openTrunk(){
        System.out.println("Opening trunk");
    }
    void closeTrunk(){
        System.out.println("Closing trunk");
    }
}
class Bus extends Vehicle{
    int numSeats;
    String routeNumber;
    boolean isDoubleDecker;
    Bus(String mk,String ml,String cl,int y,int cs,int ns,String rn,boolean idd){
        super(mk,ml,cl,y,cs);
        numSeats=ns;
        routeNumber=rn;
        isDoubleDecker=idd;
    }
    void openDoors(){
        System.out.println("Opening doors");
    }
    void closeDoors(){
        System.out.println("Closing doors");
    }
}
class SUV extends Car{
    String offRoadCapability;
    SUV(String mk,String ml,String cl,int y,int cs,int nd,double tc,String orc){
        super(mk,ml,cl,y,cs,nd,tc);
        offRoadCapability=orc;
    }
    void engage4WD(){
        System.out.println("Engaging 4WD");
    }
}
class Sedan extends Car{
    boolean luxuryInterior;
    Sedan(String mk,String ml,String cl,int y,int cs,int nd,double tc,boolean li){
        super(mk,ml,cl,y,cs,nd,tc);
        luxuryInterior=li;
    }
    void activateMassageSeats(){
        System.out.println("Activating Massage Seats");
    }
}
class ElectricCar extends Car{
    int batteryCapacity;
    ElectricCar(String mk,String ml,String cl,int y,int cs,int nd,double tc,int bc){
        super(mk,ml,cl,y,cs,nd,tc);
        batteryCapacity=bc;
    }
    @Override
    void accelerate(){
        currentSpeed+=2;
    }
    void chargeBattery(){
        batteryCapacity++;
    }
}
class SportsCar extends Car{
    int topSpeed;
    SportsCar(String mk,String ml,String cl,int y,int cs,int nd,double tc,int ts){
        super(mk,ml,cl,y,cs,nd,tc);
        topSpeed=ts;
    }
    @Override
    void accelerate(){
        currentSpeed+=3;
    }
}
public class Q7{
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Volvo","XC40","White",2019,60);
        Car c1=new Car("Maruti Suzuki","S-Cross","Grey",2018,45,4,400.00);
        Bus b1=new Bus("Scania","Coach","White",2020,40,50,"Kozhikode to Banglore",false);
        SUV s1=new SUV("Tata","Harrier","Black",2022,50,4,500.00,"All-terrain compatible");
        Sedan s2=new Sedan("Honda","City","Wine red",2018,40,4,450,false);
        ElectricCar e1=new ElectricCar("Tesla","Model T","Blue",2019,30,4,350,300);
        SportsCar s3=new SportsCar("Lamborghini","Aventador","Black",2016,180,2,150,350);

        System.out.println("Vehicle function testing");
        System.out.println(v1.make+" "+v1.model+" "+v1.color+" "+v1.year+" "+v1.currentSpeed);
        System.out.println(v1.currentSpeed);
        v1.accelerate();
        System.out.println(v1.currentSpeed);
        v1.brake();
        System.out.println(v1.currentSpeed);
        v1.turnLeft();
        v1.turnRight();
        System.out.println();

        System.out.println("Car function testing");
        System.out.println(c1.make+" "+c1.model+" "+c1.color+" "+c1.year+" "+c1.currentSpeed+" "+c1.numDoors+" "+c1.trunkCapacity);
        System.out.println(c1.currentSpeed);
        c1.accelerate();
        System.out.println(c1.currentSpeed);
        c1.brake();
        System.out.println(c1.currentSpeed);
        c1.turnLeft();
        c1.turnRight();
        c1.openTrunk();
        c1.closeTrunk();
        System.out.println();

        System.out.println("Bus function testing");
        System.out.println(b1.make+" "+b1.model+" "+b1.color+" "+b1.year+" "+b1.currentSpeed+" "+b1.numSeats+" "+b1.routeNumber);
        System.out.println(b1.currentSpeed);
        b1.accelerate();
        System.out.println(b1.currentSpeed);
        b1.brake();
        System.out.println(b1.currentSpeed);
        b1.turnLeft();
        b1.turnRight();
        b1.openDoors();
        b1.closeDoors();
        System.out.println();

        System.out.println("SUV function testing");
        System.out.println(s1.make+" "+s1.model+" "+s1.color+" "+s1.year+" "+s1.currentSpeed+" "+s1.numDoors+" "+s1.trunkCapacity+" "+s1.offRoadCapability);
        System.out.println(s1.currentSpeed);
        s1.accelerate();
        System.out.println(s1.currentSpeed);
        s1.brake();
        System.out.println(s1.currentSpeed);
        s1.turnLeft();
        s1.turnRight();
        s1.openTrunk();
        s1.closeTrunk();
        s1.engage4WD();
        System.out.println();

        System.out.println("Sedan function testing");
        System.out.println(s2.make+" "+s2.model+" "+s2.color+" "+s2.year+" "+s2.currentSpeed+" "+s2.numDoors+" "+s2.trunkCapacity);
        System.out.println(s2.currentSpeed);
        s2.accelerate();
        System.out.println(s2.currentSpeed);
        s2.brake();
        System.out.println(s2.currentSpeed);
        s2.turnLeft();
        s2.turnRight();
        s2.openTrunk();
        s2.closeTrunk();
        s2.activateMassageSeats();
        System.out.println();

        System.out.println("Electric Car function testing");
        System.out.println(e1.make+" "+e1.model+" "+e1.color+" "+e1.year+" "+e1.currentSpeed+" "+e1.numDoors+" "+e1.trunkCapacity+" "+e1.batteryCapacity);
        System.out.println(e1.currentSpeed);
        e1.accelerate();
        System.out.println(e1.currentSpeed);
        e1.brake();
        System.out.println(e1.currentSpeed);
        e1.turnLeft();
        e1.turnRight();
        e1.openTrunk();
        e1.closeTrunk();
        System.out.println(e1.batteryCapacity);
        e1.chargeBattery();
        System.out.println(e1.batteryCapacity);
        System.out.println();

        System.out.println("Sports Car function testing");
        System.out.println(s3.make+" "+s3.model+" "+s3.color+" "+s3.year+" "+s3.currentSpeed+" "+s3.numDoors+" "+s3.trunkCapacity+" "+s3.topSpeed);
        System.out.println(s3.currentSpeed);
        s3.accelerate();
        System.out.println(s3.currentSpeed);
        s3.brake();
        System.out.println(s3.currentSpeed);
        s3.turnLeft();
        s3.turnRight();
        s3.openTrunk();
        s3.closeTrunk();
        System.out.println();

        return;
    }
}