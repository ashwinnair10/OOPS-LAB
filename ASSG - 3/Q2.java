import java.util.*;
class OverflowException extends Exception{
    public OverflowException(){
        super();
    }
}
public class Q2{
    public static void test(int i,int j)throws OverflowException{
        if(i<=0||j<=0||i>8||j>8)
        throw new OverflowException();
    }
    public static void main(String[] args){
        String dir;
        int m,r,c,p;
        Scanner sc=new Scanner(System.in);
        String start;
        start=sc.next();
        r=start.charAt(0)-'0';
        c=start.charAt(1)-'0';
        m=sc.nextInt();
        try{
            for(int i=0;i<m;i++){
                dir=sc.next();
                p=sc.nextInt();
                if(dir.equals("Up"))
                r-=p;
                else if(dir.equals("Down"))
                r+=p;
                else if(dir.equals("Right"))
                c+=p;
                else if(dir.equals("Left"))
                c-=p;
                test(r,c);
            }
            System.out.println("["+r+","+c+"]");
        }
        catch(OverflowException e){
            System.out.println("Overflow");
        }
        sc.close();
    }
}