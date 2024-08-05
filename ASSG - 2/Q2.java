import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter string to be replaced:");
        String t=sc.nextLine();
        System.out.println("Enter string to be replaced with:");
        String u=sc.nextLine();
        s=s.replace(t,u);
        System.out.println("Replaced string: "+s);
        sc.close();
    }
}
