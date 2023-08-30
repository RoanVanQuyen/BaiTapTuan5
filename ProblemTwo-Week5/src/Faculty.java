import java.util.Scanner;

public class Faculty {
    private String Name ;
    private String Date ;
    private School x ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public Faculty() {
    }
    Scanner Ip= new Scanner(System.in) ;
    public void Input(){
        Name = Ip.next() ;
        Date = Ip.next() ;
        x = new School() ;
        x.setName(Ip.next());
        x.setDate(Ip.next());
    }

    public void Out(){
        System.out.printf("%-12s" , Name);
        System.out.printf("%-18s" , Date);
        System.out.printf("%-12s" ,x.getName());
        System.out.println (x.getDate());
    }
}
