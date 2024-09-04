import java.util.*;
interface HDFC{
    void htransact(double x,double y);
}
interface ICICI{
    void itransact(double x,double y);
}
class Flipkart implements HDFC,ICICI{
    double amount;
    public void htransact(double x,double y){
        amount+=y;
        System.out.println(amount+" "+(x-y));
    }
    public void itransact(double x,double y){
        amount+=y;
        System.out.println(amount+" "+(x-y));
    }
}
public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String s;
        double x,y;
        Flipkart f=new Flipkart();
        while((n--)!=0){
            s=sc.next();
            x=sc.nextDouble();
            y=sc.nextDouble();
            if(s.equals("HDFC"))
            f.htransact(x,y);
            if(s.equals("ICICI"))
            f.itransact(x,y);
        }
        sc.close();
    }
}