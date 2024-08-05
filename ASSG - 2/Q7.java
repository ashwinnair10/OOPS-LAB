import java.util.*;
public class Q7 {
    public class Account{
        int accountnumber;
        String name;
        double balance;
        Account(int an,String s,double d){
            accountnumber=an;
            name=s;
            balance=d;
        }
        void deposit(double x){
            balance+=x;
        }
        void withdraw(double x){
            if(x>balance)
            System.out.println("Insufficient balance");
            else
            balance-=x;
        }
        void display(){
            System.out.println("\nAccount Number:"+accountnumber+"\nName:"+name+"\nBalance:"+balance);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q7 obj=new Q7();
        int t=0;
        ArrayList<Q7.Account> arr=new ArrayList<Q7.Account>();
        while(true){
            System.out.println("\n1. Create a new account\n" + 
                                "2. Deposit money\n" +
                                "3. Withdraw money\n" +
                                "4. Check balance\n" + 
                                "5. Exit\n");
            int n=sc.nextInt();
            if(n==5)
            break;
            double amt;
            int an;
            switch (n) {
                case 1:
                    String name;
                    double balance;
                    System.out.println("Enter name:");
                    name=sc.next();
                    System.out.println("Enter deposit:");
                    balance=sc.nextDouble();
                    Q7.Account o=obj.new Account(t,name,balance);
                    t++;
                    arr.add(o);
                    o.display();
                    break;
                case 2:
                    System.out.println("Enter account no.");
                    an=sc.nextInt();
                    if(an>=arr.size()){
                        System.out.println("Invalid Account Number");
                        break;
                    }
                    Q7.Account acc=arr.get(an);
                    System.out.println("Enter deposit:");
                    amt=sc.nextDouble();
                    acc.deposit(amt);
                    acc.display();
                    break;
                case 3:
                    System.out.println("Enter account no.");
                    an=sc.nextInt();
                    if(an>=arr.size()){
                        System.out.println("Invalid Account Number");
                        break;
                    }
                    Q7.Account acc2=arr.get(an);
                    System.out.println("Enter withdrawal:");
                    amt=sc.nextDouble();
                    acc2.withdraw(amt);
                    acc2.display();
                    break;
                case 4:
                    System.out.println("Enter account no.");
                    an=sc.nextInt();
                    if(an>=arr.size()){
                        System.out.println("Invalid Account Number");
                        break;
                    }
                    Q7.Account acc3=arr.get(an);
                    acc3.display();
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
        sc.close();
    }
}
