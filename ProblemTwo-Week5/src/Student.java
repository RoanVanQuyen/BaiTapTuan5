import java.util.Scanner;

public class Student {
    private String Name ;
    private String Class;
    private double score ;
    private Faculty y ;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public Student(){
    }
    Scanner Ip = new Scanner(System.in);
    public void Input(){
        Name = Ip.next() ;
        Class = Ip.next() ;
        score = Ip.nextDouble() ;
        y = new Faculty();
        y.Input() ;
    }

    public void Out(){
        System.out.printf("%-18s" , Name) ;
        System.out.printf("%-12s" , Class);
        System.out.printf("%-14f" , score);
        y.Out() ;
    }
}
//    RoanVanQuyen KTPM01 3,23
//        CNTT 19/10/2022
//        HAUI  10/10/2022