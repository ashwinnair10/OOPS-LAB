import java.util.*;
public class Q3{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> newlist=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.forEach(l->newlist.add(l.toUpperCase()));
        newlist.forEach(System.out::println);
    }
}