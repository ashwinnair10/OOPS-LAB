package Q10.department;
import Q10.company.*;
public class Office{
    Employee employee;
    Manager manager;
    public Office(Employee e,Manager m){
        employee=e;
        manager=m;
    }
    public void main(){
        System.out.println(employee.getName());
        manager.printName();
        manager.modifyName("Nandan Nair");
        manager.printName();
    }
}
