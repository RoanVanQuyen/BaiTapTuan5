import java.util.Scanner;

public class QuanLi {
    private String maQL ;
    private String HovaTen  ;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String hovaTen) {
        HovaTen = hovaTen;
    }
    public QuanLi(){

    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.print("Nhap ma Quan Li : ");
        maQL = Ip.next() ;
        System.out.print("Nhap ho va ten quan li : ");
        HovaTen = Ip.next() ;
    }

    public void Out(){
        System.out.printf("%-12s" , maQL);
        System.out.println( HovaTen);
    }
}
