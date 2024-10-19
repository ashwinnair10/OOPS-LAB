import java.util.*;
class Student{
    String name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
    }
}
public class Q10{
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        for(int i=0;i<10;i++){
            list.add(new Student("student"+(i+1),(int)(20*Math.random())));
        }
        int avg=list.stream().mapToInt(s->s.age).sum()/list.size();
        list.forEach(s->System.out.println("Name:"+s.name+" Age:"+s.age));
        System.out.println("Average: "+avg);
    }
}