package Q10.company;
public class Manager extends Employee{
    public Manager(String n){
        super(n);
    }
    public void printName(){
        System.out.println(name);
    }
    public void modifyName(String s){
        name=s;
    }
}
