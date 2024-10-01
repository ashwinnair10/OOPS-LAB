abstract class Employee{
    int id,leaveDays;
    String name;
    Employee(String n,int i,int l){
        id=i;
        name=n;
        leaveDays=l;
    }
    abstract double calculateSalary();
    abstract double calculateLeaveDeduction();
}
class FullTimeEmployee extends Employee{
    String position;
    double baseSalary;
    FullTimeEmployee(String n,int i,String pos,double b,int l){
        super(n,i,l);
        position=pos;
        baseSalary=b;
    }
    @Override
    double calculateSalary(){
        return baseSalary-calculateLeaveDeduction()+(position.equals("Manager")?10000:20000);
    }
    @Override
    double calculateLeaveDeduction(){
        return leaveDays*1000;
    }
    double calculatePerformanceBonus(int p){
        return 30*p;
    }
}
class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyWage;
    PartTimeEmployee(String n,int i,int h,double hw,int l){
        super(n,i,l);
        hoursWorked=h;
        hourlyWage=hw;
    }
    @Override
    double calculateSalary(){
        return (hoursWorked*hourlyWage)-calculateLeaveDeduction();
    }
    double calculateSalary(boolean extra){
        return (hoursWorked*hourlyWage)-calculateLeaveDeduction()+100;
    }
    @Override
    double calculateLeaveDeduction(){
        return leaveDays*10*hourlyWage;
    }
    double calculatePerformanceBonus(int p){
        return 6.25*p;
    }
}
public class Q3{
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, "Manager",50000, 2);
        System.out.println("Full-Time Salary (Manager, after leave deduction): " +fullTimeEmployee.calculateSalary());
        System.out.println("Full-Time Performance Bonus: " +fullTimeEmployee.calculatePerformanceBonus(92));
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 45, 20, 1);
        System.out.println("Part-Time Salary (with bonus, after leave deduction): " +partTimeEmployee.calculateSalary(true));
        System.out.println("Part-Time Performance Bonus: " +partTimeEmployee.calculatePerformanceBonus(87));
    }
}