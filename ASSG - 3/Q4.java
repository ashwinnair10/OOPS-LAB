class Book{
    String title,author;
    int yearPublished;
    double price;
    Book(String t,String a,int y,double p){
        title=t;
        author=a;
        yearPublished=y;
        price=p;
    }
    void displayDetails(){
        System.out.println("Title:"+title+"\nAuthor:"+author+"\nPrice:$"+price+"\nYear Published:"+yearPublished+"\n");
    }
}
class Library{
    void main(){
        Book b1=new Book("The Great Gatsby","F. Scott Fitzgerald",1925,10.99);
        Book b2=new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99);
        Book b3=new Book("1984","George Orwell",1949,8.99);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
public class Q4{
    public static void main(String[] args) {
        Library obj=new Library();
        obj.main();
    }
}