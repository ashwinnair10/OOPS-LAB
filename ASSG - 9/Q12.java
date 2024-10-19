import java.util.*;
import java.util.stream.Collectors;
class Student2{
    String name;
    int age;
    Student2(String n,int a){
        name=n;
        age=a;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name;
    }
}
public class Q12{
    public static void main(String[] args) {
        List<Student2> list=new ArrayList<Student2>();
        for(int i=0;i<10;i++){
            list.add(new Student2("student"+(i+1),(int)(20*Math.random())));
        }
        Map<Integer,List<Student2>> map=list.stream().collect(Collectors.groupingBy(Student2::getAge));
        System.out.println(map);
    }
}