//package company
//make all classes public while in package
class Employee{
    protected String name;
    Employee(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}
class Manager extends Employee{
    Manager(String n){
        super(n);
    }
    void printName(){
        System.out.println(name);
    }
}
//package department
class Office{
    Employee employee;
    Manager manager;
    Office(Employee e,Manager m){
        employee=e;
        manager=m;
    }
    void main(){
        System.out.println(employee.getName());
        employee.name="James Bond";
        System.out.println(employee.getName());
        manager.printName();
        manager.name="Navaneeth";
        manager.printName();
    }
}
//import company.*;
//import department.*;
public class Q10{
    public static void main(String[] args) {
        Employee e=new Employee("Ashwin A Nair");
        Manager m=new Manager("Ashwin");
        Office o=new Office(e,m);
        o.main();
    }
}