import java.util.*;
public class Q4 {
    public static int test(int a[],int i,int ans){
        if(i<0)
        return ans;
        ans=Math.max(ans,a[i]);
        return test(a,i-1,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int ans=Integer.MIN_VALUE;
        System.out.println("Max: "+test(a,a.length-1,ans));
        sc.close();
    }
}
