class RegularCustomer{
    String name;
    double cost;
    RegularCustomer(String n,double c){
        name=n;
        cost=c;
    }
    void displayCustomerName(){
        System.out.println("Customer: "+name);
    }
    void calculateCost(){
        cost+=5;
        System.out.println("Total Order Cost: $"+cost);
    }
}
class PremiumCustomer extends RegularCustomer{
    PremiumCustomer(String n,double c){
        super(n,c);
    }
    @Override
    void calculateCost(){
        System.out.println("Total Order Cost: $"+cost);
    }
}
public class Q4{
    public static void main(String[] args) {
        RegularCustomer r=new RegularCustomer("Alice",20);
        PremiumCustomer p=new PremiumCustomer("Bob",30);
        r.displayCustomerName();
        r.calculateCost();
        System.out.println();
        p.displayCustomerName();
        p.calculateCost();
    }
}