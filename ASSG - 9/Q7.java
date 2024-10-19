import java.util.*;
import java.util.stream.Collectors;
public class Q7{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> newlist=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Apple");
        list.add("Three");
        list.add("Ashwin");
        newlist=list.stream().filter(l->l.startsWith("A")).collect(Collectors.toList());
        newlist.stream().forEach(System.out::println);
    }
}