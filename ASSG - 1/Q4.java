import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        s=s.toLowerCase();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("Vowel present");
                sc.close();
                return;
            }
        }
        System.out.println("Vowel not present");
        sc.close();
        return;
    }
}