class Logger{
    private static Logger obj=new Logger();
    private Logger(){}
    public static Logger getInstance(){
        return obj;
    }
    public String logging(char c){
        return switch(c){
            case 'W'->"WARNING";
            case 'E'->"ERROR";
            case 'F'->"FATAL";
            default->"DEFAULT";
        };
    }
}
public class Q1{
    public static void main(String[] args) {
        Logger obj=Logger.getInstance();
        System.out.println(obj.logging('E'));
        System.out.println(obj.logging('W'));
        System.out.println(obj.logging('F'));
    }
}