import java.util.*;
interface Convert{
    double convertRupees(double x);
    double convertDollars(double x);
    double convertPounds(double x);
}
class Bank implements Convert{
    public double convertRupees(double val){
        return val;
    }
    public double convertDollars(double val){
        return val*70;
    }
    public double convertPounds(double val){
        return val*100;
    }
}
public class Q1{
    public static void main(String[] args) {
        double val;
        Scanner sc=new Scanner(System.in);
        val=sc.nextDouble();
        double x,y,z;
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        Bank b1=new Bank();
        if(val-b1.convertRupees(x)-b1.convertDollars(y)-b1.convertPounds(z)<0)
        System.out.println("Insufficient Balance");
        else
        System.out.println(val-b1.convertRupees(x)-b1.convertDollars(y)-b1.convertPounds(z));
        sc.close();
    }
}