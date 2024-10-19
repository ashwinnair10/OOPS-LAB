import java.util.*;
public class Q6{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Apple");
        list.add("Three");
        list.add("Ashwin");
        list.stream().filter(l->l.startsWith("A")).forEach(System.out::println);
    }
}