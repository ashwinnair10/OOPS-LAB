class Animal{
    String name;
    Animal(String n){
        name=n;
    }
    void sound(){
        System.out.println("Animal sound called");
        System.out.println("Name: "+name);
    }
}
class Mammal extends Animal{
    int age;
    Mammal(String n,int a){
        super(n);
        age=a;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println("Mammal sound called");
        System.out.println("Age: "+age);
    }
}
class Dog extends Mammal{
    String breed;
    Dog(String n,int a,String b){
        super(n,a);
        breed=b;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println("Dog sound called");
        System.out.println("Breed: "+breed);
    }
}
class Puppy extends Dog{
    String nickName;
    Puppy(String n,int a,String b,String nn){
        super(n,a,b);
        nickName=nn;
    }
    @Override
    void sound(){
        super.sound();
        System.out.println("Puppy sound called");
        System.out.println("NickName: "+nickName);
    }
}
public class Q5{
    public static void main(String[] args) {
        Puppy p=new Puppy("Buddy",4,"Golden Retriever","Say");
        p.sound();
    }
}