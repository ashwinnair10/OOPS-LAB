import java.util.*;
public class Q5{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.stream().map(l->l.length()).forEach(System.out::println);
    }
}