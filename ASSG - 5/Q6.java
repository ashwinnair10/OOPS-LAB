import java.util.*;
interface Borrowable{
    void checkIn(String user);
    void checkOut();
}
abstract class Book implements Borrowable{
    int bookID;
    String title,author;
    Book(int bi,String t,String a){
        bookID=bi;
        title=t;
        author=a;
    }
    void display(){
        System.out.println("Book: "+bookID+": "+title+": "+author);
    }
}
class TextBooks extends Book{
    String status,borrowedUser;
    TextBooks(int bi,String t,String a){
        super(bi,t,a);
        status="Available";
        borrowedUser="";
    }
    public void checkIn(String user){
        if(status.equals("Available")==false){
            System.out.println("Book already borrowed");
            return;
        }
        status="Borrowed by "+user;
        borrowedUser=user;
    }
    public void checkOut(){
        status="Available";
        borrowedUser="";
    }
    @Override
    void display(){
        System.out.println("TextBook: "+bookID+": "+title+": "+author+": "+status);
    }
}
class ReferenceBooks extends Book{
    ReferenceBooks(int bi,String t,String a){
        super(bi,t,a);
    }
    public void checkIn(String user){
        System.out.println("Cannot be borrowed");
    }
    public void checkOut(){
        System.out.println("Invalid");
    }
    @Override
    void display(){
        System.out.println("ReferenceBook: "+bookID+": "+title+": "+author);
    }
}
class Library{
    ArrayList<Book> books=new ArrayList<>();
    void addBook(Book b){
        books.add(b);
    }
    void list(){
        for(int i=0;i<books.size();i++)
        books.get(i).display();
    }
    void checkOut(int id){
        for(int i=0;i<books.size();i++){
            if(books.get(i).bookID==id){
                books.get(i).checkOut();
            }
        }
    }
    void checkIn(int id,String user){
        for(int i=0;i<books.size();i++){
            if(books.get(i).bookID==id){
                books.get(i).checkIn(user);
            }
        }
    }
}
public class Q6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Add Reference Book\n2. Add Text Book\n3. Check-Out\n4. Check-In\n5. List Books\n6. Exit");
        Library l=new Library();
        int ch,id;
        String t,a,n;
        while(true){
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            if(ch==6)
            break;
            switch(ch){
                case 1:System.out.println("Enter ID,Title and Author (Line by line)");
                       id=sc.nextInt();
                       sc.nextLine();
                       t=sc.nextLine();
                       a=sc.nextLine();
                       l.addBook(new ReferenceBooks(id,t,a));
                       break;
                case 2:System.out.println("Enter ID,Title and Author (Line by line)");
                       id=sc.nextInt();
                       sc.nextLine();
                       t=sc.nextLine();
                       a=sc.nextLine();
                       l.addBook(new TextBooks(id,t,a)); 
                       break;
                case 3:System.out.println("Enter Book ID:");
                       id=sc.nextInt();
                       l.checkOut(id);
                       break;
                case 4:System.out.println("Enter Book ID:");
                       id=sc.nextInt();
                       sc.nextLine();
                       System.out.println("Enter Username:");
                       n=sc.nextLine();
                       l.checkIn(id,n);
                       break;
                case 5:l.list();
                       break;
                default:System.out.println("Invalid choice");
                        break;
            }
        }
        sc.close();
    }
}
