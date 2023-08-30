import java.util.Scanner;

public class PhongMay {
    private String ma ;
    private String ten ;
    private Double S  ;

    private QuanLi x ;
    private Integer n ;
    private May[] mays ;

    public May[] getMays() {
        return mays;
    }

    public void setMays(May[] mays) {
        this.mays = mays;
    }
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

    public Double getS() {
        return S;
    }

    public void setS(Double s) {
        S = s;
    }

    public QuanLi getX() {
        return x;
    }

    public void setX(QuanLi x) {
        this.x = x;
    }



    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public PhongMay(){}
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.print("Nhap ma phong : ");
        ma = Ip.next() ;
        System.out.print("Nhap ten phong : ");
        ten = Ip.next() ;
        System.out.print("Nhap vao Dien Tich : ");
        S = Ip.nextDouble() ;
        x = new QuanLi() ;
        x.Input() ;
        System.out.print("Nhap vao so luong may : ");
        n = Ip.nextInt() ;
        mays = new May[n] ;
        System.out.println("nhap vao TT may : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print("May thu " + (i+1) + ":");
            mays[i] = new May() ;
            mays[i].Input() ;
        }
    }
    public void Out(){
        System.out.printf("%-12s" , ma);
        System.out.printf("%-12s" ,ten);
        System.out.println(S);
        x.Out() ;
        for(int i = 0 ; i < n ; i++) {
            mays[i].Out();
        }
    }
}
