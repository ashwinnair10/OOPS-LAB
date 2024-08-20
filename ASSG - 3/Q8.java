class Employee{
    String name,address,phone;
    int age;
    double salary;
    Employee(String n,String a,String p,int ag){
        name=n;
        address=a;
        phone=p;
        age=ag;
        salary=0;
    }
    void getDetails(){
        System.out.println("Name:"+name+"\nAge:"+age+"\nAddress:"+address+"\nPhone Number:"+phone+"\nSalary:"+salary);
    }
    void updateDetails(String n,String a,String p,int ag,double sal){
        name=n;
        address=a;
        phone=p;
        age=ag;
        salary=sal;
    }
    void calculateAnnualSalary(){
        salary=3000000;
    }
}
class Officer extends Employee{
    String specialization;
    Officer(String n,String a,String p,int ag,String sp){
        super(n,a,p,ag);
        specialization=sp;
    }
    void getSpecialization(){
        System.out.println(specialization);
    }
    void updateSpecialization(String s){
        specialization=s;
    }
    void calculateSalary(){
        salary+=20000;
    }
}
class Manager extends Employee{
    String department;
    Manager(String n,String a,String p,int ag,String dep){
        super(n,a,p,ag);
        department=dep;
    }
    void getDepartment(){
        System.out.println(department);
    }
    void updateDepartment(String d){
        department=d;
    }
    void calculateSalary(){
        salary+=100000;
    }
}
public class Q8{
    public static void main(String[] args) {
        Employee e=new Employee("Navaneeth DS","Kozhikode","9876543210",21);
        Officer o=new Officer("Ashwin A Nair","Angamaly","7756012744",19,"Applications Development");
        Manager m=new Manager("Sneha Biju Kurup","Pathanamthitta","8036729747",20,"Product Services");

        System.out.println("Employee function testing");
        System.out.println("Name:"+e.name+"\nAddress:"+e.address+"\nPhone number:"+e.phone+"\nAge:"+e.age);
        e.calculateAnnualSalary();
        System.out.println("Salary:"+e.salary);
        System.out.println();

        System.out.println("Officer function testing");
        System.out.println("Name:"+o.name+"\nAddress:"+o.address+"\nPhone number:"+o.phone+"\nAge:"+o.age+"\nSpecialization:"+o.specialization);
        o.calculateAnnualSalary();
        o.calculateSalary();
        System.out.println("Salary:"+o.salary);
        System.out.println();        

        System.out.println("Manager function testing");
        System.out.println("Name:"+m.name+"\nAddress:"+m.address+"\nPhone number:"+m.phone+"\nAge:"+m.age+"\nDepartment:"+m.department);
        m.calculateAnnualSalary();
        m.calculateSalary();
        System.out.println("Salary:"+m.salary);
        System.out.println();
    }
}