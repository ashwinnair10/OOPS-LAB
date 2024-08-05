import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter substring to be checked:");
        String t=sc.nextLine();
        boolean ans=s.contains(t);
        System.out.println(ans);
        sc.close();
    }
}