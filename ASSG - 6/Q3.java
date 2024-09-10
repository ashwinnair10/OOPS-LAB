class Student{
    String name;
    Student(String n){
        name=n;
    }
    void formatName(){
        String n="";
        for(int i=0;i<name.length();i++){
            n=name.charAt(i)+n;
        }
        System.out.println("Reversed Name: "+n);
    }
    void countVowel(){
        int c=0;
        String n=name.toLowerCase();
        for(int i=0;i<name.length();i++){
            char a=n.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            c++;
        }
        System.out.println("Vowel Count: "+c);
    }
    void checkPalindrome(){
        String n=name.toLowerCase();
        for(int i=0;i<name.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                System.out.println("Palindrome Check: False");
                return;
            }
        }
        System.out.println("Palindrome Check: True");
    }
}
class NITCalicutStudent extends Student{
    String dept,rollno;
    NITCalicutStudent(String n,String d,String r){
        super(n);
        dept=d;
        rollno=r;
    }
    @Override
    void formatName(){
        String n="";
        for(int i=0;i<name.length();i++){
            n=name.charAt(i)+n;
        }
        n=n+" (NIT Calicut)";
        System.out.println("Reversed Name with Tag: "+n);
    }
    void displayDetails(){
        System.out.println("Student Details: "+name+" - Department: "+dept+", Roll NUmber: "+rollno);
    }
}
public class Q3{
    public static void main(String[] args) {
        Student s1=new Student("Rajesh");
        NITCalicutStudent s2=new NITCalicutStudent("Aziza", "Computer Science", "CS12");
        s1.formatName();
        s1.countVowel();
        s1.checkPalindrome();
        System.out.println();
        s2.formatName();
        s2.countVowel();
        s2.checkPalindrome();
        s2.displayDetails();
    }
}