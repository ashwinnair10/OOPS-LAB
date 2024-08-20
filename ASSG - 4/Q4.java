import java.util.*;
class Author{
    String name,nationality;
    Author(String na,String nt){
        name=na;
        nationality=nt;
    }
    String getName(){
        return name;
    }
    String getNationality(){
        return nationality;
    }
    void displayAuthorInfo(){
        System.out.println("Author Name:"+name+"\nAuthor Nationality:"+nationality+"\n");
    }
}
class Book{
    String title,isbn;
    Author author;
    Book(String t,String i,Author a){
        title=t;
        isbn=i;
        author=a;
    }
    String getTitle(){
        return title;
    }
    String getIsbn(){
        return isbn;
    }
    void displayBookInfo(){
        System.out.println("Title: "+title+"\nISBN: "+isbn);
        author.displayAuthorInfo();
    }
}
class Library{
    ArrayList<Book> books=new ArrayList<>();
    void addBook(Book b){
        books.add(b);
    }
    void displayBooks(){
        for(int i=0;i<books.size();i++)
        books.get(i).displayBookInfo();
    }
}
public class Q4{
    public static void main(String[] args) {
        Author a1=new Author("JK Rowling","UK");
        a1.displayAuthorInfo();
        Author a2=new Author("Amish","India");
        a2.displayAuthorInfo();
        Book b1=new Book("Harry Potter and the Philosopher's Stone","12236767494",a1);
        b1.displayBookInfo();
        Book b2=new Book("The Scion of Ishkvaku","64728371092",a2);
        b2.displayBookInfo();
        Book b3=new Book("Sita: The Warrior of Mithila","45682612430",a2);
        b3.displayBookInfo();
        Library l=new Library();
        l.addBook(b2);
        l.addBook(b3);
        l.displayBooks();
    }
}