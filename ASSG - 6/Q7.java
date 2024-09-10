abstract class Person{
    String name,id,dept;
    Person(String n,String i,String d){
        name=n;
        id=i;
        dept=d;
    }
    abstract String getRole();
    abstract double calculateWorkload();
    String getDetails(){
        return "Name: "+name+" ID: "+id+" Department: "+dept;
    }
}
interface Responsibility{
    void listResponsibilities();
}
class Professor extends Person implements Responsibility{
    int coursesTaught,researchProjects;
    Professor(String n,String i,String d,int c,int r){
        super(n,i,d);
        coursesTaught=c;
        researchProjects=r;
    }
    String getRole(){
        return "Professor";
    }
    public void listResponsibilities(){
        System.out.println("Responsibilities: Teaching, Research, Mentoring Students");
    }
    double calculateWorkload(){
        return (coursesTaught*3)+(researchProjects*2);
    }
}
class Student extends Person{
    int creditsEnrolled;
    double gpa;
    Student(String n,String i,String d,int c,double g){
        super(n,i,d);
        creditsEnrolled=c;
        gpa=g;
    }
    String getRole(){
        return "Student";
    }
    double calculateWorkload(){
        return creditsEnrolled;
    }
}
class AdministrativeStaff extends Person implements Responsibility{
    int tasksHandled;
    AdministrativeStaff(String n,String i,String d,int t){
        super(n,i,d);
        tasksHandled=t;
    }
    @Override
    String getRole(){
        return "Administrative Staff";
    }
    public void listResponsibilities(){
        System.out.println("Responsibilities: Managing Files, Organizing Events, Supporting Faculty");
    }
    double calculateWorkload(){
        return tasksHandled*1.5;
    }
}
class NITCalicutManagement{
    void main(){
        Professor professor = new Professor("Dr. John Doe", "P123", "Computer Science", 3, 2);
        Student student = new Student("Alice Smith", "S456", "Electrical Engineering", 18, 3.8);
        AdministrativeStaff adminStaff = new AdministrativeStaff("Mr. Mark Johnson", "A789", "Administration", 10);
        // Display details, role, and workload of each person
        System.out.println(professor.getDetails());
        System.out.println("Role: " + professor.getRole());
        System.out.println("Workload: " + professor.calculateWorkload());
        professor.listResponsibilities();
        System.out.println("\n" + student.getDetails());
        System.out.println("Role: " + student.getRole());
        System.out.println("Workload: " + student.calculateWorkload());
        System.out.println("\n" + adminStaff.getDetails());
        System.out.println("Role: " + adminStaff.getRole());
        System.out.println("Workload: " + adminStaff.calculateWorkload());
        adminStaff.listResponsibilities(); 
    }
}
public class Q7{
    public static void main(String[] args) {
        NITCalicutManagement n=new NITCalicutManagement();
        n.main();
    }
}