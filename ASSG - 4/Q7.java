class Employee{
    String name;
    double salary;
    Employee(String n,double s){
        name=n;
        salary=s;
    }
    void displayDetails(){
        System.out.println("Name: "+name+"\nSalary: "+salary);
    }
}
class Manager extends Employee{
    String departmentName;
    Manager(String n,double d,String de){
        super(n,d);
        departmentName=de;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+name+"\nSalary: "+salary+"\nDepartment Name: "+departmentName);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String n,double d,String p){
        super(n,d);
        programmingLanguage=p;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+name+"\nSalary: "+salary+"\nProgramming Language: "+programmingLanguage);
    }
}
public class Q7{
    public static void main(String[] args) {
        Manager m=new Manager("Nandan Nair", 9000000, "Accounts");
        m.displayDetails();
        Developer d=new Developer("Ashwin A Nair", 3600000, "Java");
        d.displayDetails();
    }
}