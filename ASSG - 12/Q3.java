import java.util.*;
interface Shape{
    public void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}
interface ShapeFactory{
    Shape factory();
}
class CircleFactory implements ShapeFactory{
    public Shape factory(){
        return new Circle();
    }
}
class RectangleFactory implements ShapeFactory{
    public Shape factory(){
        return new Rectangle();
    }
}
class TriangleFactory implements ShapeFactory{
    public Shape factory(){
        return new Triangle();
    }
}
public class Q3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        switch(s){
            case "circle"->new CircleFactory().factory().draw();
            case "rectangle"->new RectangleFactory().factory().draw();
            case "triangle"->new TriangleFactory().factory().draw();
            default->System.out.println("Invalid shape");
        }
        sc.close();
    }
}