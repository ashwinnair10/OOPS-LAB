import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter element to be searched:");
        int ele=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==ele){
                System.out.println("Element found at index: "+m);
                sc.close();
                return;
            }
            else if(arr[m]>ele){
                r=m-1;
            }
            else
            l=m+1;
        }
        System.out.println("Element not found");
        sc.close();
        return;
    }
}
