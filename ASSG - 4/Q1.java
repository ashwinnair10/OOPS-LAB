import java.util.*;
class Product{
    String name,property;
    Product(String n,String p){
        name=n;
        property=p;
    }
    @Override
    public String toString(){
        return name+" "+property;
    }
}
class Electronics extends Product{
    String warrantyPeriod;
    Electronics(String n,String p,String w){
        super(n,p);
        warrantyPeriod=w;
    }
    @Override
    public String toString(){
        return name+" "+property+" "+warrantyPeriod;
    }
}
class Clothing extends Product{
    String size;
    Clothing(String n,String p,String s){
        super(n,p);
        size=s;
    }
    @Override
    public String toString(){
        return name+" "+property+" "+size;
    }
}
class Inventory<T>{
    ArrayList<T> inventory=new ArrayList<T>();
    void addProduct(T obj){
        inventory.add(obj);
    }
    void removeProduct(T obj){
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).toString().equals(obj.toString())){
                inventory.remove(i);
                return;
            }
        }
        System.out.println("Object not found");
    }
    void listProducts(){
        for(int i=0;i<inventory.size();i++){
            T obj=inventory.get(i);
            System.out.println(obj.toString());
        }
        System.out.println();
    }
}
public class Q1{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Inventory<Product> a=new Inventory<Product>();
        a.addProduct(new Product("Shoes","Sports"));
        a.listProducts();
        a.addProduct(new Electronics("PCB", "Hardware", "2 years"));
        a.listProducts();
        a.addProduct(new Clothing("Shirt", "Mens-wear", "M"));
        a.listProducts();
        a.removeProduct(new Electronics("PCB", "Hardware", "2 years"));
        a.listProducts();
        // while(true){
        //     System.out.println("1.Add\n2.Remove\n3.List\n4.Exit");
        //     int k=sc.nextInt();
        //     if(k==4)
        //     break;
        //     if(k==1){
        //         System.out.println("Enter name:");
        //         n=sc.next();
        //         System.out.println("Enter property:");
        //         p=sc.next();
        //         System.out.println("Enter warranty period:");
        //         x=sc.nextInt();
        //         a.addProduct(new Electronics(n,p,x));
        //     }
        //     if(k==2){
        //         System.out.println("Enter name:");
        //         n=sc.next();
        //         System.out.println("Enter property:");
        //         p=sc.next();
        //         System.out.println("Enter warranty period:");
        //         x=sc.nextInt();
        //         a.removeProduct(new Electronics(n,p,x));
        //     }
        //     if(k==3)
        //     a.listProducts();
        // }
        // sc.close();
    }
}