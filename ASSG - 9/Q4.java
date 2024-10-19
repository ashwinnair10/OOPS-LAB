import java.util.*;
public class Q4{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.stream().map(String::toUpperCase).forEach(System.out::println);;
    }
}