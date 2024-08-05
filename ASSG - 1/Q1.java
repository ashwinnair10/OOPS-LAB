import java.util.*;
public class Q1{
    public static int fact(int n){
        if(n==0||n==1)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println("Factorial:"+ans);
        System.out.println("Recursive Factorial:"+fact(n));
        sc.close();
        return;
    }
}