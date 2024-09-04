import java.util.*;
interface ShapeArea{
    double area(double x);
}
class Circle implements ShapeArea{
    public double area(double x){
        return 3.14*x*x;
    }
}
class Square implements ShapeArea{
    public double area(double x){
        return x*x;
    }
}
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        double x=sc.nextDouble();
        if(s.equals("Circle")){
            Circle c=new Circle();
            System.out.println(c.area(x));
        }
        if(s.equals("Square")){
            Square sq=new Square();
            System.out.println(sq.area(x));
        }
        sc.close();
    }
}