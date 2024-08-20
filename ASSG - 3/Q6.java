import java.util.*;
class Student{
    String name;
    int id;
    String major;
    Student(String n,int i,String m){
        name=n;
        id=i;
        major=m;
    }
}
class Professor{
    String name;
    int id;
    String dept;
    Professor(String n,int i,String d){
        name=n;
        id=i;
        dept=d;
    }
}
class Department{
    String name;
    ArrayList<Professor> professors=new ArrayList<Professor>();
    ArrayList<Student> students=new ArrayList<Student>();
    Department(String d){
        name=d;
    }
    void addprofessor(Professor p){
        professors.add(p);
    }
    void addstudent(Student s){
        students.add(s);
    }
    void listprofessors(){
        System.out.println("Professors:");
        for(int i=0;i<professors.size();i++){
            Professor p=professors.get(i);
            System.out.println("\tName:"+p.name+"\n\tID:"+p.id);
        }
    }
    void liststudents(){
        System.out.println("Students:");
        for(int i=0;i<students.size();i++){
            Student s=students.get(i);
            System.out.println("\tName:"+s.name+"\n\tID:"+s.id+"\n\tMajor:"+s.major);
        }
    }
}
class University{
    ArrayList<Department> departments=new ArrayList<Department>();
    String name;
    University(String n){
        name=n;
    }
    void adddepartment(Department d){
        departments.add(d);
    }
    void listdepartments(){
        System.out.println("Departments:");
        for(int i=0;i<departments.size();i++){
            Department d=departments.get(i);
            System.out.println(d.name);
        }
    }
    void listdepartmentinfo(String d){
        for(int i=0;i<departments.size();i++){
            if(departments.get(i).name.equals(d)){
                departments.get(i).listprofessors();
                departments.get(i).liststudents();
                return;
            }
        }
        System.out.println("Department not found");
    }
    void addprofessor(Professor p,String d){
        for(int i=0;i<departments.size();i++){
            if(departments.get(i).name.equals(d)){
                departments.get(i).addprofessor(p);
                return;
            }
        }
        System.out.println("Department not found");
    }
    void addstudent(Student s,String d){
        for(int i=0;i<departments.size();i++){
            if(departments.get(i).name.equals(d)){
                departments.get(i).addstudent(s);
                return;
            }
        }
        System.out.println("Department not found");
    }
}
public class Q6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter university name:");
        String s=sc.nextLine();
        University u=new University(s);
        int ch,id;
        String d,p,t,m;
        while(true){
            System.out.println("*************************************************\nMENU\n1.Add department\n2.Add professor\n3.Add Student\n4.List Departments\n5.List Department Info\n6.Exit\n*************************************************");
            ch=sc.nextInt();
            sc.nextLine();
            if(ch==6)
            break;
            switch(ch){
                case 1:
                System.out.println("Enter department name:");
                d=sc.nextLine();
                u.adddepartment(new Department(d));
                break;
                case 2:
                System.out.println("Enter department:");
                d=sc.nextLine();
                System.out.println("Enter professor name:");
                p=sc.nextLine();
                System.out.println("Enter professor ID:");
                id=sc.nextInt();
                u.addprofessor(new Professor(p,id,d),d);
                break;
                case 3:
                System.out.println("Enter department:");
                d=sc.nextLine();
                System.out.println("Enter student name:");
                t=sc.nextLine();
                System.out.println("Enter student ID:");
                id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter major:");
                m=sc.nextLine();
                u.addstudent(new Student(t,id,m),d);
                break;
                case 4:
                u.listdepartments();
                break;
                case 5:
                System.out.println("Enter department:");
                d=sc.nextLine();
                u.listdepartmentinfo(d);
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }
        }
        sc.close();
    }
}