import java.util.*;
interface Bank{
    void calculateInterest();
    void withdraw(double x);
    void deposit(double x);
    void getMonthlyStatement();
}
class Account implements Bank{
    String accountNumber,customerName;
    double balance;
    ArrayList<String> transactions=new ArrayList<>();
    Account(String a,double b,String c){
        accountNumber=a;
        balance=b;
        customerName=c;
        transactions.add("--Initial balance: "+balance+"rs.");
    }
    public void calculateInterest(){
        double i=balance*0.05;
        System.out.println("Interest: "+i+" rs.");
    }
    public void withdraw(double x){
        if(balance-x<0){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=x;
        transactions.add("--Withdrawn : "+x+"rs.");
    }
    public void deposit(double x){
        balance+=x;
        transactions.add("--Deposited : "+x+"rs.");
    }
    public void getMonthlyStatement(){
        for(int i=0;i<transactions.size();i++){
            System.out.println(transactions.get(i));
        }
        System.out.println("Current balance : "+balance+"rs. ");
    }
}
class SavingsAccount extends Account{
    double minimumBalance,interest;
    SavingsAccount(String a,double b,String c,double m){
        super(a,b,c);
        minimumBalance=m;
        interest=0;
    }
    @Override
    public void calculateInterest(){
        double i=balance*0.08;
        System.out.println("Interest: "+i+" rs.");
    }
    @Override
    public void withdraw(double x){
        if(balance-x<0){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=x;
        transactions.add("--Withdrawn : "+x+"rs.");
        if(balance<minimumBalance){
            System.out.println("Account balance has dropped below minimum balance requirement - Charging penalty of 100 rs.");
            transactions.add("--Penalty charged : "+100+"rs.");
            balance=balance-100>0?balance-100:0;
        }
    }
}
class CheckingAccount extends Account{
    double overdraftAmount,interest;
    CheckingAccount(String a,double b,String c,double o,double i){
        super(a,b,c);
        overdraftAmount=o;
        interest=i/100;
    }
    @Override
    public void withdraw(double x){
        if(balance-x-10>=0){
            balance-=x+10;
            transactions.add("--Withdrawn : "+x+"rs.");
            transactions.add("--Withdrawal fee : "+10+"rs.");
        }
        else{
            balance-=x+10;
            if(balance*-1<=overdraftAmount){
                transactions.add("--Withdrawn : "+x+"rs.");
                transactions.add("--Overdraft interest charged : "+String.format("%.2f",balance*interest*-1)+"rs.");
                balance=balance*(1+interest)*-1 + 10<=overdraftAmount?balance*(1+interest)-10:-overdraftAmount;
                transactions.add("--Withdrawal fee : "+10+"rs.");
            }
            else{
                balance+=x+10;
                System.out.println("Insufficient balance");
            }
        }
    }
}
class InternationalAccount extends Account{
    InternationalAccount(String a,double b,String c){
        super(a,b,c);
    }
    void deposit(double x,String n,double c){
        balance+=x*c;
        transactions.add("--Deposited : "+x+n);
    }
}
public class Q4{
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount("12766ADR",30000.00,"Ashwin A Nair",5000);
        CheckingAccount c=new CheckingAccount("67899BHA",5000,"Nandan Nair",1000,6);
        InternationalAccount i=new InternationalAccount("9927FTD",90000,"Chris Evans");
        //SavingsAccount Testing
        s.calculateInterest();
        s.withdraw(26000);
        s.deposit(5000);
        s.withdraw(90000);
        s.getMonthlyStatement();
        System.out.println();
        //CheckingAccount Testing
        c.calculateInterest();
        c.deposit(1000);
        c.withdraw(6500);
        c.withdraw(700);
        c.deposit(3000);
        c.getMonthlyStatement();
        System.out.println();
        //InternationalAccount Testing
        i.calculateInterest();
        i.withdraw(10000);
        i.deposit(4000);
        i.deposit(100," dollars",82.5);
        i.getMonthlyStatement();
    }
}