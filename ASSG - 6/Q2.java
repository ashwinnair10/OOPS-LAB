class BookingApplication{
    void bookTransport(String flightno,String depc,String arrc){
        System.out.println("Booked flight no.: "+flightno+" flying from "+depc+" to "+arrc);
    }
    void bookTransport(int trainno,String cl){
        System.out.println("Booked train no.: "+trainno+" Class: "+cl);
    }
    void bookTransport(String pl,String dest){
        System.out.println("Booked cab Pickup location: "+pl+" Destination: "+dest);
    }
    void bookTransport(String pl,String dest,int n){
        System.out.println("Booked cab Pickup location: "+pl+" Destination: "+dest+" Passengers: "+n);
    }
}
public class Q2{
    public static void main(String[] args) {
        BookingApplication b=new BookingApplication();
        b.bookTransport("23849AD32A","MUMBAI","KOCHI");
        b.bookTransport(16650,"Sleeper");
        b.bookTransport("Kozhikode Bus Stand", "NIT Calicut");
        b.bookTransport("Kozhikode Bus Stand", "NIT Calicut", 3);
    }
}