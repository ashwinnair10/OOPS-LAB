import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s=sc.next();
        System.out.println("Enter string 2:");
        String t=sc.next();
        System.out.println("Before:\ns:"+s+"\nt:"+t);
        s+=t;
        t=s.substring(0,s.indexOf(t,s.length()-t.length()));
        s=s.substring(t.length());
        System.out.println("After:\ns:"+s+"\nt:"+t);
        sc.close();
        return;
    }
}