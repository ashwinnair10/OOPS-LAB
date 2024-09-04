import java.util.*;
interface SortVotes{
    void ascendDisplay();
    void descendDisplay();
}
class ElectionPost implements SortVotes{
    String nameOfThePost;
    HashMap<String,Integer> map=new HashMap<>();
    ArrayList<String> listOfCandidates=new ArrayList<>();
    ArrayList<String> votesEntered=new ArrayList<>();
    public void addCandid(String s){
        listOfCandidates.add(s);
    }
    public void addVote(String s){
        votesEntered.add(s);
    }
    public void display(){
        System.out.println(nameOfThePost);
        Collections.sort(listOfCandidates);
        for(int i=0;i<listOfCandidates.size();i++)
        System.out.println(listOfCandidates.get(i));
    }
    public void countVotes(){
        for(int i=0;i<votesEntered.size();i++){
            if(map.containsKey(votesEntered.get(i))==false){
                map.put(votesEntered.get(i),1);
            }
            else{
                map.put(votesEntered.get(i),map.get(votesEntered.get(i))+1);
            }
        }
    }
    public void ascendDisplay(){
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, 
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" - "+list.get(i).getValue());
        }
    }
    public void descendDisplay(){
        List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String,Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" - "+list.get(i).getValue());
        }
    }
}
public class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ElectionPost o=new ElectionPost();
        o.nameOfThePost=sc.nextLine();
        int num=sc.nextInt();
        sc.nextLine();
        String s;
        while(num>0){
            s=sc.nextLine();
            o.addCandid(s);
            num--;
        }
        num=sc.nextInt();
        sc.nextLine();
        while(num>0){
            s=sc.nextLine();
            o.addVote(s);
            num--;
        }
        o.countVotes();
        o.display();
        o.ascendDisplay();
        o.descendDisplay();
        sc.close();
    }
}
