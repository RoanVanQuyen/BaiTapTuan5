import java.util.Scanner;

public class May {
    private String ma ;
    private String ten ;
    private String tinhtrang ;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    public May(){}
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.println("Nhap TT may theo : ma may + ten may + tinh trang");
        ma = Ip.next() ;
        ten = Ip.next() ;
        tinhtrang = Ip.next() ;
    }

    public void Out(){
        System.out.printf("%-12s" , ma);
        System.out.printf("%-12s" , ten);
        System.out.println(tinhtrang) ;
    }
}
