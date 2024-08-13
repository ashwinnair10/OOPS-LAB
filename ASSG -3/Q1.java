import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        int a,b;
        try{
            c=sc.next().charAt(0);
            a=sc.nextInt();
            b=sc.nextInt();
            if(c=='+')
            System.out.println(a+b);
            else if(c=='-')
            System.out.println(a-b);
            else if(c=='*')
            System.out.println(a*b);
            else if(c=='/')
            System.out.println(a/b);
            else if(c=='^')
            System.out.println((int)Math.pow(a,b));
            else
            System.out.println("Invalid Operator");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument");
        }
        catch(InputMismatchException e){
            System.out.println("InpuMismatchException: Invalid input. Enter a valid argument.");
        }
        sc.close();
        return;
    }
}