import java.util.*;
class UnderflowException extends Exception{
    public UnderflowException(){
        super();
    }
}
public class Q3{
    public static void enqueue(ArrayList<Integer> a,int x){
        a.add(x);
        System.out.print("Success ");
    }
    public static void dequeue(ArrayList<Integer> a)throws UnderflowException{
        if(a.size()!=0){
            System.out.print(a.get(0)+" ");
            a.remove(0);
        }
        else{
            throw new UnderflowException();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        char op;
        int x;
        while(true){
            op=sc.next().charAt(0);
            if(op=='E'){
                x=sc.nextInt();
                enqueue(a,x);
            }
            else if(op=='D'){
                try{
                    dequeue(a);
                }
                catch(UnderflowException e){
                    System.out.print("EmptyQueue ");
                }
            }
            else if(op=='X')
            break;
            else
            System.out.print("Invalid Operation ");
        }
        sc.close();
    }
}