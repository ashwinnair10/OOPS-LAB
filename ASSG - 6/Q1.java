import java.util.*;
class Ecommerce{
    double calculateTotalPrice(int n,double price){
        return n*price;
    }
    double calculateTotalPrice(ArrayList<Integer> n,ArrayList<Double> price){
        double ans=0;
        for(int i=0;i<n.size();i++)
        ans+=n.get(i)*price.get(i);
        return ans;
    }
    double calculateTotalPrice(double tot,double d){
        return tot*(1-(d/100));
    }
}
public class Q1{
    public static void main(String[] args){
        Ecommerce e=new Ecommerce();
        int n=5;
        double p=26.5,tot=2000,d=8;
        ArrayList<Integer> quantity=new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Double> price=new ArrayList<Double>(Arrays.asList(35.4,67.8,25.1));
        System.out.println("Quantity: "+n+" Price: "+p+" Total: "+e.calculateTotalPrice(n,p)+"\n");
        for(int i=0;i<quantity.size();i++){
            System.out.println(i+". Quantity: "+quantity.get(i)+" Price: "+price.get(i));
        }
        System.out.println("Total Amount: "+e.calculateTotalPrice(quantity,price)+"\n");
        System.out.println("Total Price: "+tot+" Discount: "+d+"% Discounted Amount: "+e.calculateTotalPrice(tot,d));
    }
}