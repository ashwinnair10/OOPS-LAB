import java.util.*;
public class Q5 {
    public static String reverse(String s,String t,int i){
        if(i<0)
        return t;
        t+=s.charAt(i);
        return reverse(s,t,i-1);
    }
    public static void main(String[] args) {
        String s,t="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        s=sc.nextLine();
        t=reverse(s,t,s.length()-1);
        System.out.println("Reversed: "+t);
        sc.close();
    }
}
