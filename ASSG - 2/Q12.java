import java.util.*;
public class Q12{
    class Pq implements Comparable<Pq>{
        private final int p;
        private final String s;
        public Pq(int p,String s){
            this.p=p;
            this.s=s;
        }
        @Override
        public int compareTo(Pq obj){
            return Integer.compare(this.p,obj.p);
        }
        @Override
        public String toString(){
            return s;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q12 o=new Q12();
        PriorityQueue<Pq> q=new PriorityQueue<>();
        while(true){
            System.out.println("1.Add Task\n2.Process Task\n3.Display Task\n4.Exit");
            int n=sc.nextInt();
            String str;
            int p;
            if(n==4)
            break;
            switch(n){
                case 1: System.out.println("Enter task:");
                        sc.nextLine();
                        str=sc.nextLine();
                        System.out.println("Enter priority:");
                        p=sc.nextInt();
                        q.add(o.new Pq(p,str));
                        break;
                case 2: System.out.println(q.poll());
                        break;
                case 3: System.out.println(q.peek());
                        break;
                default:System.out.println("Invalid");
                        break;
            }
        }
        sc.close();
    }
}
