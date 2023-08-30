import java.util.Scanner ;
public class NSX {
    private String maNSX ;
    private String tenNSX ;
    private String dcNSX ;

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDcNSX() {
        return dcNSX;
    }

    public void setDcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

    public NSX(){

    }
    Scanner Ip = new Scanner(System.in)  ;
    public void Input(){
        maNSX = Ip.next() ;
        tenNSX = Ip.next() ;
        dcNSX = Ip.next() ;
    }

    public void Out(){
        System.out.println(maNSX);
        System.out.println(tenNSX);
        System.out.println(dcNSX);
    }
}
