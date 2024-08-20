class Sensor{
    int sensorId;
    String sensorType;
    boolean isActive;
    Sensor(String s){
        sensorId=(int)Math.floor(Integer.MAX_VALUE*Math.random());
        isActive=true;
        sensorType=s;
    }
    void display(){
        System.out.println("sensorId:"+sensorId+"\nsensorType:"+sensorType+"\nisActive:"+isActive+"\n");
    }
}
public class Q5{
    public static void main(String[] args) {
        Sensor s1=new Sensor("temperature");
        Sensor s2=new Sensor("humidity");
        s1.display();
        s2.display();
        return;
    }
}