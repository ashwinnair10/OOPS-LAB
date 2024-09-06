import java.util.*;
interface OrderStudents{
    void OrderByRollNo();
    void OrderByName();
}
class Student{
    String name,address;
    int rollno;
    Student(String n,int r,String a){
        name=n;
        address=a;
        rollno=r;
    }
    void displayDetails(){
        System.out.println(rollno+" "+name+" "+address);
    }
}
class Students implements OrderStudents{
    ArrayList<Student> students=new ArrayList<>();
    void addStudent(Student s){
        students.add(s);
    }
    void display(){
        for(int i=0;i<students.size();i++){
            students.get(i).displayDetails();
        }
    }
    public void OrderByName(){
        Collections.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2){
                return s1.name.compareTo(s2.name);
            }
        });
        display();
    }
    public void OrderByRollNo(){
        Collections.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2){
                return s1.rollno<s2.rollno?-1:1;
            }
        });
        display();
    }
}
public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        String na,a;
        Students s=new Students();
        while((n--)>0){
            r=sc.nextInt();
            na=sc.next();
            a=sc.next();
            s.addStudent(new Student(na,r,a));
        }
        System.out.println("//Sorted by Rollno");
        s.OrderByRollNo();
        System.out.println("\n//Sorted by Name");
        s.OrderByName();
        sc.close();
    }
}