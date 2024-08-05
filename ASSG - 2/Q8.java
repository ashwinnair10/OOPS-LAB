import java.util.*;
public class Q8 {
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
        Q8.Teacher teachers[]=new Q8.Teacher[tn];
        for(int i=0;i<tn;i++){
            String k;
            System.out.println("Enter teacher "+(i+1)+":");
            k=sc.nextLine();
            Q8.Teacher t=o.new Teacher(k,i);
            teachers[i]=t;
        }
        System.out.println("Enter no. of Students: ");
        int sn=sc.nextInt();
        Q8.Student students[]=new Q8.Student[sn];
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
                System.out.println((teachers[j].id+1)+". "+teachers[j].name);
            }
            System.out.println("Choose teacher by ID:");
            int inp=sc.nextInt();
            students[i]=o.new Student(k,teachers[inp-1].name,roll,h,w);
        }
        for(int i=0;i<sn;i++){
            for(int j=i+1;j<sn;j++){
                if(students[i].height>students[j].height){
                    Q8.Student temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }
        System.out.println("All students sorted by height:");
        for(int i=0;i<sn;i++){
            System.out.println("Name:"+students[i].name+"\nRoll No.:"+students[i].rollno+"\nHeight:"+students[i].height+"\nWeight:"+students[i].weight+"\nAssigned Teacher:"+students[i].teacher);
        }
        sc.close();
    }
}
