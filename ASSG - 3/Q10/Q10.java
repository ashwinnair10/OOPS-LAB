package Q10;
import Q10.company.*;
import Q10.department.*;
public class Q10{
    public static void main(String[] args) {
        Employee e=new Employee("Ratheesh Babu");
        Manager m=new Manager("Bibin Thomas");
        Office o=new Office(e,m);
        o.main();
    }
}