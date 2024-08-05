import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        s=s.toLowerCase();
        System.out.println(s);
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-97]++;
        }
        System.out.println("Frequency:");
        for(int i=0;i<26;i++){
            System.out.println((char)(i+97)+" : "+a[i]);
        }
        sc.close();
        return;
    }
}