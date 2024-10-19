import java.util.*;
class Student1{
    String name;
    int age;
    Student1(String n,int a){
        name=n;
        age=a;
    }
}
public class Q11{
    public static void main(String[] args) {
        List<Student1> list=new ArrayList<Student1>();
        for(int i=0;i<10;i++){
            list.add(new Student1("student"+(i+1),(int)(20*Math.random())));
        }
        list.stream().sorted((s1,s2)->s1.age-s2.age).forEach(s->System.out.println("Name:"+s.name+" Age:"+s.age));
    }
}