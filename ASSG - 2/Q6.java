import java.util.*;
public class Q6 {
    public class Person {
        String name;
        int guest;
        int veg;
        int days;
        double cost;
        Person(String n,int g,int v,int d){
            name=n;
            guest=g;
            veg=v;
            days=d;
            cost=0.0;
        }
        void compute(){
            if(veg==0){
                cost=120*days;
            }
            else{
                cost=100*days;
            }
            if(guest==1)
            cost*=1.1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q6 obj=new Q6();
        int n;
        System.out.println("Enter number of employees:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            String name;
            int guest=0,veg=0,days=0;
            System.out.println("Enter name:");
            name=sc.next();
            System.out.println("Guest?(1:yes 0:no)");
            guest=sc.nextInt();
            System.out.println("Veg? (1:yes 0:no)");
            veg=sc.nextInt();
            System.out.println("Enter no. of days: ");
            days=sc.nextInt();
            Q6.Person o=obj.new Person(name,guest,veg,days);
            o.compute();
            System.out.println("Total bill for "+o.name+": "+o.cost);
            System.out.println();
        }
        sc.close();
    }
}
