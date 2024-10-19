import java.util.*;
public class Q2{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.forEach(System.out::println);
    }
}