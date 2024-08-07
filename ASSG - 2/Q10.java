import java.util.*;
public class Q10 {
    public class Book{
        int id;
        String title,author;
        Book(String t,String auth,int i){
            title=t;
            author=auth;
            id=i;
        }
    }
    public static void delete(ArrayList<Q10.Book> a,int id){
        for(int i=0;i<a.size();i++){
            if(a.get(i).id==id){
                a.remove(i);
                return;
            }
        }
        System.out.println("Invalid");
        return;
    }
    public static void search(ArrayList<Q10.Book> a,String s){
        for(int i=0;i<a.size();i++){
            if(s.equals(a.get(i).title)){
                System.out.println(a.get(i).id+" "+a.get(i).title+" "+a.get(i).author);
                return;
            }
        }
        System.out.println("Invalid");
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q10 o=new Q10();
        ArrayList<Q10.Book> a=new ArrayList<Q10.Book>();
        while(true){
            System.out.println("Menu\n1.Add Book\n2.Remove Book\n3.List Books\n4.Find Book\n5.Exit");
            int n=sc.nextInt();
            String t,auth;
            int i;
            if(n==5)
            break;
            switch(n){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter title:");
                    t=sc.nextLine();
                    System.out.println("Enter author");
                    auth=sc.nextLine();
                    System.out.println("Enter ID:");
                    i=sc.nextInt();
                    a.add(o.new Book(t,auth,i));
                    break;
                case 2:
                    System.out.println("Enter ID:");
                    i=sc.nextInt();
                    delete(a,i);
                    break;
                case 3:
                    for(i=0;i<a.size();i++)
                    System.out.println(a.get(i).id+" "+a.get(i).title+" "+a.get(i).author);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter title:");
                    t=sc.nextLine();
                    search(a,t);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
        sc.close();
    }
}