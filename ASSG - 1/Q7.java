import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        System.out.println("MENU:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter choice:");
        int ch=sc.nextInt();
        int ans=0;
        switch(ch){
            case 1: ans=a+b;break;
            case 2: ans=a-b;break;
            case 3: ans=a*b;break;
            case 4: if(b!=0){
                        ans=a/b;
                    }
                    else{
                        System.out.println("Invalid");
                        sc.close();
                        return;
                    }
                    break;
            default:System.out.println("Invalid");sc.close();return;
        }
        System.out.println("Answer:"+ans);
        sc.close();
        return;
    }
}