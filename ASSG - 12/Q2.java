import java.util.*;
class Tuple{
    String a,b;
    Tuple(String a,String b){
        this.a=a;
        this.b=b;
    }
}
class SessionManager{
    static ArrayList<Tuple> list=new ArrayList<>();
    private static SessionManager obj=new SessionManager();
    private SessionManager(){
        list.add(new Tuple("ashwin","1234"));
        list.add(new Tuple("sneha","2345"));
        list.add(new Tuple("navaneeth","3465"));
    }
    public static SessionManager getInstance(){
        return obj;
    }
    public void login(String username,String password){
        for(int i=0;i<list.size();i++){
            if(list.get(i).a.equals(username)&&list.get(i).b.equals(password)){
                System.out.println("Logged in successfully as "+username);
                return;
            }
        }
        System.out.println("Invalid credentials");
        return;
    }
}
public class Q2{
    public static void main(String[] args) {
        SessionManager s=SessionManager.getInstance();
        s.login("ashwin","1234");
        s.login("sneha","2345");
        s.login("navaneeth","3456");
    }
}