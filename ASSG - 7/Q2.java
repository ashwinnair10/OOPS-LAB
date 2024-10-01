abstract class PlatformUser{
    String name,email,userId;
    PlatformUser(String n,String e,String u){
        name=n;
        email=e;
        userId=u;
    }
    abstract void accessPortal();
    void display(){
        System.out.println("Name: "+name+"\nEmail: "+email+"\nUserID: "+userId);
    }
}
class Student extends PlatformUser{
    Student(String n,String e,String u){
        super(n,e,u);
    }
    @Override
    void accessPortal(){
        System.out.println("--Student Access--");
        display();
    }
    void attendLiveSession(){
        System.out.println("Attending Live Session.");
    }
    void viewRecordedLectures(){
        System.out.println("Viewing Recorded Lectures.");
    }
    void submitAssignment(){
        System.out.println("Submitting Assignment.");
    }
}
class Faculty extends PlatformUser{
    Faculty(String n,String e,String u){
        super(n,e,u);
    }
    @Override
    void accessPortal(){
        System.out.println("--Faculty Access--");
        display();
    }
    void conductLiveSession(){
        System.out.println("Conducting Live Session.");
    }
    void uploadRecordedLecture(){
        System.out.println("Uploading Recorded Lecture.");
    }
    void uploadCourseMaterial(){
        System.out.println("Uploading Course Material.");
    }
    void uploadAssignment(){
        System.out.println("Uploading an Online Assignment for students.");
    }
}
public class Q2{
    public static void main(String[] args) {
        Faculty f=new Faculty("Dr. Smith","smith@university.com","FAC001");
        Student s=new Student("John Doe","john@university.com","STU198");
        f.accessPortal();
        f.conductLiveSession();
        f.uploadAssignment();
        f.uploadCourseMaterial();
        f.uploadRecordedLecture();
        System.out.println();
        s.accessPortal();
        s.attendLiveSession();
        s.viewRecordedLectures();
        s.submitAssignment();
    }
}