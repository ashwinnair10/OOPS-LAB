import java.util.*;
import java.util.function.Predicate;
public class Q8{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Apple");
        list.add("Three");
        list.add("Ashwin");
        Predicate<String> predicate=l->l.startsWith("A");
        list.stream().filter(predicate).forEach(System.out::println);
    }
}