import java.util.Scanner;

public class Hang {
    private String maHang ;
    private String tenHang ;
    private NSX x ;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
    public Hang(){
    }


    Scanner Ip = new Scanner(System.in) ;
    public void Nhap(){
        maHang = Ip.next() ;
        tenHang = Ip.next() ;
        x = new NSX() ;
        x.Input();
    }

    public void Out(){
        System.out.println(maHang);
        System.out.println(tenHang);
        x.Out();
    }
}
