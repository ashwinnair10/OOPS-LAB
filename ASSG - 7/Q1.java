interface PoweredDevice{
    void powerOn();
    void powerOff();
}
interface NetworkEnabled{
    void connectToNetwork(String networkName);
    void disconnectFromNetwork();
}
class Smartphone implements PoweredDevice,NetworkEnabled{
    String model,connectedNetwork,isPoweredOn;
    Smartphone(String m){
        model=m;
        isPoweredOn="OFF";
        connectedNetwork=null;
    }
    public void powerOn(){
        System.out.println("Device powered on");
        isPoweredOn="ON";
    }
    public void powerOff(){
        System.out.println("Device powered off");
        isPoweredOn="OFF";
    }
    public void connectToNetwork(String n){
        connectedNetwork=n;
        System.out.println("Successfully connected to "+connectedNetwork);
    }
    public void disconnectFromNetwork(){
        if(connectedNetwork!=null)
        System.out.println("Disconnected from "+connectedNetwork);
        connectedNetwork=null;
    }
    @Override
    public String toString(){
        if(connectedNetwork!=null){
            return "Model: "+model+" Power: "+isPoweredOn+" Connected Network: "+connectedNetwork;
        }
        return "Model: "+model+" Power: "+isPoweredOn;
    }
}
public class Q1{
    public static void main(String[] args) {
        Smartphone s=new Smartphone("Samsung M21");
        System.out.println(s.toString());
        s.powerOn();
        s.connectToNetwork("CSED-WiFi");
        System.out.println(s.toString());
        s.disconnectFromNetwork();
        s.powerOff();
        System.out.println(s.toString());
    }
}