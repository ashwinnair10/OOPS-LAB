class Account{
    private String accountNumber;
    protected double balance;
    Account(String a,double b){
        accountNumber=a;
        balance=b;
    }
    void deposit(double x){
        balance+=x;
    }
    double getBalance(){
        return balance;
    }
}
class SavingsAccount extends Account{
    protected double interestRate;
    SavingsAccount(String a,double b,double i){
        super(a,b);
        interestRate=i;
    }
    void addInterest(){
        balance*=(1+(interestRate/100));
    }
}
public class Q9{
    public static void main(String[] args) {
        SavingsAccount o=new SavingsAccount("73829827QW",10000.00,8.3);
        System.out.println("Balance: "+o.balance);
        o.deposit(3000.00);
        System.out.println("Balance: "+o.balance);
        o.addInterest();
        System.out.println("Balance: "+o.balance);
        //Subclass cannot access private fields of super class
        return;
    }
}