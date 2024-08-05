import java.util.*;
public class Q3 {
    public static void compute(ArrayList<String> a){
        int n=a.size();
        String smallest=a.get(0);
        for(int i=1;i<n;i++){
            if(a.get(i).length()<smallest.length()){
                smallest=a.get(i);
            }
        }
        String sub="",maxsub="";
        for(int i=0;i<smallest.length();i++){
            for(int k=i+1;k<=smallest.length();k++){
                sub=smallest.substring(i,k);
                int flag=0;
                for(int j=0;j<n;j++){
                    if(a.get(j).contains(sub)==false){
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
                if(sub.length()>maxsub.length())
                maxsub=sub;
            }
        }
        if(sub!=""){
            for(int i=0;i<n;i++){
                a.set(i,a.get(i).replaceFirst(maxsub,maxsub.toUpperCase()));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m:");
        int m=sc.nextInt();
        ArrayList<ArrayList<String>> a=new ArrayList<ArrayList<String>>(m);
        for(int i=0;i<m;i++){
            System.out.println("Enter n:");
            int n=sc.nextInt();
            ArrayList<String> al=new ArrayList<String>();
            System.out.println("Enter strings of row "+(i+1)+":");
            for(int j=0;j<n;j++){
                String k=sc.next();
                al.add(k);
            }
            a.add(al);
        }
        for(int i=0;i<m;i++){
            compute(a.get(i));
        }
        System.out.println("Answer:");
        for(int i=0;i<m;i++){
            for(int j=0;j<a.get(i).size();j++){
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
