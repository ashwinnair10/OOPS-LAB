import java.util.*;
import java.util.stream.Collectors;
class PFMap{
    String name;
    Fruit fruit;
    PFMap(String n,Fruit f){
        name=n;
        fruit=f;
    }
    public Fruit getFruit(){
        return fruit;
    }
}
class Fruit{
    String name;
    double price;
    Fruit(String n,double p){
        name=n;
        price=p;
    }
    @Override
    public String toString(){
        return name+" ";
    }
}
public class Q15{
    public static void main(String[] args) {
        Fruit apple=new Fruit("Apple", 50);
        Fruit mango=new Fruit("Mango", 45);
        Fruit orange=new Fruit("Orange", 55);
        Fruit grapes=new Fruit("Grapes",40);
        PFMap p1=new PFMap("John",mango);
        PFMap p2=new PFMap("John",grapes);
        PFMap p3=new PFMap("John",apple);
        PFMap p4=new PFMap("Dave",grapes);
        PFMap p5=new PFMap("Dave",apple);
        PFMap p6=new PFMap("Chris",orange);
        PFMap p7=new PFMap("Chris",grapes);
        List<PFMap> sales=new ArrayList<>();
        sales.add(p1);
        sales.add(p2);
        sales.add(p3);
        sales.add(p4);
        sales.add(p5);
        sales.add(p6);
        sales.add(p7);
        Map<Fruit,List<PFMap>> map=sales.stream().collect(Collectors.groupingBy(PFMap::getFruit));
        List<String> list=map.entrySet().stream().map(f->f.getKey().name+" "+f.getValue().size()*f.getKey().price).toList();
        list.forEach(System.out::println);
    }
}