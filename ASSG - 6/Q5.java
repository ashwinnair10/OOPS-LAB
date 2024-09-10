class Payment{
    void processPayment(){
        System.out.println("Processing payment...");
    }
    String getPaymentMethod(){
        return "";
    }
    double calculateTransactionFee(double amt){
        return 0.0;
    }
}
class CardPayment extends Payment{
    String cardType;
    CardPayment(String c){
        cardType=c;
    }
    @Override
    void processPayment(){
        System.out.println("Processing card payment...");
    }
    @Override
    String getPaymentMethod(){
        return cardType;
    }
    @Override
    double calculateTransactionFee(double amt){
        return 0.02*amt;
    }
}
class SecureCardPayment extends CardPayment{
    SecureCardPayment(String c){
        super(c);
    }
    @Override
    void processPayment(){
        super.processPayment();
        System.out.println("Adding extra security layers to card payment...");
    }
    @Override
    String getPaymentMethod(){
        return "Secure "+cardType;
    }
    @Override
    double calculateTransactionFee(double amt){
        return 1+(0.02*amt);
    }
}
public class Q5{
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment("Credit Card");
        System.out.println("Card Payment Method: " +
        cardPayment.getPaymentMethod());
        cardPayment.processPayment();
        double cardFee = cardPayment.calculateTransactionFee(100.0);
        System.out.println("Card Payment Transaction Fee: $" + cardFee);
        System.out.println();
        SecureCardPayment securePayment = new SecureCardPayment("Credit Card");
        System.out.println("Secure Payment Method: " +
        securePayment.getPaymentMethod());
        securePayment.processPayment();
        double secureFee = securePayment.calculateTransactionFee(100.0);
        System.out.println("Secure Payment Transaction Fee: $" + secureFee);
    }
}