import java.util.*;
class Student4{
    String name;
    int age;
    Student4(String n,int a){
        name=n;
        age=a;
    }
}
public class Q14{
    public static void main(String[] args) {
        List<Student4> list=new ArrayList<Student4>();
        for(int i=0;i<10;i++){
            list.add(new Student4("Student"+(i+1),(int)(20*Math.random())));
        }
        Optional<Student4> s=list.stream().reduce((s1,s2)->s1.age>s2.age?s1:s2);
        s.ifPresent(x->System.out.println(x.name));
    }
}