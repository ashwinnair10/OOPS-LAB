import java.util.*;
class Entity{
    String name;
    Entity(String n){
        name=n;
    }
    @Override
    public String toString(){
        return name;
    }
}
class Employee extends Entity{
    String department;
    Employee(String n,String d){
        super(n);
        department=d;
    }
    @Override
    public String toString(){
        return name+" "+department;
    }
}
class Manager extends Employee{
    String position;
    Manager(String n,String d,String p){
        super(n,d);
        position=p;
    }
    @Override
    public String toString(){
        return name+" "+department+" "+position;
    }
}
class HierarchicalManager<T>{
    ArrayList<T> a=new ArrayList<T>();
    void add(T obj){
        a.add(obj);
    }
    void remove(T obj){
        for(int i=0;i<a.size();i++){
            if(a.get(i).toString().equals(obj.toString())){
                a.remove(i);
                return;
            }
        }
        System.out.println("Not found");
    }
    void printHierarchy(){
        for(int i=0;i<a.size();i++)
        System.out.println(a.get(i).toString());
        System.out.println();
    }
    ArrayList<T> getAllEntities(){
        return a;
    }
    ArrayList<T> getEntitiesByType(Class<? extends T> cl){
        ArrayList<T> arr=new ArrayList<T>();
        for(int i=0;i<a.size();i++){
            if(cl.isInstance(a.get(i))==true){
                arr.add(a.get(i));
            }
        }
        return arr;
    }
}
public class Q2{
    public static void main(String[] args) {
        HierarchicalManager<Entity> o=new HierarchicalManager<Entity>();
        o.add(new Entity("Ashwin"));
        o.printHierarchy();
        o.add(new Employee("James Bond","Accounts"));
        o.printHierarchy();
        o.add(new Manager("Sneha", "Software", "Deputy Manager"));
        o.printHierarchy();
        o.add(new Entity("John"));
        o.printHierarchy();
        o.remove(new Entity("John"));
        o.printHierarchy();
        ArrayList<Entity> a=o.getAllEntities();
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
        System.out.println();
        ArrayList<Entity> m=o.getEntitiesByType(Manager.class);
        for(int i=0;i<m.size();i++){
            System.out.println(m.get(i).toString());
        }
        System.out.println();
    }
}