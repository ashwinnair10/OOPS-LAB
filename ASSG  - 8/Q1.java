import java.util.*;
interface Person{
    String getName();
    String getID();
}
interface Student{
    ArrayList<MealPLAN> getSubsribedMealPLans();
    void subscribeMealPlan(MealPLAN m);
    void unsubscribeMealPlan(MealPLAN m);
}
interface MealPlan{
    String getPlanName();
    ArrayList<MenuItem> getMenuItems();
    double getPrice();
}
class MealPLAN implements MealPlan{
    private final String planName;
    private ArrayList<MenuItem> menuItems=new ArrayList<MenuItem>();
    private double price;
    MealPLAN(String pn,double p){
        planName=pn;
        price=p;
    }
    public String getPlanName(){
        return planName;
    }
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
    public double getPrice(){
        return price;
    }
    void addMenuItem(MenuItem m){
        menuItems.add(m);
        price+=m.getPrice();
    }
}
class MenuItem{
    private final String itemName;
    private final double price;
    MenuItem(String i,double p){
        itemName=i;
        price=p;
    }
    double getPrice(){
        return price;
    }
    String getItemName(){
        return itemName;
    }
}
class StudentImpl implements Person,Student{
    private final String name;
    private final String id;
    private ArrayList<MealPLAN> mealplans=new ArrayList<>();
    StudentImpl(String n,String i){
        name=n;
        id=i;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public void subscribeMealPlan(MealPLAN m){
        mealplans.add(m);
    }
    public void unsubscribeMealPlan(MealPLAN m){
        for(int i=0;i<mealplans.size();i++){
            if(mealplans.get(i)==m){
                mealplans.remove(i);
                return;
            }
        }
    }
    public ArrayList<MealPLAN> getSubsribedMealPLans(){
        return mealplans;
    }
}
class MessController{
    ArrayList<MealPLAN> mealplans=new ArrayList<>();
    void addMealPlan(MealPLAN m){
        mealplans.add(m);
    }
    void subscribeStudentToMealPlan(StudentImpl s,MealPLAN m){
        s.subscribeMealPlan(m);
    }
    void unsubscribeStudentFromMealPlan(StudentImpl s,MealPLAN m){
        s.unsubscribeMealPlan(m);
    }
    void printSubscriptionStatus(StudentImpl s){
        System.out.println(s.getName()+" "+s.getID());
        ArrayList<MealPLAN> a=s.getSubsribedMealPLans();
        if(a.size()==0)
        return;
        System.out.println("Subscribed Meal Plans:");
        for(int i=0;i<a.size();i++){
            System.out.println((i+1)+" : " +a.get(i).getPlanName()+" "+a.get(i).getPrice());
            ArrayList<MenuItem> b=a.get(i).getMenuItems();
            if(b.size()==0)
            continue;
            for(int j=0;j<b.size();j++){
                System.out.println("    > "+b.get(j).getItemName()+" "+b.get(j).getPrice());
            }
        }
    }
}
public class Q1{
    public static void main(String[] args) {
        MessController controller = new MessController();
        MealPLAN vegetarianPlan = new MealPLAN("Vegetarian Plan", 10.0);
        vegetarianPlan.addMenuItem(new MenuItem("Salad", 5.0));
        vegetarianPlan.addMenuItem(new MenuItem("Fruit", 3.0));
        controller.addMealPlan(vegetarianPlan);
        StudentImpl student1 = new StudentImpl("Alice", "S001");
        controller.subscribeStudentToMealPlan(student1, vegetarianPlan);
        controller.printSubscriptionStatus(student1);
    }
}