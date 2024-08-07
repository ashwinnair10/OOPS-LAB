import java.util.*;
public class Q12{
    class Object implements Comparable<Object>{
        private final int p;
        private final String s;
        public Object(int p,String s){
            this.p=p;
            this.s=s;
        }
        @Override
        public int compareTo(Object obj){
            return Integer.compare(this.p,obj.p);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    }
}