import java.util.*;
public class Q1{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.forEach(l->System.out.println(l));
    }
}