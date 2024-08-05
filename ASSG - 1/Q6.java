import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int fib[]=new int[n];
        if(n<=0)
        System.out.println("Invalid");
        else if(n==1)
        System.out.println("0");
        else if(n==2)
        System.out.println("0 1");
        else{
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<n;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            for(int i=0;i<n;i++)
            System.out.print(fib[i]+" ");
            System.out.println();
        }
        sc.close();
        return;
    }
}