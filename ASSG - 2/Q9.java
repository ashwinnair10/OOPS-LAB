import java.util.*;
public class Q9 {
    public class Student{
        int rollno,height,weight;
        String name,teacher;
        Student(String n,String t,int rn,int h,int w){
            rollno=rn;
            height=h;
            weight=w;
            name=n;
            teacher=t;
        }
    }
    public class Teacher{
        int id;
        String name;
        Teacher(String n,int i){
            name=n;
            id=i;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q8 o=new Q8();
        System.out.println("Enter no. of teachers: ");
        int tn=sc.nextInt();
        sc.nextLine();
        ArrayList<Q8.Teacher> teachers=new ArrayList<Q8.Teacher>();
        for(int i=0;i<tn;i++){
            String k;
            System.out.println("Enter teacher "+(i+1)+":");
            k=sc.nextLine();
            Q8.Teacher t=o.new Teacher(k,i);
            teachers.add(t);
        }
        System.out.println("Enter no. of Students: ");
        int sn=sc.nextInt();
        //Q8.Student students[]=new Q8.Student[sn];
        ArrayList<Q8.Student> students=new ArrayList<Q8.Student>();
        for(int i=0;i<sn;i++){
            String k;
            sc.nextLine();
            System.out.println("Enter name:");
            k=sc.nextLine();
            System.out.println("Enter roll no.:");
            int roll=sc.nextInt();
            System.out.println("Enter height:");
            int h=sc.nextInt();
            System.out.println("Enter weight:");
            int w=sc.nextInt();
            System.out.println("Available Teachers:");
            for(int j=0;j<tn;j++){
                System.out.println((teachers.get(j).id+1)+". "+teachers.get(j).name);
            }
            System.out.println("Choose teacher by ID:");
            int inp=sc.nextInt();
            Q8.Student s=o.new Student(k,teachers.get(inp-1).name,roll,h,w);
            students.add(s);
        }
        for(int i=0;i<sn;i++){
            for(int j=i+1;j<sn;j++){
                if(students.get(i).height>students.get(j).height){
                    Q8.Student temp=students.get(i);
                    students.set(i,students.get(j));
                    students.set(j,temp);
                }
            }
        }
        System.out.println("All students sorted by height:");
        for(int i=0;i<sn;i++){
            System.out.println("Name:"+students.get(i).name+"\nRoll No.:"+students.get(i).rollno+"\nHeight:"+students.get(i).height+"\nWeight:"+students.get(i).weight+"\nAssigned Teacher:"+students.get(i).teacher);
        }
        sc.close();
    }
}
