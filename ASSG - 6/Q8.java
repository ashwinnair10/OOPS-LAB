//correct this code- change event to interface
import java.util.*;
interface Event{
    abstract String getEventName();
    abstract void displayDetails();
    int getAvailableTickets();
    void bookTickets(int t);
    void cancelTickets(int t);
}
class Concert implements Event{
    String eventName;
    int totalTickets;
    int availableTickets;
    String performer;
    Concert(String e,int t,String p){
        eventName=e;
        totalTickets=t;
        availableTickets=t;
        performer=p;
    }
    public String getEventName(){
        return eventName;
    }
    public void displayDetails(){
        System.out.println("Event Name: "+eventName+" Performer: "+performer+" Total Tickets: "+totalTickets+" Available Tickets: "+availableTickets);
    }
    public int getAvailableTickets(){
        return availableTickets;
    }
    public void bookTickets(int t){
        if(t>availableTickets){
            System.out.println("Requested number of tickets unavailable");
            return;
        }
        availableTickets-=t;
        System.out.println("Tickets booked successfully");
    }
    public void cancelTickets(int t){
        if(availableTickets+t>totalTickets){
            System.out.println("Invalid");
            return;
        }
        availableTickets+=t;
        System.out.println("Tickets cancelled successfully");
    }
}
class TheaterPlay implements Event{
    String eventName;
    int totalTickets;
    int availableTickets;
    String director;
    TheaterPlay(String e,int t,String d){
        eventName=e;
        totalTickets=t;
        availableTickets=t;
        director=d;
    }
    public String getEventName(){
        return eventName;
    }
    public void displayDetails(){
        System.out.println("Event Name: "+eventName+" Director: "+director+" Total Tickets: "+totalTickets+" Available Tickets: "+availableTickets);
    }
    public int getAvailableTickets(){
        return availableTickets;
    }
    public void bookTickets(int t){
        if(t>availableTickets){
            System.out.println("Requested number of tickets unavailable");
            return;
        }
        availableTickets-=t;
        System.out.println("Tickets booked successfully");
    }
    public void cancelTickets(int t){
        if(availableTickets+t>totalTickets){
            System.out.println("Invalid");
            return;
        }
        availableTickets+=t;
        System.out.println("Tickets cancelled successfully");
    }
}
class SportsGame implements Event{
    String eventName;
    int totalTickets;
    int availableTickets;
    String teamNames;
    SportsGame(String e,int t,String s){
        eventName=e;
        totalTickets=t;
        availableTickets=t;
        teamNames=s;
    }
    public String getEventName(){
        return eventName;
    }
    public void displayDetails(){
        System.out.println("Event Name: "+eventName+" TeamNames: "+teamNames+" Total Tickets: "+totalTickets+" Available Tickets: "+availableTickets);
    }
    public int getAvailableTickets(){
        return availableTickets;
    }
    public void bookTickets(int t){
        if(t>availableTickets){
            System.out.println("Requested number of tickets unavailable");
            return;
        }
        availableTickets-=t;
        System.out.println("Tickets booked successfully");
    }
    public void cancelTickets(int t){
        if(availableTickets+t>totalTickets){
            System.out.println("Entered number of tickets cannot be cancelled");
            return;
        }
        availableTickets+=t;
        System.out.println("Tickets cancelled successfully");
    }
}
class EventManager{
    ArrayList<Event> events=new ArrayList<Event>();
    void addEvent(Event e){
        events.add(e);
    }
    void bookEventTickets(String name,int tickets){
        for(int i=0;i<events.size();i++){
            if(events.get(i).getEventName().equals(name)){
                events.get(i).bookTickets(tickets);
                return;
            }
        }
        System.out.println("No such event found");
    }
    void cancelEventTickets(String name,int tickets){
        for(int i=0;i<events.size();i++){
            if(events.get(i).getEventName().equals(name)){
                events.get(i).cancelTickets(tickets);
                return;
            }
        }
        System.out.println("No such event found");
    }
    void displayAllEvents(){
        for(int i=0;i<events.size();i++)
        events.get(i).displayDetails();
    }
}
public class Q8{
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Event concert = new Concert("Summer Music Festival", 100, "The Jazz Band");
        Event play = new TheaterPlay("Shakespeare's Hamlet", 50, "John Doe");
        Event sports = new SportsGame("City Derby", 200, "Team A vs Team B");
        manager.addEvent(concert); manager.addEvent(play);
        manager.addEvent(sports);
        manager.bookEventTickets("Summer Music Festival", 10);
        manager.cancelEventTickets("Shakespeare's Hamlet", 5);
        manager.displayAllEvents();
    }
}