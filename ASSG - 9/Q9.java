import java.util.*;
public class Q9{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Apple");
        list.add("Three");
        list.add("Ashwin");
        int ans=list.stream().mapToInt(l->l.length()).sum();
        System.out.println(ans);
    }
}