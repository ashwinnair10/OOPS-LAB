import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            ans=s.charAt(i)+ans;
        }
        System.out.println("Reversed String: "+ans);
        sc.close();
        return;
    }
}