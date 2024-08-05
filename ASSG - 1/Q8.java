import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter number of columns:");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[n][m];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                b[j][i]=a[i][j];
            }
            System.out.println();
        }
        System.out.println("Transpose:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        return;
    }
}