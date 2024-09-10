class TicketBooking{
    void bookTicket(){
        System.out.println("Booking regular ticket...");
    }
    double calculateBookingFees(double amt){
        return amt*0.1;
    }
}
class VIPBooking extends TicketBooking{
    @Override
    void bookTicket(){
        System.out.println("Booking VIP Ticket with additional perks...");
    }
    @Override
    double calculateBookingFees(double amt){
        return amt*0.05;
    }
}
public class Q6{
    public static void main(String[] args) {
        TicketBooking regularBooking = new TicketBooking();
        VIPBooking vipBooking = new VIPBooking();
        System.out.println("=== Regular Ticket Booking ===");
        regularBooking.bookTicket();
        double regularFee = regularBooking.calculateBookingFees(200.0);
        System.out.println("Regular booking fee: $" + regularFee);
        System.out.println();
        System.out.println("=== VIP Ticket Booking ===");
        vipBooking.bookTicket();
        double vipFee = vipBooking.calculateBookingFees(200.0);
        System.out.println("VIP booking fee: $" + vipFee);
    }
}