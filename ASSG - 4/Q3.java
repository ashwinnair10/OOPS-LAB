class Employee{
    String name;
    double salary;
    int age;
    static int employeecount=0;
    Employee(String n,double d,int a){
        name=n;
        salary=d;
        age=a;
        employeecount++;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    void raiseSalary(){
        salary+=10000;
    }
    static int getEmployeeCount(){
        return employeecount;
    }
    void displayEmployeeInfo(){
        System.out.println("Employee Info:");
        System.out.println("Name:"+name+"\nSalary:"+salary+"\nAge:"+age);
        System.out.println();
    }
}
class Analyst extends Employee{
    String specialization;
    Analyst(String n,double d,int a,String s){
        super(n,d,a);
        specialization=s;
    }
    void displayAnalystInfo(){
        System.out.println("Analyst Info:");
        System.out.println("Name:"+name+"\nSalary:"+salary+"\nAge:"+age+"\nSpecialization:"+specialization);
        System.out.println();
    }
}
class Salesperson extends Employee{
    String region;
    Salesperson(String n,double d,int a,String r){
        super(n,d,a);
        region=r;
    }
    void displaySalespersonInfo(){
        System.out.println("Salesperson Info:");
        System.out.println("Name:"+name+"\nSalary:"+salary+"\nAge:"+age+"\nRegion:"+region);
        System.out.println();
    }
}
public class Q3{
    public static void main(String[] args) {
        Employee e=new Employee("John", 50000, 30);
        Analyst a=new Analyst("Alice", 60000, 28, "Data Analytics");
        Salesperson s=new Salesperson("Bob", 45000, 32, "Northwest");
        e.displayEmployeeInfo();
        a.displayAnalystInfo();
        s.displaySalespersonInfo();
        e.raiseSalary();
        a.raiseSalary();
        s.raiseSalary();
        System.out.print("After Raise in ");
        e.displayEmployeeInfo();
        System.out.print("After Raise in");
        a.displayAnalystInfo();
        System.out.print("After Raise in ");
        s.displaySalespersonInfo();
        System.out.println("Total Employees : "+Employee.getEmployeeCount());
    }
}