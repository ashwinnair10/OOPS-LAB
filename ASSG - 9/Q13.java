import java.util.*;
public class Q13{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add((int)(10*Math.random())+1);
        }
        int ans=list.stream().reduce(1,(m,l)->m*l);
        list.forEach(System.out::println);
        System.out.println(ans);
    }
}