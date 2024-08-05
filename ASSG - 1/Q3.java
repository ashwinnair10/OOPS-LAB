import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        String name[]=new String[n];
        int roll[]=new int[n];
        System.out.println("Enter name and roll no. of students");
        for(int i=0;i<n;i++){
            name[i]=sc.next();
            roll[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(roll[i]>roll[j]){
                    int t=roll[i];
                    roll[i]=roll[j];
                    roll[j]=t;
                    String s=name[i];
                    name[i]=name[j];
                    name[j]=s;
                }
            }
        }
        System.out.println("Sorted order:");
        for(int i=0;i<n;i++){
            System.out.println(name[i]+" "+roll[i]);
        }
        sc.close();
        return;
    }
}