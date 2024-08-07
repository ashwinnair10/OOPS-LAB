import java.util.*;
public class Q11{
    class EmployeeManager{
        HashSet<Integer> set=new HashSet<Integer>();
        boolean addEmployeeID(int x){
            if(set.contains(x)==true){
                return false;
            }
            else{
                set.add(x);
                return true;
            }
        }
        boolean removeEmployeeID(int x){
            if(set.contains(x)==true){
                set.remove(x);
                return true;
            }
            else{
                return false;
            }
        }
        void displayID(){
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q11 o=new Q11();
        Q11.EmployeeManager obj=o.new EmployeeManager();
        while(true){
            System.out.println("1.ADD\n2.REMOVE\n3.DISPLAY\n4.EXIT");
            int n=sc.nextInt();
            int id;
            if(n==4)
            break;
            switch(n){
                case 1:System.out.println("Enter ID:");
                        id=sc.nextInt();
                        System.out.println(obj.addEmployeeID(id));
                    break;
                case 2:System.out.println("Enter ID:");
                        id=sc.nextInt();
                        System.out.println(obj.removeEmployeeID(id));
                        break;
                case 3:obj.displayID();
                        break;
                default:System.out.println("Invalid");
                    break;
            }
        }
        sc.close();
    }
}